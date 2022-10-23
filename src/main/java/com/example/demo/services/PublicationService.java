package com.example.demo.services;

import com.example.demo.services.models.PublicationResponse;
import org.springframework.stereotype.Service;

@Service
public class PublicationService {
    private final HttpClientService httpClient;

    public PublicationService(HttpClientService httpClient) {
        this.httpClient = httpClient;
    }

    public PublicationResponse getPublications(String pageNumber) {
        return httpClient.getPublications(pageNumber);
    }
}
