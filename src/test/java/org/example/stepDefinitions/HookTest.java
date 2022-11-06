package org.example.stepDefinitions;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HookTest {
    public static WebDriver webDriver;


    @Before
    public void openWebBrowser(){
        System.out.println("Before Test");
        // lokasi web driver
//        System.setProperty("webdriver.chrome.driver", "D:\\webDriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
        webDriver = new ChromeDriver();
        // open web tujuan : midtrans
        webDriver.get("http://qa.cilsy.id:8080/");
        webDriver.manage().window().maximize();

//        webDriverr.navigate().refresh();
    }

    @After
    public void closeWebBrowser(){
        //driver.close();
        webDriver.quit();
    }

}


