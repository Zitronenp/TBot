package org.example.writer;

import org.example.dto.Response;

public interface Writer {
    void write(Response response);

    void printAnswer(Response response);
}

