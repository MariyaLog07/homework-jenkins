package tests.properties;

import com.codeborne.selenide.Configuration;
import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


import static java.lang.String.format;

    @Tag("properties")
    public class OwnerTests {

    public CredentialsConfig credentials = ConfigFactory.create(CredentialsConfig.class);

    @Test
    void readCredentialsTest() {
        String url = System.getProperty("url", "https://selenoid.autotests.cloud/wd/hub/");
        String login = credentials.login();
        String password = credentials.password();
        String remote = format("https://%s:%s@%s", login, password, url);
        Configuration.remote=remote;
        System.out.println(remote);
    }
}
