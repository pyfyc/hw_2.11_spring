package com.example.hw_211_spring.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Set;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {
    private final Set<Integer> items;

    public BasketServiceImpl(Set<Integer> items) {
        this.items = items;
    }

    @Override
    public void add(Set<Integer> itemIds) {
        for (Integer itemId : itemIds) {
            items.add(itemId);
        }
    }

    @Override
    public Set<Integer> get() {
        return items;
    }
}
