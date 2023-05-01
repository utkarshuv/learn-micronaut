package com.example.learning;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
import jdk.jfr.Name;

@Singleton
public class MyApplication {

    private final Logger logger;
    //USING CONSTRUCTOR INJECTION
    //console matches to the ConsoleLogger
    //write the name inside the @Named() to match the name of the implementation class you want to use
    //if FileLogger needs to be used then write @Named("file") Logger logger
    //using @Named to specify which particular implementation to inject
//    public MyApplication(@Named("console") Logger logger) {
//        this.logger = logger;
//    }

    //USING FIELD INJECTION
    //just write the name of the implementation (similar to constructor injection)
    //cannot make the defined object final as it is not provided by the field injection, hence, only private
//    @Named("file")
//    private Logger logger;


    //USING QUALIFIER
    //@Console is a custom defined (user defined) Annotation
    //Console.java is used to define it
    //we can just use the @Console definition and the correct implementation will be injected
    public MyApplication(@Console Logger logger) {
        this.logger = logger;
    }

    public void process(){
        System.out.println("Processing...");
        logger.Log();   //using the injected object/bean
    }
}

