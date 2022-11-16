package org.example;

import org.example.reader.ConsoleReader;
import org.example.reader.Reader;
import org.example.writer.ConsoleWriter;
import org.example.writer.Writer;
import org.example.handler.Handler;
import org.example.handler.SimpleHandler;

public class Main {
    public static void main(String[] args) {
        Writer writer = new ConsoleWriter();
        Reader reader = new ConsoleReader();
        Handler handler = new SimpleHandler();
        while (true) {
            Request message = reader.readRequest();
            Response response = handler.requestHandler(message);
            writer.printAnswer(response);
        }
    }





}