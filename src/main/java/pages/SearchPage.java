package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends GenericPage{
    protected WebDriver driver;
    private WebDriverWait wait;



    private By searchField = By.id("lst-ib");
    private By searchButton = By.id("btnK");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public By getSearchField() {
        return searchField;
    }

    public By getSearchButton() {
        return searchButton;
    }
}
