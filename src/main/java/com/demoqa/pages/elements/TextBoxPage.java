package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static utilities.ActionsUtility.sendKeys;
import static utilities.GetUtility.getText;
import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.WaitUtility.explicitWaitUntilVisible;

public class TextBoxPage extends ElementsPage {
    private By fullNameField = By.id("userName");
    private By currentAddressField = By.xpath("//textarea[@id='currentAddress']");
    private By submitButton = By.id("submit");
    private By currentAddressResult = By.xpath("//p[@id='currentAddress']");

    public void setFullName(String name) {
        explicitWaitUntilVisible(5, fullNameField);
        scrollToElementJS(fullNameField);
        sendKeys(find(fullNameField), Keys.chord(name));
    }

    public void setEmail(String email) {
        setFullName(Keys.chord(Keys.TAB, email));
    }

    public void setCurrentAddress(String address) {
        find(currentAddressField).sendKeys(address + Keys.ENTER);
    }

    public void clickSubmitButton() {
        scrollToElementJS(submitButton);
        click(submitButton);
    }

    public String getCurrentAddressResult() {
        explicitWaitUntilVisible(5, currentAddressResult);
        return getText(currentAddressResult);
    }
}
