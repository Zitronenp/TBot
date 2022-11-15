package org.example.writer;

import org.example.Response;

public class ConsoleWriter implements Writer {
    @Override
    public void printAnswer(Response response) {
        System.out.println(response.data());
    }
}