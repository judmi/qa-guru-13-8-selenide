package tests.hw;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSoftAssertionsTest extends BaseTest {

    @DisplayName("Check if there is JUnit5 code example on a SoftAssertions page in Selenide Wiki")
    @Test
    void SelenideSoftAssertionsTest() {
        githubSelenidePage.openPage();
        $("#wiki-tab").click();
        $("#wiki-pages-filter").val("SoftAssertions").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $(byText("SoftAssertions")).click();
        $("#wiki-content").shouldHave(text("JUnit5"));
    }
}
