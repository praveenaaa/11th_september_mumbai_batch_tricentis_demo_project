package com.stepDefinitionTestNG;

import com.base.DriverManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.context.TestContext;

public class Hooks {

    public Hooks() {}

    @Before
    public void setup() {
        System.out.println("=============== I am in BEFORE ===============");
        // initialize driver and pages in TestContext
        TestContext.initPages();
        System.out.println("Pages initialized in TestContext");
    }
    
    @After
    public void teardown() {
        System.out.println("=============== I am in after ===============");
       
       
    }
    
}
