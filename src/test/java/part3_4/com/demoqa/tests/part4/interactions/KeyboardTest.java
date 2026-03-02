package part3_4.com.demoqa.tests.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class KeyboardTest extends BaseTest {
    @Test
    public void testApplicationUsingKeyboard() {
        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullName("This is My Full Name");
        textBoxPage.setEmail("email@some.thing.com");
        textBoxPage.setCurrentAddress("234 Jalan Lurus");
        textBoxPage.setCurrentAddress("402266");
        textBoxPage.setCurrentAddress("Kota Itu, Provinsi Ini");
        textBoxPage.clickSubmitButton();
        String actualAddress = textBoxPage.getCurrentAddressResult();
        Assert.assertTrue(actualAddress.contains("402266"),
                "\n Actual address does not contain 402266");
    }

}
