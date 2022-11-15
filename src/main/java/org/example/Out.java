package org.example;

import java.util.Scanner;

public class Out {

    public String outputData;

    public Out() {}
    public Out(String data)
    {
        outputData = data;
    }

    public void consPrint()
    {
        System.out.println(outputData);
    }
}
