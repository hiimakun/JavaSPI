package com.hiimakun.spi;

import java.util.List;

public class DefaultSearchService implements SearchService {

    @Override
    public List<Result> search(String text) {
        System.out.println("DefaultSearchService#search()");
        return null;
    }
}