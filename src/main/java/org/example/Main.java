package org.example;

public class Main {
    public static void main(String[] args) {
        Get input = new Get();
        while(true) {
            input.getConsoleIn();

            Data processing = new Data(input.inputData);

            Out out = new Out(processing.data);
            out.consPrint();
        }

    }
}