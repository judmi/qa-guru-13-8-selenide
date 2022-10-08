package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class GithubSelenidePage {
    public GithubSelenidePage openPage(){
        open("/selenide/selenide");
        $("#repository-container-header").shouldHave(text("selenide / selenide"));

        return this;
    }
}
