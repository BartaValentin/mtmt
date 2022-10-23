package com.example.demo.services.models;

public class Content {
    private String otype;
    private int mtid;
    private String status;
    private boolean published;
    private boolean deleted;
    private PublicationCreator creator;

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

    public Content setCreator(PublicationCreator creator) {
        this.creator = creator;
        return this;
    }

    public PublicationCreator getCreator() { return creator; }
}
