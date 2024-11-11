package org.example.Task2;

import org.example.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class OpenWindowPageClass extends BaseClass {

    WebDriver driver;



    public By windowName = By.xpath("//span[contains(.,'About')]");
    public By minimizeButton = By.xpath("//button[@title='Minimize']");
    public By maximizeButton = By.xpath("//button[@title='Maximize']");
    public By closeButton = By.xpath("//button[@title='Close']");
    public By windowText = By.xpath("//p[contains(.,'Additional info')]");

    public OpenWindowPageClass openWindowPageClass(WebDriver driver){
        this.driver=driver;
        return this;
    }

    public OpenWindowPageClass windowNameIsPresent(){
        elementIsPresent(windowName);
        return this;
    }

    public OpenWindowPageClass windowTextIsPresent(){
        elementIsPresent(windowText);
        return this;
    }

    public OpenWindowPageClass minimizeButtonIsPresent(){
        elementIsPresent(minimizeButton);
        return this;
    }

    public OpenWindowPageClass maximizeButtonIsPresent(){
        elementIsPresent(maximizeButton);
        return this;
    }
    public OpenWindowPageClass clickOnMaximizeButton(){
        clickOnElement(maximizeButton);
        return this;
    }
    public OpenWindowPageClass maximizeButtonIsNOTPresent(){
        elementIsNOTPresent(maximizeButton);
        return this;
    }

    public OpenWindowPageClass closeButtonIsPresent(){
        elementIsPresent(closeButton);
        return this;
    }

    public HomePageClass clickCloseButton(){
        clickOnElement(closeButton);
        return new HomePageClass();
    }

}
