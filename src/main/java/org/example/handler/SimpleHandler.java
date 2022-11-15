package org.example.handler;

import org.example.Request;
import org.example.Response;

public class SimpleHandler implements Handler {
    public Response requestHandler(Request request) {
        return new Response(request.data());
    }
}
