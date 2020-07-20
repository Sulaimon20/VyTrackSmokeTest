package com.VyTrack.pages;

import com.VyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //login
    @FindBy(xpath = "//*[@id='prependedInput']")
    public WebElement usernamebox;

    @FindBy(xpath = "//*[@id='prependedInput2']")
    public WebElement passwordbox;

    @FindBy(xpath = "//*[@id='_submit']")
    public WebElement loginbutton;

    //

    @FindBy(xpath = "//*[@id='main-menu']/ul/li[1]/a")
    public WebElement fleetMenuButton;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[2]")
    public WebElement VehicleOdometerButton;

    @FindBy(xpath = "//span[@class='grid-header-cell__label']")
    public WebElement listOfWebTableTitle;





}
