package steps;


import data.UsedData;
import pages.LoginPages;

public class LoginPageSteps extends LoginPages {

    public LoginPageSteps login(){
    email.sendKeys(UsedData.loginEmail);
    password.sendKeys(UsedData.password);
    buttonTapped.click();
        return this;
    }

}
