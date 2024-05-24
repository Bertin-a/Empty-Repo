package com.example.demo5selenium;

import org.testng.annotations.*;


public class publicClassprivate {
    @BeforeSuite
    public void test(){
        System.out.println("Before suite");
        test1();

    }

    private void test1(){

        System.out.println("private method");
    }
    @Test
    private void testMethod2() {
        System.out.println("private method won't print");
    }

    private void printSomethings(){
        System.out.println("This will not print");
    }
    @AfterSuite
    void test2() {
        System.out.println("After suite");
    }
}
