package com.keelient.unit1;

public class HelloWorldGreeting implements Greeting{
    @Override
    public void perform() {
        System.out.println("Hello World!");
    }
}
