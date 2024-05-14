import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import static org.junit.Assert.assertEquals;

public class invalidlocation {
    public static void main(String[] args) throws InterruptedException {
        RemoteWebDriver driver = new ChromeDriver();
        driver.get("https://www.jobs.nhs.uk/candidate/search");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[@id='location']")).sendKeys("!@#$");
        driver.findElement(By.xpath("//input[@id='search']")).click();
        Thread.sleep(5000);
        String no_result = driver.findElement(By.xpath("//h2[contains(text(),'Location not found')]")).getText();
        System.out.println(no_result);
        assertEquals("Location not found", no_result);
        driver.quit();
    }
}
