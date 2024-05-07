package tests;
import Utils.FileUploadAutomatically;
import com.codeborne.selenide.*;
import data.UsedData;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.$;
import data.UsedData.*;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.Configuration;
import pages.ContactListsPages;
import pages.CustomersListPages;
import steps.ContactListsSteps;
import steps.CustomersListSteps;
import steps.LoginPageSteps;
import steps.TaskBarSteps;

import java.awt.*;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static data.UsedData.filepath;
import static data.UsedData.firstNameValue;


public class MainTest  extends BaseTest{

    @Test
    public void testLoginWithValidCredentials() throws AWTException {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        CustomersListSteps customersListSteps = new CustomersListSteps();
        TaskBarSteps taskBarSteps = new TaskBarSteps();
        ContactListsSteps contactListsSteps = new ContactListsSteps();

        loginPageSteps
                .login();

        sleep(5000);

        taskBarSteps
                .taskbarHover()
                .customerButtonClick()
                .contactListButtonClick();
        contactListsSteps
                .newButtonClick()
                .saveRecord();

        sleep(5000);

        contactListsSteps
                .fileDownload()
                .addFile();

        String[] filePaths = { filepath

        };

        FileUploadAutomatically.main(filePaths);
        sleep(5000);

        contactListsSteps
                .addPersonManually()
                .alertFix();

        taskBarSteps
                .customerButtonClick();
        taskBarSteps
                .customersListClick();
        customersListSteps
                        .filterSearch(UsedData.firstNameValue)
                .filterSearchResultCheck();


    }

    }












