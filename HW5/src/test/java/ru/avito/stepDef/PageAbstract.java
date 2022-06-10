package ru.avito.stepDef;

import io.qameta.allure.Attachment;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public abstract class PageAbstract {

    public PageAbstract() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] takeScreenshot(WebDriver driver) {
        Screenshot screenshot = new AShot().takeScreenshot(driver);
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try {
            ImageIO.write(screenshot.getImage(), "PNG", buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer.toByteArray();
    }
}
