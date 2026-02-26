package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.*;

public class FramesPage extends Alerts_Frames_WindowsPage {
    private By textInFrame = By.id("sampleHeading");
    private String iFrameBigBox = "frame1";
    private By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");
    private By iFrameSmallBox = By.xpath("//div[@id='frame2Wrapper']/iframe");

    private void switchToBigBox() {
        switchToFrameString(iFrameBigBox);
    }

    private void switchToSmallBox() {
        switchToFrameIndex(4);
        /* I cant get this to work because firefox just decided to
        * have a random frame index number everytime I run this test.
        * idx = 4 passed once, then failed the next test.
        * Screenshoot also seem to fail. cors thingy?
        * */
    }

    private void switchToSmallBoxElement() {
        switchToFrameElement(find(iFrameSmallBox));
    }

    public String getTextInBigFrame() {
        switchToBigBox();
        delay(3000);
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big Frame Text: " + bigFrameText);
        switchToDefaultContent();
        // bisa juga driver.switchTo().parentFrame(); bisa juga switch to .defaultContent() (ada di utility class)
        return bigFrameText;
    }

    public String getHeaderFramesText() {
        return find(headerFramesText).getText();
    }

    public String getTextInSmallFrame() {
        delay(3000);
        switchToSmallBox();
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame Text: " + smallFrameText);
         switchToDefaultContent();
        return smallFrameText;
    }

    public String getTextInSmallFrameElement() {
        switchToSmallBoxElement();
        delay(3000);
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame Text: " + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }
}
