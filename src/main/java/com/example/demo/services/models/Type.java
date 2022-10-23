package com.example.demo.services.models;

public class Type {
    private String otype;
    private int mtid;
    private String link;
    private String label;
    private int code;
    private String otypeName;
    private boolean published;

    public Type setOtype(String otype) {
        this.otype = otype;
        return this;
    }

    public Type setMtid(int mtid) {
        this.mtid = mtid;
        return this;
    }

    public Type setLink(String link) {
        this.link = link;
        return this;
    }

    public Type setLabel(String label) {
        this.label = label;
        return this;
    }

    public Type setCode(int code) {
        this.code = code;
        return this;
    }

    public Type setOtypeName(String otypeName) {
        this.otypeName = otypeName;
        return this;
    }

    public Type setPublished(boolean published) {
        this.published = published;
        return this;
    }

    public String getOtype() {
        return otype;
    }

    public int getMtid() {
        return mtid;
    }

    public String getLink() {
        return link;
    }

    public String getLabel() {
        return label;
    }

    public int getCode() {
        return code;
    }

    public String getOtypeName() {
        return otypeName;
    }

    public boolean isPublished() {
        return published;
    }
}
