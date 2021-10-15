package ru.desnol;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import io.qameta.allure.selenide.AllureSelenide;
import com.codeborne.selenide.logevents.SelenideLogger;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

           // DesiredCapabilities capabilities = new DesiredCapabilities();
           // capabilities.setCapability("enableVNC", true);
           // capabilities.setCapability("enableVideo", true);

            //Configuration.browserCapabilities = capabilities;
           //Configuration.startMaximized = true;
           // Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub/";
        }

       // @AfterEach
       // public void tearDown() {
           // Attach.screenshotAs("Last screenshot");
           // Attach.pageSource();
           // Attach.browserConsoleLogs();
           // Attach.addVideo();
        }

   // }
//}

