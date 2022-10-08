package tests.hw;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.GithubSelenidePage;

public class BaseTest {
    GithubSelenidePage githubSelenidePage = new GithubSelenidePage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://github.com";
        Configuration.browserSize = "1920x1080";
    }

}
