package org.example.Task3;

import org.example.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class HomePageClass extends BaseClass {

    WebDriver driver;

    public HomePageClass homePageClass(WebDriver driver){
        this.driver=driver;
        return this;
    }



    public By countryMenuSelect = By.xpath("//a[@title='Country Column Menu']");
    public By filterOption = By.xpath("//kendo-grid-columnmenu-item[@class='ng-tns-c2035614799-4 ng-star-inserted']");
    public By inputCountryTextField = By.xpath("//input[@aria-label='Country Filter']");
    public By filterButton = By.xpath("//button[contains(.,'Filter')]");

    public By onlineMenu = By.xpath("//a[@title='Status Column Menu']");
    public By olineFilterOption = By.xpath("//kendo-grid-columnmenu-item[@class='ng-tns-c2035614799-8 ng-star-inserted']");
    public By onlineTrueFilterButton = By.xpath("//label[contains(.,'Is True')]");
    public By onlineFilterButton = By.xpath("//button[contains(.,'Filter')]");
    public By exportFilesToExcelButton = By.xpath("//span[contains(.,'Export to Excel')]");





    public HomePageClass clickCountryMenu(){
        clickOnElement(countryMenuSelect);
        return this;
    }
    public HomePageClass clickOnFilterOption(){
        clickOnElement(filterOption);
        return this;
    }

    public HomePageClass inputTextUS(){
        type(inputCountryTextField,"US");
        return this;
    }
    public HomePageClass clickFilterButton(){
        clickOnElement(filterButton);
        return this;
    }

    public HomePageClass clickStatusOption (){
        clickOnElement(onlineMenu);
        return this;
    }

    public HomePageClass clickStatusOption2 (){
        clickOnElement(olineFilterOption);
        return this;
    }

    public HomePageClass clickStatusTrue (){
        clickOnElement(onlineTrueFilterButton);
        return this;
    }

    public HomePageClass clickStatusFilterButton (){
        clickOnElement(onlineFilterButton);
        return this;
    }

    public HomePageClass clickOnExportButton(){
        clickOnElement(exportFilesToExcelButton);
        return this;
    }












}
