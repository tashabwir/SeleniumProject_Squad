package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YouTubeSignInPage extends CommonAPI {
    // @FindBy(xpath = "//*[@id=\"button\"]")
    // @FindBy(css = "ytd-button-renderer[id='sign-in-button']")
    @FindBy(xpath = "/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/div[2]/ytd-button-renderer")
    WebElement signInBtn;

    @FindBy(id = "identifierId")
    WebElement signInEmail;

    @FindBy(xpath = "//*[@id=\"identifierNext\"]/span/span")
    WebElement signInEmailNextBtn;

    @FindBy(name = "password")
    WebElement signInPassword;

    @FindBy(xpath = "//*[@id=\"passwordNext\"]/span")
    WebElement signInPasswordNextBtn;

    public void signIn(String email, String password) {
        signInBtn.click();
        signInEmail.sendKeys(email);
        signInEmailNextBtn.click();
        signInPassword.sendKeys(password);
        signInPasswordNextBtn.click();
    }
}

