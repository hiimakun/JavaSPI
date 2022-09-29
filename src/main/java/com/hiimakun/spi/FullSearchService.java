package com.hiimakun.spi;

import java.util.List;

public class FullSearchService implements SearchService {

    @Override
    public List<Result> search(String text) {
        System.out.println("FullSearchService#search()");
        return null;
    }
}