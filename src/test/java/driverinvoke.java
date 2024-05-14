import org.openqa.selenium.WebDriver;
/*import io.github.bonigarcia.wdm.WebDriverManager;*/
import org.openqa.selenium.chrome.ChromeDriver;

public class driverinvoke {
    public static void main(String[] args) {

            /*WebDriverManager.chromedriver().setup();*/
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.jobs.nhs.uk/candidate/search");
            System.out.println(driver.getTitle());
            driver.quit();
    }
}