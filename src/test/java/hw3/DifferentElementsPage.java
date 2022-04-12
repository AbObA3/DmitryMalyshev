package hw3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DifferentElementsPage {

    @FindBy(css = "label[class='label-checkbox']")
    private List<WebElement> checkBoxes;

    @FindBy(css = "label[class='label-radio']")
    private List<WebElement> radioBoxes;

    @FindBy(css = "select[class='uui-form-element'] option")
    private List<WebElement> options;

    @FindBy(css = "ul[class = 'panel-body-list logs'] li")
    private List<WebElement> logs;

    public void clickCheckboxItem(final String item) {
        for (WebElement element : checkBoxes) {
            if (item.equals(element.getText())) {
                element.click();
                break;
            }
        }
    }

    public void clickRadioboxItem(final String item) {
        for (WebElement element : radioBoxes) {
            if (item.equals(element.getText())) {
                element.click();
                break;
            }
        }
    }

    public void clickOptionItem(final String item) {
        for (WebElement element : options) {
            if (item.equals(element.getText())) {
                element.click();
                break;
            }
        }
    }

    public List<WebElement> getLogs() {
        return this.logs;
    }
}
