package com.autotest.issoft.basictests.googletest;

import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class EmailBox {

    @Test
    public void EmailSendCheck(){
        open("https://mail.ru/");
        $x("//div[@class='email-input-container svelte-1g5s8gh']//input[@type='text']").setValue("parhocdg@mail.ru").pressEnter();
        $x("//input[@type='password']").setValue("gfdmmyloru888").pressEnter();

        $x("//span[@class='b-toolbar__btn__text b-toolbar__btn__text_pad'][contains(text(),'Написать письмо')]").click(); //remove text on button
        $x("//div[contains(@class,'compose-head__row-wrapper compose-head__row-wrapper_to js-row')]//textarea[@class=\"js-input compose__labels__input\"]")
                .setValue("parhocdg@mail.ru").pressEnter();
        $x("//div[@class='compose-head__row compose-head__row_nohr js-widgets']//div[@class='compose-head__cell']//div[@class='compose-head__field']//input[@type='text']")
                .setValue("TestName1").pressEnter();

//        $("#tinymce").click();
//        $x("//tr[@class='mceFirst mceLast']").click();
//        $x("//tr[@class='mceFirst mceLast']").setValue("Test1337");
//        $("#tinymce").setValue("Test1337");
//      $x("//body[@id='tinymce']").setValue("Test1337");
//        $x("/html[1]/body[1]").setValue("Test1337");


        $x("//span[@class='b-toolbar__btn__text'][contains(text(),'Отправить')]").click(); //remove text on button
        $x("//div[@class='is-compose-empty_in']//form//div[@class='popup__controls']//button[@type='submit']").click();
        $x("//span[contains(@class,'b-nav__item__text b-nav__item__text_unread')]").click();
        $x("//div[contains(text(),'TestName1')]").click();
        $x("//div[@class='b-letter__head__subj__text']").should(text("TestName1"));
    }
}

