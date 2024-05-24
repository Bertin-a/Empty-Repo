package com.example.demo5selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAsserts {
    @Test
    public void doSomething(){
        System.out.println("Login");
        //hard assert to verify that user is logged in
        Assert.assertTrue(false, "User did not login");
        System.out.println("Add to cart");
        System.out.println("Checkout items");
        System.out.println("Signout");
    }

    @Test
    public void printStatement(){
        System.out.println("This will print");
    }
}
