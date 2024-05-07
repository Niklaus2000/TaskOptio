package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CustomersListPages {
    public  static final  SelenideElement inputButton = $("input[placeholder ='Choose the filter...']");

}
