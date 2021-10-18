package tests.properties;

import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;

    @Tag("properties")
    public class OwnerTests {
        String url = System.getProperty("url","selenoid.autotests.cloud/wd/hub/");
    public CredentialsConfig credentials = ConfigFactory.create(CredentialsConfig.class);

    @Test
    void readCredentialsTest() {
        String login = credentials.login();
        String password = credentials.password();
        System.out.println(login);
        System.out.println(password);
        String result = format("https://%s:%s%s", login, password,url);
        System.out.println(result);
    }
}
