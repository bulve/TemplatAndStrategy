package com.company.Strategy;

public class Greeter {

    GreeterLanguageStrategy greeterLanguageStrategy;
    Punctuation punctuation;

    public Greeter(GreeterLanguageStrategy greeterLanguageStrategy, Punctuation punctuation){
        this.greeterLanguageStrategy = greeterLanguageStrategy;
        this.punctuation = punctuation;
    }

    public void greet(String firstName, String lastName){
        System.out.println(greeterLanguageStrategy.getGreeterStategy() + " " + firstName + ", " + lastName + " " + punctuation.getPunctuation());
    }

}
