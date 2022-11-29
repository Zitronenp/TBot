package org.example.telegramBot;

import org.example.dto.MetaData;
import org.example.dto.Request;
import org.example.dto.Response;
import org.example.dto.TextComponent;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

public class TelegramDataConverter {
    public Request read(Update update) {
        var msg = update.getMessage();
        MetaData metaData = new MetaData(msg);
        Request request = new Request();
        TextComponent textComponent = new TextComponent(msg.getText());
        request.addComponent(textComponent);
        request.addComponent(metaData);

        return request;
    }
    public SendMessage createMessage(Response response) {
        Long who = response.getComponent(MetaData.class).getFromId();

        return SendMessage.builder()
                .chatId(who.toString())
                .text(response.getComponent(TextComponent.class).getText()).build();
    }
}
