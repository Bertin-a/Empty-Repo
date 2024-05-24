package com.example.demo5selenium;

import org.testng.annotations.*;

public class publicPrivate {
    @BeforeSuite
    private void test(){
        System.out.println("Before suite");
    }
    @Test
    private void test6() {
        System.out.println("Test");
    }
}
