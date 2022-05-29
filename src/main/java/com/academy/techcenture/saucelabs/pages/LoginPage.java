package com.academy.techcenture.saucelabs.pages;

import org.apache.hc.core5.function.Factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {


    //store web lemeents
    //assertions
    //methods

    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "user-name")
    private WebElement userNameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    private WebElement loginBtn;

    @FindBy(className = "login_logo")
    private WebElement loginLogo;

    @FindBy(className = "bot_column")
    private WebElement botImg;


    public void login(){
        Assert.assertTrue(loginLogo.isDisplayed());
        Assert.assertTrue(botImg.isDisplayed());
        userNameInput.sendKeys("standard_user");
        passwordInput.sendKeys("secret_sauce");
        loginBtn.click();
    }

}
