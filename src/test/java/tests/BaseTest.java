package tests;

import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class BaseTest {

    @Before
    public void setUp() {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nika\\Desktop\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        Configuration.browserSize = "1920x1080";
        open("https://staging.app.optio.ai");
        sleep(50000);

    }


}
