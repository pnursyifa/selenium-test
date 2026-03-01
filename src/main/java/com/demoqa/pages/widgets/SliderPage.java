package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static utilities.GetUtility.getAttribute;
import static utilities.ActionsUtility.*;

public class SliderPage extends WidgetsPage {
    private By sliderInput = By.id("slider");
    private By sliderValue = By.id("sliderValue");

    public void moveSliderInput(int x, int y) {
        Actions act = new Actions(driver);
        dragAndDropBy(find(sliderInput), x, y);
    }

    public String getSliderValue() {
        return getAttribute(sliderValue, "value");
    }
}
