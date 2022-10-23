package com.example.demo.controllers;

import com.example.demo.services.models.PublicationResponse;
import com.example.demo.services.PublicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class PublicationController {
    private final PublicationService publicationService;

    public PublicationController(PublicationService publicationService) {
        this.publicationService = publicationService;
    }

    @GetMapping("/")
    public PublicationResponse index() throws IOException {
        return publicationService.getPublications();
    }
}
