import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import static org.junit.Assert.assertEquals;

public class invalidjobtitle {
    public static void main(String[] args) throws InterruptedException {
        RemoteWebDriver driver = new ChromeDriver();
        driver.get("https://www.jobs.nhs.uk/candidate/search");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[@id=\"keyword\"]")).sendKeys("!@#$");
        driver.findElement(By.xpath("//input[@id='search']")).click();
        Thread.sleep(5000);
        String no_result = driver.findElement(By.xpath("//h3[text()='No result found']")).getText();
        System.out.println(no_result);
        assertEquals("No result found", no_result);
        driver.quit();
    }
}
