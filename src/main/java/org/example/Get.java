package org.example;

import java.util.Scanner;

public class Get {

    public String inputData;

    public void getConsoleIn()
    {
        Scanner scanner = new Scanner(System.in);
        inputData = scanner.nextLine();
    }
}