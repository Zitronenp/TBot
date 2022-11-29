package org.example.handler;

import org.example.dto.Request;
import org.example.dto.Response;

public interface Handler {
    Response handleRequest(Request request);

    Response requestHandler(Request request);
}

