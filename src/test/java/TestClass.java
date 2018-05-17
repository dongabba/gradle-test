import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
    @Test
    public void sampleTest(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.ru");
    }
}
