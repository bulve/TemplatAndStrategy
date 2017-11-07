package com.company.Strategy;

public class EnglishLanguageStrategy implements GreeterLanguageStrategy {
    @Override
    public String getGreeterStategy() {
        return "Hello";
    }
}
