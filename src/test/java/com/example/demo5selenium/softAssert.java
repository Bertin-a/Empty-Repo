package com.example.demo5selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
    SoftAssert softAssert = new SoftAssert();
    @Test
    public void print(){
        System.out.println("Login");
        System.out.println("Add to cart");
        //verify profile picture is visible
        softAssert.assertTrue(false, "profile picture isn't visible");
        //with assert all
        softAssert.assertAll();
        System.out.println("Checkout items");
        System.out.println("Signout");
    }
    @Test
    public void printSomething(){
        System.out.println("Another test");
    }
}
