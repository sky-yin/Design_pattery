package com.yin.service;

public class Before implements AbstractFactory {
    @Override
    public Food get() {
        return new BeforeFood();
    }
}
