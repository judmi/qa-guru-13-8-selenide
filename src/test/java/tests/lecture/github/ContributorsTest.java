package tests.lecture.github;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ContributorsTest {

    @Test
    void solntsevShouldBeFirstContributor() {
        // open repository page
        Configuration.browserSize = "800x400";
        open("https://github.com/selenide/selenide");
        // move mouse over the first avatar on contributors tab
        $(".Layout-sidebar").$$("h2").filterBy(text("Contributors"))
                .first()
                .sibling(0).$$("li").first().hover();
                // .parent().$$("ul li").first().hover();
        // findBy = filterBy + first
        // check: popup is showing Andrei Solntsev
        $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));
    }
}
