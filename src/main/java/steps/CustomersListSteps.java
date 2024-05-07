package steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import data.UsedData;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.CustomersListPages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


public class CustomersListSteps extends CustomersListPages {

    public CustomersListSteps filterSearch(String nameValue) {

        inputButton.sendKeys(nameValue);
        Selenide.actions().sendKeys(Keys.ENTER).perform();

        return this;
    }

    public CustomersListSteps filterSearchResultCheck() {
        sleep(8000);
        SelenideElement table =  $("tbody[class = 'mdc-data-table__content']")

                .find("tr", 0)
                .find("td", 2);
        String tableFirstValue = table.getText();
        Assert.assertEquals(tableFirstValue, UsedData.firstNameValue);

        return this;


    }


}
