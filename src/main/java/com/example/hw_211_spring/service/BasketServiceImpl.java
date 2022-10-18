package com.example.hw_211_spring.service;

import com.example.hw_211_spring.model.Basket;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import java.util.Set;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {
    private Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @PostConstruct
    public void init() {
        System.out.println("Service is here!!!");
    }

    @Override
    public void add(Set<Integer> itemIds) {
        if (basket == null) {
            Basket basket = new Basket();
        }
        basket.add(itemIds);
    }

    @Override
    public Set<Integer> get() {
        return basket.getItemIds();
    }
}
