package org.example.pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {

    private static WebDriver driver;


    public SigninPage(WebDriver driver) {
            PageFactory.initElements(driver,this);
        }

        @FindBy(id = "email")
        private WebElement fieldEmail;

        @FindBy(id = "passwd")
        private  WebElement fieldpassword;

        @FindBy(xpath = "//a[.='Forgot your password?']")
        private  WebElement forgotpassword;

        @FindBy(xpath = "//button[@id='SubmitLogin']/span[contains(.,'Sign in')]")
        private  WebElement buttonSignintologin;

        @FindBy(id = "email_create")
        private WebElement fieldEmailOnCreateAccount;

        @FindBy(xpath = "//span[contains(.,'Create an account')]")
        private WebElement buttoncreateanaccount;

        @FindBy(xpath = "//h3[.='Already registered?']")
        private  WebElement verifysignin;
        @FindBy(xpath = "//span[@class='hide_xs']")
        private  WebElement buttonSignIn;

        public void pressbuttonSignin(){
        buttonSignIn.click();
    }
        public  void ValidEmail(){
            fieldEmail.sendKeys("johnsamurai2728@gmail.com");
        }
        public  void Invalidemail(){ fieldEmail.sendKeys("rozakana42@gmail.com");}
        public  void WrongPassword(){
            fieldpassword.sendKeys("Koplo1234");
        }
        public  void PasswordLessthan5character(){
            fieldpassword.sendKeys("Kopi");
        }
        public void ValidPassword(){
            fieldpassword.sendKeys("huhui12345");
        }
        public  void pressforgotpassword(){
            forgotpassword.click();
        }
        public void SigninPageDisplayed(){
            verifysignin.click();
        }

        public void pressbutttonLogin(){
            buttonSignintologin.click();
        }
        public void setfieldCreateAccount(){
            fieldEmailOnCreateAccount.sendKeys("johnsamurai2728@gmail.com");
        }
        public void pressbuttonCreateAnAccount(){
            buttoncreateanaccount.click();
        }

    }


