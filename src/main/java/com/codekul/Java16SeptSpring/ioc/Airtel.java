package com.codekul.Java16SeptSpring.ioc;

public class Airtel implements Sim{
    @Override
    public void calling() {
        System.out.println("Airtel calling");
    }

    @Override
    public void data() {
        System.out.println("Airtel Data");
    }
}
