package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TaskBarPages {
    public static final SelenideElement taskbar = $("fuse-vertical-navigation[class ='dark bg-gray-900 print:hidden ng-tns-c2093523954-4 fuse-vertical-navigation-animations-enabled fuse-vertical-navigation-appearance-dense fuse-vertical-navigation-mode-side fuse-vertical-navigation-opened fuse-vertical-navigation-position-left ng-star-inserted']");
    public static final SelenideElement customerButton = $("fuse-vertical-navigation-collapsable-item", 2);
    public  static final SelenideElement contactListButton = $("fuse-vertical-navigation-basic-item[class ='ng-tns-c542366742-22 ng-star-inserted']", 3);
    public  static final SelenideElement customersList= $$("span").findBy(exactText(" Customers List "));

}
