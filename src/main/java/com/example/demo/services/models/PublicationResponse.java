package com.example.demo.services.models;

import java.util.Objects;

public class PublicationResponse {
    private String labelLang;
    private String responseDate;
    private Paging paging;
    private Content[] content;

    public String getLabelLang() { return labelLang; }

    public PublicationResponse setLabelLang(String labelLang) {
        this.labelLang = labelLang;
        return this;
    }

    public String getResponseDate() { return responseDate; }

    public PublicationResponse setResponseDate(String responseDate) {
        this.responseDate = responseDate;
        return this;
    }

    public Paging getPaging() { return paging; }

    public PublicationResponse setPaging(Paging paging) {
        this.paging = paging;
        return this;
    }

    public Content[] getContent() { return content; }

    public PublicationResponse setContent(Content[] content) {
        this.content = content;
        return this;
    }
}
