package com.example.modules.main;

import com.example.modules.hello.HelloModules;
import com.example.modules.goodbye.GoodbyeModules;

public class MainApp {
    public static void main(String[] args) {
        HelloModules.doSomething();
        GoodbyeModules.doSomething();
    }
}