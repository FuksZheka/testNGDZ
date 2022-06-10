import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Avito {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\1\\Desktop\\antara_test_practice\\testNGDZ\\HW3_Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.navigate().to("https://www.avito.ru/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement params = driver.findElement(By.xpath("//*[@id=\"category\"]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        params.click();

        driver.findElement(By.xpath("//*[@id=\"category\"]/option[55]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement params2 = driver.findElement(By.className("input-input-Zpzc1"));
        params2.sendKeys("Принтер");



        WebElement params3 = driver.findElement(By.className("main-text-_Thor"));
        params3.click();

        WebElement params4 = driver.findElement(By.className("suggest-input-rORJM"));
        params4.sendKeys("Владивосток");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement param6 = driver.findElement(By.className("suggest-suggest-content-raQZy"));
        param6.click();
        WebElement param5 = driver.findElement(new By.ByCssSelector("div div div div div.popup-buttons-WICnh"));
        param5.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(new By.ByCssSelector("[data-marker = delivery-filter]")).click(); //авито доставка
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(new By.ByCssSelector("[data-marker = \"search-filters/submit-button\"]")).click(); //показать
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(new By.ByCssSelector("div[class = \"index-content-_KxNP\"] [class = \"select-select-IdfiC\"]")).click(); //список по цене
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(new By.ByCssSelector("div[class = \"index-content-_KxNP\"] [data-marker = \"option(2)\"]")).click(); //дороже
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = \"item\"]:nth-child(1) h3")).getText()); //название первого принтера
        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = item]:nth-child(1) meta:nth-child(2)")).getAttribute("content"));
        System.out.println();
        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = \"item\"]:nth-child(2) h3")).getText()); //название первого принтера
        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = item]:nth-child(2) meta:nth-child(2)")).getAttribute("content"));
        System.out.println();
        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = \"item\"]:nth-child(3) h3")).getText()); //название первого принтера
        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = item]:nth-child(3) meta:nth-child(2)")).getAttribute("content"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.close();

    }
}
