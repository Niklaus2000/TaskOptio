package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ContactListsPages {
   public static final SelenideElement newButton = $("button[class='mat-mdc-menu-trigger ml-2 mdc-button mdc-button--unelevated mat-mdc-unelevated-button mat-primary mat-mdc-button-base ng-star-inserted']");
   public static final SelenideElement titleInput = $("input[placeholder ='Title']");
   public static final SelenideElement descriptionInput = $("input[placeholder ='Description']");
   public static final SelenideElement saveButton = $$("span").findBy(exactText("Save"));
   public static final SelenideElement downloadButton = $$("span").findBy(exactText("Download Template"));
   public static final SelenideElement csvFile = $("span[class = 'mat-mdc-button-touch-target']", 20);
   public static final SelenideElement addFile = $$("span").findBy(exactText("Add From File"));
   public static final SelenideElement addButton = $$("span").findBy(exactText("Add"));
   public static final SelenideElement personalId = $("input[formcontrolname='pid']");
   public static final SelenideElement firstName = $("input[formcontrolname='firstName']");
   public static final SelenideElement lastName = $("input[formcontrolname='lastName']");
   public static final SelenideElement gender = $("mat-select[role= 'combobox']",1);
   public static final SelenideElement birthDate = $("input[formcontrolname='birthDate']");
   public static final SelenideElement mobile = $("input[formcontrolname='mobile']");
   public static final SelenideElement email = $("input[formcontrolname='email']");public static final SelenideElement savePerson = $("button[class ='w-full mdc-button mdc-button--raised mat-mdc-raised-button mat-primary mat-mdc-button-base']",1);
   public static final SelenideElement alertConfirmButton =$$("span").findBy(exactText(" Confirm "));

}
