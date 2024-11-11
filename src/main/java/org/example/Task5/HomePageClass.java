package org.example.Task5;

import org.example.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageClass extends BaseClass {

    WebDriver driver;

    public HomePageClass homePageClass(WebDriver driver){
        this.driver=driver;
        return this;
    }


    public By clear = By.xpath("//kendo-multiselect//span//kendo-icon-wrapper//kendo-svgicon[@class='k-svg-i-x k-svg-icon k-icon']");
    public By dropdownMenu = By.xpath("//div[@class='k-input-values']");
    public By baseball = By.xpath("//span[contains(.,'Baseball')]");
    public By basketball = By.xpath("//span[contains(.,'Basketball')]");
    public By cricket = By.xpath("//span[contains(.,'Cricket')]");
    public By fieldHockey = By.xpath("//span[contains(.,'Field Hockey')]");
    public By football = By.xpath("//span[contains(.,'Football')]//parent::span");
    public By tableTennis = By.xpath("//span[contains(.,'Table Tennis')]");
    public By tennis = By.xpath("//span[contains(.,'Tennis')]");
    public By volleyball = By.xpath("//span[contains(.,'Volleyball')]");

    public By selectTennis = By.xpath("//span[contains(.,'Tennis') and not (contains(.,'Table Tennis'))]");

    public HomePageClass clearField(){
        clickOnElement(clear);
        return this;
    }


    public HomePageClass selectDropdownMenu(){
        clickOnElement(dropdownMenu);
        return this;
    }

    public HomePageClass checkBaseballElement(){
        elementIsPresent(baseball);
        return this;
    }

    public HomePageClass checkBasketballElement(){
        elementIsPresent(basketball);
        return this;
    }

    public HomePageClass checkCricketElement(){
        elementIsPresent(cricket);
        return this;
    }

    public HomePageClass checkFieldHockeyElement(){
        elementIsPresent(fieldHockey);
        return this;
    }

    public HomePageClass checkFootballElement(){
        elementIsPresent(football);
        return this;
    }

    public HomePageClass checkTableTennisElement(){
        elementIsPresent(tableTennis);
        return this;
    }

    public HomePageClass checkTennisElement(){
        elementIsPresent(tennis);
        return this;
    }

    public HomePageClass checkVolleyballElement(){
        elementIsPresent(volleyball);
        return this;
    }

    public HomePageClass clickOnTennisElement(){
        clickOnElement(dropdownMenu);
        scrollIntoViewAndClickItUnreachableElement(selectTennis);
        return this;
    }
    public HomePageClass clickOnFootballElement(){
        scrollIntoViewAndClickItUnreachableElement(football);
        return this;
    }
}
