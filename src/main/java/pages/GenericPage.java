package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenericPage {

    private WebDriver driver;

    public GenericPage(WebDriver driver){
        this.driver = driver;
    }

    public void type(By element,String text){
        driver.findElement(element).click();
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(text);
    }

    public void click(By element){
        driver.findElement(element).click();
    }

    public String getElementText(By element){
        return driver.findElement(element).getText();
    }
}
