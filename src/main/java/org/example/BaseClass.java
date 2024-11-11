package org.example;

import java.io.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class BaseClass {



    public static WebDriver driver;


    public void DriverSetUp1(){
        System.getProperty("webdriver.chrome.driver","C:\\Users\\Miso\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demos.telerik.com/kendo-angular-ui/demos/dialogs/preview?theme=default-main");
    }

    public void DriverSetUp2(){
        System.getProperty("webdriver.chrome.driver","C:\\Users\\Miso\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demos.telerik.com/kendo-angular-ui/demos/dropdowns/overview?theme=default-main");
    }

    public void DriverSetUp3(){
        System.getProperty("webdriver.chrome.driver","C:\\Users\\Miso\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demos.telerik.com/kendo-angular-ui/demos/grid/filter-all-columns?theme=default-main");
    }


    public void hover(By xpath) {
        WebElement hoverable = driver.findElement(xpath);
        new Actions(driver).moveToElement(hoverable).perform();
    }
    public void pressEnterKey(By xpath){
        driver.findElement(xpath).sendKeys(Keys.ENTER);
    }

    public void type(By textbox, String text) {
        WebElement information = driver.findElement(textbox);
        information.isDisplayed();
        information.isEnabled();
        information.sendKeys(text);
    }

    public void clickOnElement(By xpath) {
         driver.findElement(xpath).click();
    }

    public void elementIsPresent(By xpath) {
        driver.findElement(xpath).isDisplayed();
    }

    public void elementIsNOTPresent(By xpath){
        WebElement element = driver.findElement(xpath);
        element=null;
    }

    public void yesButtonBackgroundColor(By xpath){
        WebElement element = driver.findElement(xpath);
        String color= "#ff6358";
        String backgroundColor = element.getCssValue("background-color");
        backgroundColor.equals(color);
    }
    public void scrollIntoViewAndClickItUnreachableElement(By xpath) {
        WebElement element = driver.findElement(xpath);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",element);
    }


    public void readCSVFileForEmployees(){

        String file = "src/Employees.csv";
        BufferedReader reader = null;
        String line="";

        try {
            reader=new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) !=null){
                String[] row = line.split(",");

                for (String index : row){
                    System.out.printf("%10s",index);
                }
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }



    }



}