import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

/*
1. Open the URL https://www.amazon.co.uk/
2. Type "Dell Laptop" in the search box and press enter or click on the Search Button.
3. Click on the checkbox brand dell on the left side.
4. Verify that the  30 products are displayed on the page.
5. Print all products' names on the console.
5. Close the Browser.
 */
public class TestSuite extends BaseTest{
    String baseUrl="https://www.amazon.co.uk/";

    @Before
    public void start(){

        openBrowser(baseUrl);
    }
    @Test
    public void verifyThat30ProductsAreDisplayedOnPage(){
        driver.findElement(By.xpath("//input[@id='sp-cc-accept']")).click();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Dell Laptop", Keys.ENTER);
        driver.findElement(By.xpath("//span[@class='a-size-base a-color-base' and contains(text(),'Dell') and @dir='auto']")).click();
        List<WebElement>laptop=driver.findElements(By.xpath("//img[@data-image-index]"));
        int a=laptop.size();
        System.out.println(a);
        for (WebElement svp:laptop){
            System.out.println(svp.getAttribute("alt"));
        }
    }
}
