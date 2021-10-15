package ru.desnol;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import io.qameta.allure.selenide.AllureSelenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import org.openqa.selenium.remote.DesiredCapabilities;
import ru.desnol.helpers.Attach;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        DesiredCapabilities capabilities = new DesiredCapabilities();
           capabilities.setCapability("enableVNC", true);
           capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
        Configuration.startMaximized = true;
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub/";
        }

        @AfterEach
       public void tearDown() {
        Attach.screenshotAs("My screenshot");
           Attach.pageSource();
           Attach.browserConsoleLogs();
           Attach.addVideo();
        }

    }


