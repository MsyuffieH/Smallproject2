package org.example.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.example.pageObject.SigninPage;


public class SignInStep {
    private WebDriver webDriver;


    public SignInStep()
    {
       super();
       this.webDriver = HookTest.webDriver;
    }

        @Given("User on Sign in page")
        public void openOrderHomepage() {
        SigninPage signinPage = new SigninPage(webDriver);
        signinPage.pressbuttonSignin();

    }


    @And("User fill valid email")
    public void inputEmail()throws Throwable{
        SigninPage signinPage = new SigninPage(webDriver);
        signinPage.ValidEmail();
    }

    @And("valid password")
    public void inputPassword()throws Throwable{
        SigninPage signinPage = new SigninPage(webDriver);
        signinPage.ValidPassword();
    }

    @When("User fill invalid email")
    public void inputWrongEmail() throws Throwable {
        SigninPage signinPage = new SigninPage(webDriver);
        signinPage.Invalidemail();}

    @And("Invalid password")
    public void inputWrongPassword()throws Throwable{
        SigninPage signinPage = new SigninPage(webDriver);
        signinPage.WrongPassword();
    }

    @And("Password less than 5 character")
    public void inputPasswordLessThanCharacter() throws Throwable{
        SigninPage signinPage = new SigninPage(webDriver);
        signinPage.PasswordLessthan5character();
    }
    @Then("The result is success Sign in")
    public void verifySuccessSignin()throws Throwable{
        SigninPage signinPage= new SigninPage(webDriver);
        signinPage.pressbutttonLogin();
        String expectedtext = "MY ACCOUNT";
        String actualtext = webDriver.findElement(By.xpath("//h1[@class='page-heading']")).getText();
        Assert.assertEquals("Authentication failed",actualtext, expectedtext);
        webDriver.quit();
    }
    //h1[@class='page-heading']
    @Then("The result is failed Sign in")
    public void verifyFailedSignin() throws Throwable{
        SigninPage signinPage = new SigninPage(webDriver);
        signinPage.pressbutttonLogin();
        String expectedtext = "There is 1 error";
        String actualtext = webDriver.findElement(By.xpath("//p[.='There is 1 error']")).getText();
        Assert.assertEquals("Authentication failed",actualtext, expectedtext);
        webDriver.quit();
    }

}
