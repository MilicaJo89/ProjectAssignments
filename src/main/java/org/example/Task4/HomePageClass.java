package org.example.Task4;

import org.example.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class HomePageClass extends BaseClass {

    WebDriver driver;

    public HomePageClass homePageClass(WebDriver driver){
        this.driver=driver;
        return this;
    }

    public By autocompleteTextFiled = By.xpath("//input[@placeholder='Your favorite sport']");
    public By clearChoice = By.xpath("//span[@title='clear']");



    public HomePageClass favoriteSportInput(){
        type(autocompleteTextFiled,"Tennis");
        pressEnterKey(autocompleteTextFiled);
        return this;
    }

    public HomePageClass verifyFavoriteSport(){
        elementIsPresent(autocompleteTextFiled);
        return this;
    }

    public HomePageClass clearChoice(){
        clickOnElement(clearChoice);
        return this;
    }
}
