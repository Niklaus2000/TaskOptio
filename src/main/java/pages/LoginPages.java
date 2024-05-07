package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LoginPages {
    public static final SelenideElement email = $("#email");
    public static final SelenideElement password = $("#password");
    public static final SelenideElement buttonTapped = $$("span").findBy(exactText("Login"));

}
