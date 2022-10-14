package com.example.hw_211_spring.service;

import java.util.Set;

public interface BasketService {
    void add(Set<Integer> itemIds);
    Set<Integer> get();
}
