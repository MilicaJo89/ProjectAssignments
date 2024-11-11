package org.example.Task2;

import org.example.BaseClass;
import org.testng.annotations.Test;



public class Task2TestClass {



    BaseClass baseClass = new BaseClass();
    HomePageClass homePageClass = new HomePageClass();
    OpenWindowPageClass openWindowPageClass = new OpenWindowPageClass();

    @Test
    public void TestCase() throws InterruptedException {
        baseClass.DriverSetUp1();
        homePageClass.clickOpenWindowButton()
                .windowNameIsPresent()
                .windowTextIsPresent()
                .minimizeButtonIsPresent()
                .maximizeButtonIsPresent()
                .clickOnMaximizeButton()
                .maximizeButtonIsNOTPresent()
                .closeButtonIsPresent()
                .clickCloseButton()
                .openWindowButtonIsPresent();


    }
}
