package com.autotest.issoft.basictests.googletest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Edostavka {

    @Test
    @Parameters({"searchParameter"})
    public void whatEver(String searchParameter){
        String coffee = "Кофе натуральный в зерне «Lavazza» qualita oro";
//        String searchParameter = "1";

        open("https://e-dostavka.by/");
//        $(By.xpath("//div[@class='main_menu__inner']//i[@class='fa fa-search']"));
        $x("//div[@class='main_menu__inner']//i[@class='fa fa-search']").click();
        $("#searchtext").setValue(coffee).pressEnter();
        $x("//a[contains(text(),'"+coffee+"')]").click();
        $x("//ul[@class='description']/li[last()]/span").should(text(searchParameter));

//        Assert.assertTrue();

    }

}
