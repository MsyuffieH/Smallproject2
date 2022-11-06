package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private static WebDriver webDriver;
    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver,this);
    }
    @FindBy(xpath = "//span[@class='hide_xs']")
    private static WebElement buttonSignIn;



    public static void pressbuttonSignin(){
        buttonSignIn.click();
    }
}
