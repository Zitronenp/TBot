package org.example.handler;

import org.example.Request;
import org.example.Response;

public interface Handler {
    Response requestHandler(Request request);
}

