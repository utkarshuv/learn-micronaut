package com.example.learning;

import jakarta.inject.Singleton;

@Singleton
public class ConsoleLogger implements Logger{

    @Override
    public void Log() {

        System.out.println("Logging to console...");

    }
}

