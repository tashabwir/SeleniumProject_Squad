package signup;

import homepage.SignUpPage;
import homepage.loginpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginTest extends loginpage {

    @Test
    public void URLvalidation(){
        loginpage logInpage = PageFactory.initElements(driver, loginpage.class);
        boolean result = validateURL(driver, "https://twitter.com/");
        Assert.assertTrue(result);
    }
    @Test(enabled = true)
    public void loginBtnWorks(){
        loginpage logInpage = PageFactory.initElements(driver, loginpage.class);
        loginpage.LoginPageBtn.click();
        //check if login button navigated to login solo page
    }

    @Test(enabled = true)
    public void SuccessfulLoginWithURL(){
        loginpage logInpage = PageFactory.initElements(driver, loginpage.class);
        loginpage.PhnUsrEmailtxtbx.sendKeys("9176152418");
        loginpage.Passtxtbx.sendKeys("niloy007");
        loginpage.Loginbtn.click();
        boolean result = validateURL(driver, "https://twitter.com/home");
        Assert.assertTrue(result);
    }

    @Test(enabled = true)
    public void SuccessfulLoginWithTitle(){
        loginpage logInpage = PageFactory.initElements(driver, loginpage.class);
        loginpage.PhnUsrEmailtxtbx.sendKeys("9176152418");
        loginpage.Passtxtbx.sendKeys("niloy007");
        loginpage.Loginbtn.click();
        logInpage.checkFrgtPassTitle();
        Assert.assertEquals(loginpage.FrgtPassTitle.getText(), "Home");
    }

    @Test(enabled = true)
    public void ForgotPassBtn(){
        loginpage logInpage = PageFactory.initElements(driver, loginpage.class);
        logInpage.FrgtPass.click();
        logInpage.checkFrgtPassTitle();
        Assert.assertEquals(loginpage.FrgtPassTitle.getText(), "Find your Twitter account");
    }

    @Test(enabled = true)
    public void ForgotPassBtnFail(){
        loginpage logInpage = PageFactory.initElements(driver, loginpage.class);
        logInpage.FrgtPass.click();
        logInpage.checkFrgtPassTitle();
        Assert.assertEquals(loginpage.FrgtPassTitle.getText(), "Find your Twitter account");
    }


}
