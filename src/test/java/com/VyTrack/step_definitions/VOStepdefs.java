package com.VyTrack.step_definitions;


import com.VyTrack.pages.LoginPage;
import com.VyTrack.utilities.ConfigurationReader;
import com.VyTrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.security.auth.login.Configuration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class VOStepdefs {

    LoginPage loginPage = new LoginPage();
    protected static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @When("Truck driver is on the VyTrack login page and logs in")
    public void truck_driver_is_on_the_vy_track_login_page_and_logs_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
        loginPage.usernamebox.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordbox.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginbutton.click();

        Assert.assertTrue(Driver.getDriver().getTitle().contains(""));
    }


    @Then("User clicks on Fleet and Vehicle Odometer")
    public void userClicksOnFleetAndVehicleOdometer() {


        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(loginPage.fleetMenuButton).click().perform();
        wait.until(ExpectedConditions.visibilityOf(loginPage.VehicleOdometerButton)).click();

    }

    
    @Then("User in on Vehicle Odometer see {string}, {string}, {string}, {string} and {string} on the grid")
    public void userInOnVehicleOdometerSeeAndOnTheGrid(String arg0, String arg1, String arg2, String arg3, String arg4) {

        List<WebElement> listOfWebTableTitle = Driver.getDriver().findElements(By.xpath("//span[@class='grid-header-cell__label']"));

        for (WebElement each : listOfWebTableTitle) {
            if (each.getText().contains(arg0)) {
                Assert.assertTrue("The element is not present in the grid",true );
                System.out.println("each = " + each);
            }
        }



    }
}
