package org.example.writer;

import org.example.dto.Response;
import org.example.dto.TextComponent;

public class ConsoleWriter implements Writer {
    @Override
    public void write(Response response) {
        System.out.println(response.getComponent(TextComponent.class));
    }

    @Override
    public void printAnswer(Response response) {

    }
}