import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class BMICalculatorTest {
    @Test
    public void calcTest(){
        open("https://healthunify.com/bmicalculator/");
        $(By.name("wg")).sendKeys("85");
        $(By.name("ht")).sendKeys("185");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Normal");
    }
}
