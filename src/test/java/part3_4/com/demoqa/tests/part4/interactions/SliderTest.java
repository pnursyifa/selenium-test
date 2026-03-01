package part3_4.com.demoqa.tests.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class SliderTest extends BaseTest {
    @Test
    public void testSliderResult() {
        int x = 30; // horizontal
        int y = 0; // vertical
        var sliderPage = homePage.goToWidgets().clickSlider();
        sliderPage.moveSliderInput(x, y);
        String actualValue = sliderPage.getSliderValue();
        String expectedValue = "60";
        Assert.assertEquals(actualValue, expectedValue,
                "\n Actual and expected value do not match \n");
    }

}