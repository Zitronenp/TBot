package org.example.reader;

import org.example.dto.Request;

public interface Reader {

    Request read();

    Request readRequest();
}
