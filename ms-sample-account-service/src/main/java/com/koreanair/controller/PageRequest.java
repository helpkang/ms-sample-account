package com.koreanair.controller;

import org.springframework.data.domain.Sort;

import lombok.ToString;

@ToString
public final class PageRequest {
    
    private int page = 1;

    private int size = 20;

    private Sort.Direction direction = Sort.Direction.ASC;
    
    public void setPage(int page) {
        this.page = page <= 0 ? 1 : page;
    }
    
    public void setSize(int size) {
        int DEFAULT_SIZE = 10;
        int MAX_SIZE = 50;
        this.size = size > MAX_SIZE ? DEFAULT_SIZE : size;
    }

    public void setDirection(Sort.Direction direction) {
        this.direction = direction;
    }
    
    public org.springframework.data.domain.PageRequest of() {
        return org.springframework.data.domain.PageRequest.of(page -1, size);
    }

}