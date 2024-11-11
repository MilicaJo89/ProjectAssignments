package org.example.Task1;

import org.example.BaseClass;
import org.example.Task2.OpenWindowPageClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class OpenDialogPageClass extends BaseClass {

    WebDriver driver;

    public OpenDialogPageClass openDialogPageClass(WebDriver driver){
        this.driver=driver;
        return this;
    }

    public By windowName = By.xpath("//span[contains(.,'Please confirm')]");
    public By windowText = By.xpath("//p[contains(.,'Are you sure you want to continue?')]");
    public By buttonNo = By.xpath("//button//span[contains(.,'No')]");
    public By buttonYes = By.xpath("//button//span[contains(.,'Yes')]");
    public By buttonX = By.xpath("//button[@title='Close']");


    public OpenDialogPageClass windowNameIsPresent(){
        elementIsPresent(windowName);
        return this;
    }
    public OpenDialogPageClass windowTextIsPresent(){
        elementIsPresent(windowText);
        return this;
    }
    public OpenDialogPageClass buttonNoIsPresent(){
        elementIsPresent(buttonNo);
        return this;
    }
    public OpenDialogPageClass buttonYesIsPresent(){
        elementIsPresent(buttonYes);
        return this;
    }
    public OpenDialogPageClass buttonXIsPresent(){
        elementIsPresent(buttonX);
        return this;
    }

    public OpenDialogPageClass focusXButton(){
        hover(buttonX);
        return this;
    }
    public HomePageClass pressEnterKey(){
        pressEnterKey(buttonX);
        return new HomePageClass();
    }

    public OpenDialogPageClass yesButtonBackgroundColor(){
        yesButtonBackgroundColor(buttonYes);
        return this;
    }
}
