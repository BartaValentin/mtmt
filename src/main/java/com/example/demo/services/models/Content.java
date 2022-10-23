package com.example.demo.services.models;

public class Content {
    private String otype;
    private int mtid;
    private String status;
    private boolean published;
    private boolean deleted;
    private Type type;
    private SubType subType;
    private Category category;
    private String link;
    private String label;

    public Content setOtype(String otype) {
        this.otype = otype;
        return this;
    }

    public String getOtype() { return otype; }

    public Content setMtId(int mtid) {
        this.mtid = mtid;
        return this;
    }

    public int getMtid() { return mtid; }

    public Content setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() { return status; }

    public Content setPublished(boolean published) {
        this.published = published;
        return this;
    }

    public boolean getPublished() { return published; }

    public Content setDeleted(boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public boolean getDeleted() { return deleted; }

    public Content setMtid(int mtid) {
        this.mtid = mtid;
        return this;
    }

    public Type getType() {
        return type;
    }

    public Content setType(Type type) {
        this.type = type;
        return this;
    }

    public SubType getSubType() {
        return subType;
    }

    public Content setSubType(SubType subType) {
        this.subType = subType;
        return this;
    }

    public Category getCategory() {
        return category;
    }

    public Content setCategory(Category category) {
        this.category = category;
        return this;
    }

    public String getLink() {
        return link;
    }

    public Content setLink(String link) {
        this.link = link;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public Content setLabel(String label) {
        this.label = label;
        return this;
    }
}

class Category {
    private String otype;
    private int mtid;
    private String link;
    private String label;
    private boolean published;

    public String getOtype() {
        return otype;
    }

    public Category setOtype(String otype) {
        this.otype = otype;
        return this;
    }

    public int getMtid() {
        return mtid;
    }

    public Category setMtid(int mtid) {
        this.mtid = mtid;
        return this;
    }

    public String getLink() {
        return link;
    }

    public Category setLink(String link) {
        this.link = link;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public Category setLabel(String label) {
        this.label = label;
        return this;
    }

    public boolean isPublished() {
        return published;
    }

    public Category setPublished(boolean published) {
        this.published = published;
        return this;
    }
}
