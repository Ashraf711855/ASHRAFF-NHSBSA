/*import io.github.bonigarcia.wdm.WebDriverManager;*/
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class invoke {
    public  static RemoteWebDriver driver;
    public static void main(String[] args) {


            /*WebDriverManager.chromedriver().setup();*/
            /*WebDriverManager.chromedriver().browserVersion("124.0.6367.201").setup();*/
            /*ChromeOptions options=new ChromeOptions();*/
/*
            FirefoxDriver options=new FirefoxDriver();
            options.addArguments("--remote-allow-origins=*");
*/
            /*WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.jobs.nhs.uk/candidate/search");*/
            driver=new FirefoxDriver();
            driver.get("https://www.jobs.nhs.uk/candidate/search");
            driver.manage().window().maximize();
            /*RemoteWebDriver driver=new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
            /*driver.get("https://www.jobs.nhs.uk/candidate/search");*/
            driver.manage().window().maximize();
            System.out.println(driver.getTitle());
            driver.findElement(By.xpath("//input[@id='keyword']")).sendKeys("nurse");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//input[@id='location']")).sendKeys("Scotland Corner, Reading");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//input[@id='search']")).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            /*JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 1000)");*/
            List<WebElement> search_result =driver.findElements(By.xpath("//ul[@class='nhsuk-list search-results']/li/div/div/h3/a"));
            for (WebElement each_result : search_result){
                String job_link  = each_result.getAttribute("href");
                String job_title  = each_result.getText();
                System.out.println("Job Link: " + job_link);
                System.out.println("Job Title: " + job_title);
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            WebElement dropdown=driver.findElement(By.xpath("//select[@id='sort']"));
            Select select=new Select(dropdown);
            select.selectByValue("publicationDateDesc");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            List<WebElement> search_result1 =driver.findElements(By.xpath("//ul[@class='nhsuk-list search-results']/li/div/div/h3/a"));
            for (WebElement each_result : search_result1){
                String job_link  = each_result.getAttribute("href");
                String job_title  = each_result.getText();
                System.out.println("Job Link: " + job_link);
                System.out.println("Job Title: " + job_title);
            }
            driver.quit();
    }
}
