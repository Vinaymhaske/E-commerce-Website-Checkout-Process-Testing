 import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class AddToCartTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://example.com"); // Replace with the URL of your e-commerce website
    }

    @Test
    public void testAddToCart() {
        // Test case for adding items to the cart
        // Steps:
        // 1. Navigate to the product page.
        // 2. Click on the "Add to Cart" button.
        // 3. Verify that the item is added to the cart.
        WebElement addToCartButton = driver.findElement(By.cssSelector("#add-to-cart-button"));
        addToCartButton.click();
        WebElement cartIcon = driver.findElement(By.cssSelector(".cart-icon"));
        assertTrue(cartIcon.isDisplayed());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
