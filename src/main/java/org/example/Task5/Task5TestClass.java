package org.example.Task5;

import org.example.BaseClass;
import org.testng.annotations.Test;

public class Task5TestClass {

    BaseClass baseClass = new BaseClass();
    HomePageClass homePageClass = new HomePageClass();

    @Test
    public void TestCase() throws InterruptedException {
        baseClass.DriverSetUp2();
        homePageClass.clearField()
                .selectDropdownMenu()
                .checkBaseballElement()
                .checkBasketballElement()
                .checkCricketElement()
                .checkFieldHockeyElement()
                .checkFootballElement()
                .checkTableTennisElement()
                .checkTennisElement()
                .checkVolleyballElement()
                .clickOnFootballElement()
                .clickOnTennisElement()
                .checkFootballElement()
                .checkTennisElement();

    }


}
