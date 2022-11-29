package org.example.handler;

import org.example.dto.MetaData;
import org.example.dto.Response;
import org.example.dto.Request;
import org.example.dto.TextComponent;

public class SimpleHandler implements Handler {
    public Response handleRequest(Request request) {
        Response response = new Response();
        TextComponent textComponent = new TextComponent(request.getComponent(TextComponent.class));
        response.addComponent(textComponent);

        MetaData metaData = new MetaData(request.getComponent(MetaData.class));
        response.addComponent(metaData);
        return response;

    }

    @Override
    public Response requestHandler(Request request) {
        return null;
    }
}