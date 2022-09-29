package com.hiimakun.spi;

import java.util.ServiceLoader;

public class ServiceLoaderExample {
    public static void main(String[] args) {
        System.out.println("App started ");

        ServiceLoader<SearchService> serviceLoader = ServiceLoader.load(SearchService.class);
        for (SearchService provider : serviceLoader) {
            provider.search("");
        }

        System.out.println("App finished ");
    }
}