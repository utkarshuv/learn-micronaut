package com.example.learning;

import jakarta.inject.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//here we are defining our own custom annotation (user defined annotation) for bean qualifier
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Console {
}
