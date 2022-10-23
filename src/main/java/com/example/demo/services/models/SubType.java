package com.example.demo.services.models;

public class SubType {
    private String otype;
    private int mtid;
    private String link;
    private String label;
    private boolean snippet;

    public String getOtype() {
        return otype;
    }

    public SubType setOtype(String otype) {
        this.otype = otype;
        return this;
    }

    public int getMtid() {
        return mtid;
    }

    public SubType setMtid(int mtid) {
        this.mtid = mtid;
        return this;
    }

    public String getLink() {
        return link;
    }

    public SubType setLink(String link) {
        this.link = link;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public SubType setLabel(String label) {
        this.label = label;
        return this;
    }

    public boolean isSnippet() {
        return snippet;
    }

    public SubType setSnippet(boolean snippet) {
        this.snippet = snippet;
        return this;
    }
}
