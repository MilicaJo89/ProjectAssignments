package org.example.Task2;


import org.example.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePageClass extends BaseClass {


    WebDriver driver;


    public HomePageClass homePageClass(WebDriver driver){
        this.driver=driver;
        return this;
    }

    public By windowButton = By.xpath("//span[contains(.,'Open window')]");



    public OpenWindowPageClass clickOpenWindowButton(){
        clickOnElement(windowButton);
        return new OpenWindowPageClass();
    }

    public HomePageClass openWindowButtonIsPresent(){
        elementIsPresent(windowButton);
        return this;
    }

}
