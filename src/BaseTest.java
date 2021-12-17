import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    /*
    1. Open the URL https://www.amazon.co.uk/
2. Type "Dell Laptop" in the search box and press enter or click on the Search Button.
3. Click on the checkbox brand dell on the left side.
4. Verify that the  30 products are displayed on the page.
5. Print all products' names on the console.
5. Close the Browser.
     */
    public static WebDriver driver;

    public void openBrowser(String baseUrl) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximise window// ;
    }

    public void closeBrowser() {

        driver.quit();
    }
}