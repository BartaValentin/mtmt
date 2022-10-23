package com.example.demo.services.models;

public class Paging {
    private boolean last;
    private boolean first;
    private int totalPages;
    private int totalElements;
    private int totalEstimatedElements;
    private int size;
    private int number;
    private int numberOfElements;
    private Sort[] sort;

    public Paging setLast(boolean last) {
        this.last = last;
        return this;
    }

    public boolean getLast() { return last; }

    public Paging setFirst(boolean first) {
        this.first = first;
        return this;
    }

    public boolean getFirst() { return first; }

    public Paging setTotalPages(int totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    public int getTotalPages() { return totalPages; }

    public Paging setTotalElements(int totalElements) {
        this.totalElements = totalElements;
        return this;
    }

    public int getTotalElements() { return totalElements; }

    public Paging setTotalEstimatedElements(int totalEstimatedElements) {
        this.totalEstimatedElements = totalEstimatedElements;
        return this;
    }

    public int getTotalEstimatedElements() { return totalEstimatedElements; }

    public Paging setSize(int size) {
        this.size = size;
        return this;
    }

    public int getSize() { return size; }

    public Paging setNumber(int number) {
        this.number = number;
        return this;
    }

    public int getNumber() { return number; }

    public Paging setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
        return this;
    }

    public int getNumberOfElements() { return numberOfElements; }

    public Paging setSort(Sort[] sort) {
        this.sort = sort;
        return this;
    }

    public Sort[] getSort() { return sort; }
}
