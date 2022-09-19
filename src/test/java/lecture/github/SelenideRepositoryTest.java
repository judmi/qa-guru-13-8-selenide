package lecture.github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositoryTest {

    @Test
    void shouldFindSelenideAsFirstRepository() {
        //open lecture.github.com
        open("https://github.com");
        //input in search "Selenide" and press Enter
        $("[data-test-selector='nav-search-input']").setValue("selenide").pressEnter();
        //press the first link in search results
        $$("ul.repo-list li").first().$("a").click();
        //check: there is Selenide in title
        //$("#repository-container-header").shouldHave(text("selenide\n/\nselenide"));
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
        //Assertions.assertEquals($("#repository-container-header").getText(), "selenide / selenide");

        sleep(5000);
    }

}
