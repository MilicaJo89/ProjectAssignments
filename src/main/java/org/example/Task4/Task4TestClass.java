package org.example.Task4;

import org.example.BaseClass;
import org.testng.annotations.Test;

public class Task4TestClass {

    BaseClass baseClass = new BaseClass();
    HomePageClass homePageClass = new HomePageClass();


    @Test
    public void TestCase(){
        baseClass.DriverSetUp2();
        homePageClass.favoriteSportInput()
                .verifyFavoriteSport()
                .clearChoice();
    }
}
