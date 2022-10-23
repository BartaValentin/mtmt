package com.example.demo.services;

import com.example.demo.exceptions.PublicationException;
import com.example.demo.services.models.PublicationResponse;
import com.example.demo.utils.HttpUtil;
import com.example.demo.utils.JsonPojoConverter;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class HttpClientService {
    public PublicationResponse getPublications() {
        try {
            HttpUrl url = HttpUrl.parse("https://m2.mtmt.hu/api").newBuilder()
                    .addPathSegment("publication")
                    .addQueryParameter("cond", "labelOrMtid;eq;fuzzy")
                    .addQueryParameter("sort", "firstAuthor,asc")
                    .build();

            Request httpRequest = new Request.Builder()
                    .url(url)
                    .get()
                    .build();

            String responseBody = executeAndGetString(httpRequest);

            return JsonPojoConverter.unmarshal(responseBody, PublicationResponse.class);
        } catch (Exception e) {
            throw new PublicationException("Get publications failed", e);
        }
    }

    private String executeAndGetString(Request request) throws IOException {
        OkHttpClient httpClient = new OkHttpClient();
        try (Response response = HttpUtil.execute(httpClient, request)) {
            return response.body().string();
        }
    }
}
