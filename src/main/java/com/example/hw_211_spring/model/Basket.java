package com.example.hw_211_spring.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
@SessionScope
public class Basket {
    private Set<Integer> itemIds;

    public Basket() {
        this.itemIds = new HashSet<>();
    }

    @PostConstruct
    public void init() {
        System.out.println("Basket class is here!!!");
    }

    public void add(Set<Integer> itemIds) {
        for (Integer itemId : itemIds) {
            this.itemIds.add(itemId);
        }
    }

    public Set<Integer> getItemIds() {
        return itemIds;
    }
}
