package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import java.util.Set;

import static utilities.SwitchToUtility.switchToWindow;

public class BrowserWindowsPage extends Alerts_Frames_WindowsPage {
    private By newWindowButton = By.id("windowButton");

    public void clickNewWindowButton() {
        click(newWindowButton);
    }

    public void switchToNewWindow() {
        String currentHandle = driver.getWindowHandle();
        System.out.println("Main window ID: " + currentHandle);

        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("# of Open Windows: " + allHandles.size());

        for (String handle: allHandles) {
            if (currentHandle.equals(handle)) {
                System.out.println("1st Window ID: " + handle);
            } else {
                // driver.switchTo().window(handle); ada di switch util
                switchToWindow(handle);
                delay(3000);
                System.out.println("2nd Window ID: " + handle);
            }
        }
    }
}
