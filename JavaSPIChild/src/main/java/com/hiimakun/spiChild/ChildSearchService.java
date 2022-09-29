package com.hiimakun.spiChild;
import java.util.List;

import com.hiimakun.spi.Result;
import com.hiimakun.spi.SearchService;

public class ChildSearchService implements SearchService {

    @Override
    public List<Result> search(String text) {
        System.out.println("Child1SearchService#search()");
        return null;
    }
}