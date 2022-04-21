package hw4.steps;

import hw2.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ActionStep extends AbstractStep {

    public ActionStep(WebDriver driver) {
        super(driver);
    }

    @Step("Exercise 1. Open test site by URL")
    public void openHomePage() {
        homePage.open(BaseTest.properties.getProperty("url"));
    }

    @Step("Exercise 1. Perform login")
    public void loginHomePage() {
        homePage.login(BaseTest.properties.getProperty("name"), BaseTest.properties.getProperty("password"));
    }

    @Step("Switch to frame {frameName}")
    public void switchToFrame(String frameName) {
        driver.switchTo().frame(frameName);
    }

    @Step("Switch to default content")
    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

    @Step("Exercise 2. Open through the header menu Service -> Different Elements Page")
    public void openDifferentElementsPage() {
        homePage.getHeaderMenu().clickNavigatiounBarItem("SERVICE");
        homePage.clickDropdownMenuItems("DIFFERENT ELEMENTS");
    }

    @Step("Exercise 2. Select checkbox {checkboxName}")
    public void selectCheckbox(String checkboxName) {
        differentElementsPage.clickCheckboxItem(checkboxName);
    }

    @Step("Exercise 2. Select radiobox {radioboxName}")
    public void selectRadiobox(String radioboxName) {
        differentElementsPage.clickRadioboxItem(radioboxName);
    }

    @Step("Exercise 2. Select in dropdown {optionItemName}")
    public void selectOptionItem(String optionItemName) {
        differentElementsPage.clickOptionItem(optionItemName);
    }

}
