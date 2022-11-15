package org.example.reader;

import org.example.Request;

import java.util.Scanner;

public class ConsoleReader implements Reader {
    @Override
    public Request readRequest() {
        Scanner scanner = new Scanner(System.in);

        return new Request(scanner.nextLine());
    }
}
