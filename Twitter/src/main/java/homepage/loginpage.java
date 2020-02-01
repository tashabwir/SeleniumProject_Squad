package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.lang.ref.WeakReference;

public class loginpage extends CommonAPI {

    @FindBy (how = How.XPATH, using = "(//div[contains(@class,'css-901oao r-1awozwy')])[5]")
    public static WebElement LoginPageBtn;

    @FindBy (how = How.NAME, using = "session[username_or_email]")
    public static WebElement PhnUsrEmailtxtbx;

    @FindBy (how = How.NAME, using = "session[password]")
    public static WebElement Passtxtbx;

    @FindBy (how = How.XPATH, using = "(//span[text()='Log in'])[1]")
    public static WebElement Loginbtn;

    ///////////////////////////////////////////////////////

    @FindBy (how = How.XPATH, using = "//span[text()='Forgot password?']")
    public static WebElement FrgtPass;

    @FindBy (how = How.NAME, using = "account_identifier")
    public static WebElement AcntIdntfr;

    @FindBy (how = How.XPATH, using = "//input[contains(@class,'Button EdgeButton--primary')]")
    public static WebElement AcntSearchBtn;

    @FindBy (how = How.XPATH, using = "//div[@class='PageHeader is-errored']")
            public static WebElement ErrorPage;

    ///////////////////////////////////////////////////////

    public static boolean validateURL(WebDriver driver, String ExpURL){
        boolean result = false;
        if (driver.getCurrentUrl().equalsIgnoreCase(ExpURL)){
            result = true;
        } return result;
    }

    @FindBy (how = How.XPATH, using = "//div[@class='PageHeader Edge']")
    public static WebElement FrgtPassTitle;

    public void checkFrgtPassTitle(){
        String title = driver.getTitle();
        String expected = "Find your Twitter account";
    }

}
