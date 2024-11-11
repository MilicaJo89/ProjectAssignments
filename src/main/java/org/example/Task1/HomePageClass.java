package org.example.Task1;

import org.example.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class HomePageClass extends BaseClass {

    WebDriver driver;

    public HomePageClass homePageClass(WebDriver driver){
        this.driver=driver;
        return this;
    }

    public By dialogButton = By.xpath("//span[contains(.,'Open dialog')]");

    public HomePageClass dialogButtonIsPresent(){
        elementIsPresent(dialogButton);
        return this;
    }
    public OpenDialogPageClass clickOnDialogButton(){
        clickOnElement(dialogButton);
        return new OpenDialogPageClass();
    }
}
