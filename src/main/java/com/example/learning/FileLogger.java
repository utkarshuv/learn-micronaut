package com.example.learning;

import jakarta.inject.Singleton;

/**
 * Class to provide file logging capabilities
 */
@Singleton
public class FileLogger implements Logger{

    @Override
    public void Log() {
        System.out.println("Logging the message to file...");
    }
}
