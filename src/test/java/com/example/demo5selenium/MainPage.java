package com.example.demo5selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

// page_url = https://www.jetbrains.com/
public class MainPage extends MainPageTest {

    @Test
    public void login (){
        SoftAssert softAssert = new SoftAssert();
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        WebElement element = driver.findElement(By.cssSelector(".oxd-userdropdown-tab"));

        //Assert.assertTrue(false, "Element is displayed");
        //softAssert.assertTrue(false, "element is displayed");
        //softAssert.assertAll();
        print();

    }
    private void print(){
        driver.get("https://www.google.com");
        System.out.println("called private method");
    }

    private void testMethod2() {
        driver.get("https://www.google.com");
        System.out.println("This shouldn't print");
    }
    @Test
    private void printSomethings(){
        driver.get("https://www.google.com");
        System.out.println("This will not print");
    }
    public void noAnnotation(){
        driver.get("https://www.google.com");
        System.out.println("this is skipped");
    }
    /*@AfterSuite
    void test2() {
        System.out.println("After suite");
    }

     */
    @AfterTest
    public void test2() {
        System.out.println("After suite");
    }
}
