package org.example;

import org.example.telegramBot.TelegramBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static String getTkFromProperty(String fileName) {
        FileInputStream fis;
        Properties property = new Properties();

        try {
            fis = new FileInputStream("src/main/resources/" + fileName);
            property.load(fis);
            fis.close();
        } catch (IOException e) {
            System.err.println("file not found!");
        }

        return property.getProperty("token");
    }

    public static void startTgBot() throws TelegramApiException {
        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
        TelegramBot bot = new TelegramBot();
        botsApi.registerBot(bot);
    }

    public static void main(String[] args) throws TelegramApiException {
        startTgBot();
    }
}

