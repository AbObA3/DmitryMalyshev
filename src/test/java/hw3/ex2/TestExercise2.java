package hw3.ex2;

import hw2.BaseTest;
import hw3.DifferentElementsPage;
import hw3.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestExercise2 extends BaseTest {

    @Test
    public void exercise2Test() {
        //exercise 2. Open test site by URL
        driver.navigate().to(properties.getProperty("url"));

        //exercise 2. Assert Browser title
        softAssert.assertEquals(driver.getTitle(), "Home Page");

        //exercise 2. Perform login
        HomePage homePage = new HomePage(driver);
        homePage.login(properties.getProperty("name"), properties.getProperty("password"));

        //exercise 2. Assert Username in the left-top side of screen that user is loggined
        softAssert.assertEquals(homePage.getUserName(), "ROMAN IOVLEV");

        //exercise 2. Open through the header menu Service -> Different Elements Page
        homePage.getHeaderMenu().clickNavigatiounBarItem("SERVICE");
        homePage.clickDropdownMenuItems("DIFFERENT ELEMENTS");

        //Exercise 2. Select checkboxes	Water
        DifferentElementsPage differentElementsPage = PageFactory.initElements(driver, DifferentElementsPage.class);
        differentElementsPage.clickCheckboxItem("Water");
        differentElementsPage.clickCheckboxItem("Wind");

        //Exercise 2. Select radio Selen
        differentElementsPage.clickRadioboxItem("Selen");

        //Exercise 2. Select in dropdown Yellow
        differentElementsPage.clickOptionItem("Yellow");

        //Exercise 2. Assert that
        //•	for each checkbox there is an individual log row and value is corresponded to the status of checkbox
        //•	for radio button there is a log row and value is corresponded to the status of radio button
        //•	for dropdown there is a log row and value is corresponded to the selected value.

        differentElementsPage.getLogs().stream()
                .map(WebElement::getText)
                .forEach((s) -> softAssert.assertTrue(s
                        .matches("(\\d\\d:\\d\\d:\\d\\d Wind: condition changed to true)" +
                                "|(\\d\\d:\\d\\d:\\d\\d Water: condition changed to true)" +
                                "|(\\d\\d:\\d\\d:\\d\\d Colors: value changed to Yellow)" +
                                "|(\\d\\d:\\d\\d:\\d\\d metal: value changed to Selen)")));
        softAssert.assertAll();
    }
}
