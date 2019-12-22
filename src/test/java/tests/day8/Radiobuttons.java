package tests.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BrowserFactory;

public class Radiobuttons {
private WebDriver driver;
@BeforeMethod
public void setup(){
    driver = BrowserFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/");
    // to go to Radio Buttons page
    // <a href="/radio_buttons">Radio Buttons</a>
    // linkText works only with <a> elements
    // link text only in between >Text<
    //this is step is common for all test cases
    driver.findElement(By.linkText("Radio Buttons")).click();
}

@Test(description = "Verify that blue button is selected")
public void test1(){

    //find blue radio button
    WebElement blueButton = driver.findElement(By.id("blue"));
    //let's verify that radio button is selected
    //assert true that button is selected
    //if button is selected it will return true, otherwise false
    boolean isSelected = blueButton.isSelected();
    Assert.assertTrue(isSelected);  //will expected that isSelected is true

}
@Test(description = "Verify that red button is not selected")
public void test2(){
WebElement redButton = driver.findElement(By.id("red"));
Assert.assertFalse(redButton.isSelected());  //assertFalse will expected that condition is false

}

    @Test(description = "Verify that green button is not clickable")
    public void test3(){
       WebElement greenButton = driver.findElement(By.id("green"));
       Assert.assertFalse(greenButton.isEnabled());

    }



@AfterMethod
    public void teardown(){

    driver.quit();
}





}
