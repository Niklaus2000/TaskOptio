package steps;

import com.codeborne.selenide.Selenide;
import data.UsedData;
import org.openqa.selenium.Keys;
import pages.ContactListsPages;

import static com.codeborne.selenide.Selenide.sleep;

public class ContactListsSteps  extends ContactListsPages {


    public ContactListsSteps newButtonClick() {
        newButton.click();
        Selenide.actions().sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).perform();
        return this;
    }

    public ContactListsSteps saveRecord() {
        titleInput.sendKeys("test");
        descriptionInput.sendKeys("list");
        sleep(3000);
        saveButton.click();
        return this;
    }

    public ContactListsSteps fileDownload() {
        downloadButton.click();
        sleep(5000);
        csvFile.click();
        sleep(5000);
        return this;
    }


    public ContactListsSteps addFile() {
        addFile.click();
        sleep(5000);
        return this;
    }

    public ContactListsSteps addPersonManually() {
        addButton.click();
        sleep(5000);

        personalId.sendKeys(UsedData.personalIdValue);
        firstName.sendKeys(UsedData.firstNameValue);
        lastName.sendKeys(UsedData.lastNameValue);
        gender.click();
        Selenide.actions().sendKeys(Keys.ENTER).perform();
        birthDate.sendKeys(UsedData.birthDateValue);
        mobile.sendKeys(UsedData.mobileValue);
        email.sendKeys(UsedData.emailValue);
        savePerson.click();
        sleep(10000);

        return this;
    }

    public ContactListsSteps alertFix() {

        if (alertConfirmButton.exists()) {
            alertConfirmButton.click();
        }
        sleep(5000);

     return this;
    }



}


