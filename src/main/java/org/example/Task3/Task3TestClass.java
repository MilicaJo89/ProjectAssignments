package org.example.Task3;

import org.example.BaseClass;
import org.testng.annotations.Test;

public class Task3TestClass {

    HomePageClass homePageClass= new HomePageClass();
    BaseClass baseClass = new BaseClass();


    @Test
    public void TestCase() throws InterruptedException {
        baseClass.DriverSetUp3();
        homePageClass.clickCountryMenu();
        Thread.sleep(3000);
        homePageClass.clickOnFilterOption()
                .inputTextUS()
                .clickFilterButton();

        /*for each employee print name, job title, phone and address section would
        go here, but I was unable to complete that part of the assignment*/

        homePageClass.clickStatusOption();
        Thread.sleep(3000);
        homePageClass.clickStatusOption2();
        Thread.sleep(3000);
        homePageClass.clickStatusTrue()
                .clickStatusFilterButton()
                .clickOnExportButton();
        baseClass.readCSVFileForEmployees();
    }
}
