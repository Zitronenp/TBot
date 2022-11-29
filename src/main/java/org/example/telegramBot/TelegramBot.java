package org.example.telegramBot;

import org.example.Main;
import org.example.dto.Request;
import org.example.dto.Response;
import org.example.handler.SimpleHandler;
import org.example.handler.TelegramHandler;
import org.example.writer.Writer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TelegramBot extends TelegramLongPollingBot implements Writer {
    SimpleHandler simpleHandler;
    TelegramDataConverter converter;

    public TelegramBot() {
        converter = new TelegramDataConverter();
        simpleHandler = new SimpleHandler();
    }

    public static final String botName = "RomanceClubGuides";

    @Override
    public String getBotUsername() {
        return botName;
    }

    @Override
    public String getBotToken() {
        return Main.getTkFromProperty("config.properties");
    }

    @Override
    public void onUpdateReceived(Update update) {
        Request request = converter.read(update);
        Response response = simpleHandler.handleRequest(request);
        write(response);
    }

    public void write(Response response) {
        SendMessage message = converter.createMessage(response);
        try {
            execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void printAnswer(Response response) {

    }
}
