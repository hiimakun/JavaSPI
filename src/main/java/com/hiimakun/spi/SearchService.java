package com.hiimakun.spi;
import java.util.List;

public interface SearchService {
    List<Result> search(String text);
}
