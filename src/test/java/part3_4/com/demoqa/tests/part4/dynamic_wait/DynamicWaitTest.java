package part3_4.com.demoqa.tests.part4.dynamic_wait;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

@Test
public class DynamicWaitTest extends BaseTest {

    public void testVisibleAfterButtonTest() {
        var dynamicPage = homePage.goToElements().clickDynamicProperties();
        String actualText = dynamicPage.getVisibleAfterButtonText();
        String expectedText = "Visible After 5 Seconds";
        Assert.assertEquals(actualText, expectedText,
                "\n Actual & Expected Text do not match \n");

    }

    public void testProgressBar() {
        var progressBarPage = homePage.goToWidgets().clickProgressBar();
        progressBarPage.clickStartStopButton();
        String actualValue = progressBarPage.getProgressValue();
        String expectedValue = "100%";
        Assert.assertEquals(actualValue, expectedValue,
                "\n value is not 100% \n");
    }

}
