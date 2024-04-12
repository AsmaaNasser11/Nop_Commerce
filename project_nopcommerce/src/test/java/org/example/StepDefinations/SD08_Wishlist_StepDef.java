package org.example.StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_HomePage_PG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.StepDefinations.Hooks.driver;

public class SD08_Wishlist_StepDef {

    P01_HomePage_PG p01HomePagePg =new P01_HomePage_PG();

@Given("User is on homepage")
    public void UserIsOnHomepage(){
    
}

    @When("User adds an item to the wishlist")
    public void userAddsAnItemToTheWishlist() throws InterruptedException {

        p01HomePagePg.wishlist_Btn().click();
        Thread.sleep(2000);
        p01HomePagePg.wishlist_Btn1().click();
        Thread.sleep(2000);
    }

    @Then("Success message will appear")
    public void successMessageWillAppear() {
                SoftAssert soft = new SoftAssert();
       // soft.assertTrue(p01HomePagePg.success_Msg().isDisplayed(), "Success message is not displayed");
        soft.assertEquals(p01HomePagePg.success_Msg().getText(), "The product has been added to your wishlist");
          soft.assertAll();
    }

    @Then("Item should be added to the wishlist")
    public void itemShouldBeAddedToTheWishlist() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));

        String value = driver.findElement(By.className("wishlist-qty")).getText();
        int quantity = value.length();

        String str= value.substring(1,quantity -1);

        int foo = Integer.parseInt(str);
        Assert.assertTrue(foo > 0);

    }




}
