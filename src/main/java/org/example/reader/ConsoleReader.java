package org.example.reader;

import org.example.dto.Request;
import org.example.dto.TextComponent;

import java.util.Scanner;

public class ConsoleReader implements Reader {
    @Override
    public Request read() {
        Scanner scanner = new Scanner(System.in);
        Request request = new Request();
        TextComponent textComponent = new TextComponent(scanner.nextLine());
        request.addComponent(textComponent);
        return request;
    }

    @Override
    public Request readRequest() {
        return null;
    }
}