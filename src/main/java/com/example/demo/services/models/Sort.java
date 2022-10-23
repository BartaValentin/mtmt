package com.example.demo.services.models;

public class Sort {
    private String direction;
    private String property;
    private boolean ascending;

    public String getDirection() { return direction; }

    public Sort setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public String getProperty() { return property; }

    public Sort setProperty(String property) {
        this.property = property;
        return this;
    }

    public boolean getAscending() { return ascending; }

    public Sort setAscending(boolean ascending) {
        this.ascending = ascending;
        return this;
    }
}
