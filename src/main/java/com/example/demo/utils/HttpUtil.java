package com.example.demo.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class HttpUtil {

    public static Response execute(OkHttpClient httpClient, Request request) throws IOException {
        Response response = httpClient.newCall(request).execute();
        if (!response.isSuccessful()) {
            String errorMessage = String.format(
                    "Received a non-successful response for http request (%s %s). Response status: %d %s, response body: \n%s",
                    request.method(),
                    request.url(),
                    response.code(),
                    response.message(),
                    response
            );
            throw new RuntimeException(errorMessage);
        }
        return response;
    }
}
