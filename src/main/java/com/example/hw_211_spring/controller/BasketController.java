package com.example.hw_211_spring.controller;

import com.example.hw_211_spring.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/order")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/add")
    public void addItem(@RequestParam(value = "ids") Set<Integer> itemIds) {
        basketService.add(itemIds);
    }

    @GetMapping(path = "/get")
    public Object getItems() {
        return basketService.get();
    }
}
