package com.company.Template;

import com.company.Strategy.Ellipises;
import com.company.Strategy.EnglishLanguageStrategy;
import com.company.Strategy.LithuanianGreetingStrategy;
import com.company.Template.Greeter;
import com.company.Template.LithuanianGreeter;

public class Main {

    public static void main(String[] args) {

//        Greeter greeterLt = new LithuanianGreeter();
//        greeterLt.greet("Antanas", "Bruzas");

        com.company.Strategy.Greeter greeterLt = new com.company.Strategy.Greeter(new LithuanianGreetingStrategy(), new Ellipises());
        com.company.Strategy.Greeter greeterEng = new com.company.Strategy.Greeter(new EnglishLanguageStrategy(), new Ellipises());

        greeterLt.greet("Antanas", "Jomantas");
        greeterEng.greet("Mantas","Giedraitis");




    }
}
