package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.WaitUtility.fluentWaitUntilVisible;

public class WidgetsPage extends HomePage {
    private By selectMenuItem = By.xpath("//li[@id='item-8']//span[text()='Select Menu']");
    private By datePickerMenuItem = By.xpath("//li[@id='item-2']//span[text()='Date Picker']");
    private By progressBarMenuItem = By.xpath("//li[@id='item-4']//span[text()='Progress Bar']");
    private By sliderMenuItem = By.xpath("//li[@id='item-3']//span[text()='Slider']");

    public SelectMenuPage clickSelectMenu() {
        scrollToElementJS(selectMenuItem);
        click(selectMenuItem);
        return new SelectMenuPage();
    }

    public DatePickerPage clickDatePicker() {
        scrollToElementJS(datePickerMenuItem);
        click(datePickerMenuItem);
        return new DatePickerPage();
    }

    public ProgressBarPage clickProgressBar() {
        scrollToElementJS(progressBarMenuItem);
        click(progressBarMenuItem);
        return new ProgressBarPage();
    }

    public SliderPage clickSlider() {
        fluentWaitUntilVisible(3, sliderMenuItem);
        scrollToElementJS(sliderMenuItem);
        click(sliderMenuItem);
        return new SliderPage();
    }
}
