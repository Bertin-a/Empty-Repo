package com.example.demo5selenium;

import org.testng.annotations.*;

public class testNGAnnotations {
    @BeforeSuite
    public void test(){
        System.out.println("Before suite");
    }
    @AfterSuite
    public void test1(){
        System.out.println("After suite");
    }
    @BeforeMethod
    public void test2(){
        System.out.println("Before Method");
    }
    @AfterMethod
    public void test3(){
        System.out.println("after method");

    }
    @BeforeTest
    public void test4(){
        System.out.println("Before test");

    }
    @AfterTest
    public void test5(){
        System.out.println("After test");

    }
    @Test
    public void test6(){
        System.out.println("Test");

    }
}
