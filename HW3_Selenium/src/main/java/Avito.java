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

        //driver.findElement(By.xpath("//*[@id=\"category\"]/option[55]")).click();
        driver.findElement(By.xpath("//option[@text()=\"Оргтехника и расходники\"]"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement params2 = driver.findElement(By.className("input-input-Zpzc1"));
        params2.sendKeys("Принтер");



        // до этого момента программа работает адекватно
        WebElement params3 = driver.findElement(By.className("main-text-_Thor"));
        params3.click();

        WebElement params4 = driver.findElement(By.className("suggest-input-rORJM"));
        params4.sendKeys("Владивосток");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement param6 = driver.findElement(By.className("suggest-suggest-content-raQZy"));
        param6.click();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        WebElement param5 = driver.findElement(new By.ByCssSelector("div div div div div.popup-buttons-WICnh"));
//        WebElement param5 = driver.findElement(By.ByClassName())
//        WebElement params5 = driver.findElement(By.cssSelector("#app > div.index-header-kdkEW > div > div.index-search-xHvcz > div > div.popup-overlay-zm_UF.popup-scrolling-outside-CfaMB > div > div > span > div > div.popup-footer-_ztw5 > div > div.popup-buttons-WICnh > div > button"));
        param5.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(new By.ByCssSelector("[data-marker = delivery-filter]")).click(); //авито доставка
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(new By.ByCssSelector("[data-marker = \"search-filters/submit-button\"]")).click(); //показать
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(new By.ByCssSelector("div[class = \"index-content-_KxNP\"] [class = \"select-select-IdfiC\"]")).click(); //список по цене
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(new By.ByCssSelector("div[class = \"index-content-_KxNP\"] [data-marker = \"option(2)\"]")).click(); //дороже
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = \"item\"]:nth-child(1) h3")).getText()); //название первого принтера
        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = item]:nth-child(1) meta:nth-child(2)")).getAttribute("content"));
        System.out.println();
        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = \"item\"]:nth-child(2) h3")).getText()); //название первого принтера
        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = item]:nth-child(2) meta:nth-child(2)")).getAttribute("content"));
        System.out.println();
        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = \"item\"]:nth-child(3) h3")).getText()); //название первого принтера
        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = item]:nth-child(3) meta:nth-child(2)")).getAttribute("content"));


        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //*[@id="app"]/div[2]/div/div[2]/div/div[5]/div[1]/span/span/div/div //нажать на выбор города

        //*[@id="app"]/div[2]/div/div[2]/div/div[6]/div/div/span/div/div[1]/div[2]/div/input // поле ввода для города
        /*Передать туда город Владивосток*/

        //*[@id="app"]/div[2]/div/div[2]/div/div[6]/div/div/span/div/div[3]/div/div[2]/div/button // нажатие на кнопку показать объявления

        //*[@id="app"]/div[3]/div[3]/div[3]/div[1]/div[2]/select // нажатие на кнопку по умолчанию перевести в положение по убыванию
        //Шаг 8 вывести в консоль 3 самых дорогих варианта - пока не знаю как делать
        driver.close();

    }
}
