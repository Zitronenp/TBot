package org.example.handler;

import org.example.dto.MetaData;
import org.example.dto.Request;
import org.example.dto.Response;
import org.example.dto.TextComponent;

public class TelegramHandler implements Handler {
    @Override
    public Response handleRequest(Request request) {
        String text;

        if (request.getComponent(TextComponent.class).getText() == null) {
            text = "I didn't understand you, use text messages";
        }
        else if (request.getComponent(TextComponent.class).getText().startsWith("/start")) {
            text = "I do not know what I was created for";
        }
        else {
            text = request.getComponent(TextComponent.class).getText();
        }
        TextComponent textComponent = new TextComponent(text);
        Response response = new Response();
        response.addComponent(textComponent);
        MetaData metaData = request.getComponent(MetaData.class);
        response.addComponent(metaData);

        return response;
    }

    @Override
    public Response requestHandler(Request request) {
        return null;
    }
}
