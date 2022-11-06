package org.example.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.HomePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageStep extends HookTest {
        public WebDriver webDriver;
        WebDriverWait wait;
        public HomePageStep()
        {
            webDriver = HookTest.webDriver;
        }

        @Given("User on Home page")
        public void openOrderHomepage() {
            HomePage homePage = new HomePage(webDriver);
            homePage.pressbuttonSignin();
//            webDriver = new ChromeDriver();
//            wait = new WebDriverWait(webDriver,Duration.ofSeconds(10));
//            wait.ignoring(WebDriverException.class);
//            wait.ignoring(StaleElementReferenceException.class);
        }
        @When("User click sign in")
        public void clickSignin() throws Throwable{
        HomePage homePage = new HomePage(webDriver);
        homePage.pressbuttonSignin();
        }
        @Then("go to the sign-in page")
        public void verifySignintext()throws Throwable{
            HomePage homePage= new HomePage(webDriver);
            Assert.assertEquals(By.xpath("//h3[.='Already registered?']"),(By.xpath("//h3[.='Already registered?']")));
            webDriver.quit();
        }
}
