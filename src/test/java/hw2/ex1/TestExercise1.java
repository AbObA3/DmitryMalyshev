package hw2.ex1;

import hw2.BeforeAfterTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class TestExercise1 extends BeforeAfterTests {

    @Test
    public void exercise1Test() {
        //exercise 1. Open test site by URL
        driver.navigate().to("https://jdi-testing.github.io/jdi-light/index.html");

        //exercise 1. Assert Browser title
        softAssert.assertEquals(driver.getTitle(), "Home Page");

        //exercise 1. Perform login
        WebElement toggle = driver.findElements(By.className("dropdown-toggle"))
                .stream().skip(1).peek(WebElement::click)
                .findFirst().orElse(null);
        driver.findElement(By.id("name")).sendKeys("Roman");
        driver.findElement(By.id("password")).sendKeys("Jdi1234");
        driver.findElement(By.id("login-button")).click();

        //exercise 1. Assert Username is loggined
        softAssert.assertEquals(driver.findElement(By.id("user-name")).getText(),
                "ROMAN IOVLEV");

        //exercise 1. Assert that there are 4 items on the header section are displayed and they have proper texts
        softAssert.assertEquals(driver.findElement(By.linkText("Home"))
                .isDisplayed(), true);
        softAssert.assertEquals(driver.findElement(By.linkText("Contact form"))
                .isDisplayed(), true);
        softAssert.assertEquals(driver.findElement(By.linkText("Service"))
                .isDisplayed(), true);
        softAssert.assertEquals(driver.findElement(By.linkText("Metals & Colors"))
                .isDisplayed(), true);

        //exercise 1. Assert that there are 4 images on the Index Page and they are displayed
        softAssert.assertEquals(driver.findElement(By
                .className("icon-practise")).isDisplayed(), true);
        softAssert.assertEquals(driver.findElement(By
                .className("icon-custom")).isDisplayed(), true);
        softAssert.assertEquals(driver.findElement(By
                .className("icon-multi")).isDisplayed(), true);
        softAssert.assertEquals(driver.findElement(By
                .className("icon-base")).isDisplayed(), true);

        //exercise 1. Assert that there are 4 texts on the Index Page under icons and they have proper text
        List<WebElement> benefitTxt = driver.findElements(By
                .className("benefit-txt"));
        softAssert.assertEquals(benefitTxt.get(0).getText(),
                "To include good practices\n" +
                        "and ideas from successful\n" +
                        "EPAM project");
        softAssert.assertEquals(benefitTxt.get(1).getText(),
                "To be flexible and\n" +
                        "customizable");
        softAssert.assertEquals(benefitTxt.get(2).getText(),
                "To be multiplatform");
        softAssert.assertEquals(benefitTxt.get(3).getText(),
                "Already have good base\n" +
                        "(about 20 internal and\n" +
                        "some external projects),\n" +
                        "wish to get more…");

        //Exercise 1. Assert that there is the iframe with “Frame Button” exist
        softAssert.assertEquals(driver
                .findElement(By.id("frame")).isDisplayed(), true);

        //Exercise 1. Switch to the iframe and check that there is “Frame Button” in the iframe
        String mainWindow = driver.getWindowHandle();
        driver.switchTo().frame("frame");
        softAssert.assertEquals(driver
                .findElement(By.id("frame-button")).isDisplayed(), true);

        //Exercise 1. Switch to original window back
        driver.switchTo().defaultContent();
        WebElement curWindow = driver.findElement(By.tagName("body"));
        softAssert.assertEquals(curWindow.equals(driver
                .switchTo().activeElement()), true);

        //Exercise 1. Assert that there are 5 items in the Left Section are displayed and they have proper text
        List<WebElement> names = driver
                .findElement(By.cssSelector("ul[class = 'sidebar-menu left']"))
                .findElements(By.tagName("span")).stream()
                .filter((s) -> !(s.getText().equals("")))
                .collect(Collectors.toList());
        softAssert.assertEquals(names.get(0).getText(), "Home");
        softAssert.assertEquals(names.get(0).isDisplayed(), true);
        softAssert.assertEquals(names.get(1).getText(), "Contact form");
        softAssert.assertEquals(names.get(1).isDisplayed(), true);
        softAssert.assertEquals(names.get(2).getText(), "Service");
        softAssert.assertEquals(names.get(2).isDisplayed(), true);
        softAssert.assertEquals(names.get(3).getText(), "Metals & Colors");
        softAssert.assertEquals(names.get(3).isDisplayed(), true);
        softAssert.assertEquals(names.get(4).getText(), "Elements packs");
        softAssert.assertEquals(names.get(4).isDisplayed(), true);
        softAssert.assertAll();
    }
}
