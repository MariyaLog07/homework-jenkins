package tests.properties;

import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;

    @Tag("properties")
    public class OwnerTests {
        String url = "https://selenoid.autotests.cloud/wd/hub/";
    public CredentialsConfig credentials = ConfigFactory.create(CredentialsConfig.class);

    @Test
    void readCredentialsTest() {
        String login = credentials.login();
        String password = credentials.password();
        System.out.println(login);
        System.out.println(password);
            String message = format(url, login, password);
        System.out.println(format(url, login, password));
    }
}
