package org.example.Task1;


import org.example.BaseClass;
import org.testng.annotations.Test;

public class Task1TestClass {

    BaseClass baseClass = new BaseClass();
    HomePageClass homePageClass = new HomePageClass();
    OpenDialogPageClass openDialogPageClass = new OpenDialogPageClass();


    @Test
    public void TestCase(){
        baseClass.DriverSetUp1();
        homePageClass.dialogButtonIsPresent()
                .clickOnDialogButton()
                .windowNameIsPresent()
                .windowTextIsPresent()
                .buttonNoIsPresent()
                .buttonYesIsPresent()
                .buttonXIsPresent()
                .yesButtonBackgroundColor()
                .focusXButton()
                .pressEnterKey()
                .dialogButtonIsPresent();
    }
}
