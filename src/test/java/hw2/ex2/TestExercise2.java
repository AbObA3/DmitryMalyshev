package hw2.ex2;

import hw2.BeforeAfterTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TestExercise2 extends BeforeAfterTests {

    @Test
    public void exercise2Test() {
        //exercise 2. Open test site by URL
        driver.navigate().to("https://jdi-testing.github.io/jdi-light/index.html");

        //exercise 2. Assert Browser title
        softAssert.assertEquals(driver.getTitle(), "Home Page");

        //exercise 2. Perform login
        WebElement toggle = driver.findElements(By.cssSelector("a[href = '#']"))
                .stream().peek(WebElement::click)
                .findFirst().orElse(null);
        driver.findElement(By.id("name")).sendKeys("Roman");
        driver.findElement(By.id("password")).sendKeys("Jdi1234");
        driver.findElement(By.id("login-button")).click();

        //exercise 2. Assert User name in the left-top side of screen that user is loggined
        softAssert.assertEquals(driver.findElement(By.id("user-name")).getText(),
                "ROMAN IOVLEV");

        //exercise 2. Open through the header menu Service -> Different Elements Page
        driver.findElement(By.className("dropdown")).click();
        driver.findElement(By.className("dropdown-menu")).findElement(By
                .cssSelector("[href='different-elements.html']")).click();

        //Exercise 2. Select checkboxes	Water
        List<WebElement> checkboxes = driver
                .findElements(By.cssSelector("label[class='label-checkbox']"))
                .stream().filter((s) -> ((s.getText().equals("Water"))
                        || (s.getText().equals("Wind"))))
                .peek(WebElement::click).collect(Collectors.toList());

        //Exercise 2. Select radio Selen
        WebElement radioBoxSelen = driver
                .findElements(By.cssSelector("label[class='label-radio']"))
                .stream().filter((s) -> (s.getText().equals("Selen")))
                .peek(WebElement::click).findFirst().orElse(null);

        //Exercise 2. Select in dropdown Yellow
        WebElement colorYellow = driver
                .findElement(By.cssSelector("select[class='uui-form-element']"))
                .findElements(By.tagName("option"))
                .stream().filter((s) -> s.getText().equals("Yellow"))
                .peek(WebElement::click).findFirst().orElse(null);

        //Exercise 2. Assert that
        //•	for each checkbox there is an individual log row and value is corresponded to the status of checkbox
        //•	for radio button there is a log row and value is corresponded to the status of radio button
        //•	for dropdown there is a log row and value is corresponded to the selected value.
        List<WebElement> logStrings = driver
                .findElements(By.cssSelector("ul[class = 'panel-body-list logs'] li"));
        Pattern pattern = Pattern
                .compile("(\\w*)Colors|metal|Wind|Water(\\w*)Yellow|true|Selen");
        softAssert.assertEquals(pattern.matcher(logStrings.get(0).getText())
                .find(), true);
        softAssert.assertEquals(pattern.matcher(logStrings.get(1).getText())
                .find(), true);
        softAssert.assertEquals(pattern.matcher(logStrings.get(2).getText())
                .find(), true);
        softAssert.assertEquals(pattern.matcher(logStrings.get(3).getText())
                .find(), true);
        softAssert.assertAll();
    }

}
