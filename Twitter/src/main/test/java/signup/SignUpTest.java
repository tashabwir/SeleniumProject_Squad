package signup;

import homepage.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SignUpTest extends SignUpPage {


    //open twitter page and click sign in button
    @Test(enabled = true)
    public static void clickOnSignUpBtn() throws InterruptedException {
        SignUpPage signuppage = PageFactory.initElements(driver, SignUpPage.class);
        clickOnSignUpBtn();
        Thread.sleep(3000);
    }

    //drop down test
    @Test(enabled = true)
    public void Monthdropdown() throws InterruptedException {
        SignUpPage signuppage = PageFactory.initElements(driver, SignUpPage.class);
        getSignUpBtn().click();
        Select dropDown = new Select(driver.findElement(By.id("(//select[contains(@class,'r-30o5oe r-1niwhzg')])[1]")));
        dropDown.selectByValue("February");
        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void Daydropdown() throws InterruptedException {
        SignUpPage signuppage = PageFactory.initElements(driver, SignUpPage.class);
        getSignUpBtn().click();
        Select dropDown = new Select(driver.findElement(By.id("(//select[contains(@class,'r-30o5oe r-1niwhzg')])[2]")));
        dropDown.selectByValue("15");
        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void NegDaydropdown() throws InterruptedException {
        SignUpPage signuppage = PageFactory.initElements(driver, SignUpPage.class);
        getSignUpBtn().click();
        Select dropDown = new Select(driver.findElement(By.id("(//select[contains(@class,'r-30o5oe r-1niwhzg')])[2]")));
        dropDown.selectByValue("30");
        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void Yeardropdown() throws InterruptedException {
        SignUpPage signuppage = PageFactory.initElements(driver, SignUpPage.class);
        getSignUpBtn().click();
        Select dropDown = new Select(driver.findElement(By.id("(//select[contains(@class,'r-30o5oe r-1niwhzg')])[3]")));
        dropDown.selectByValue("1995");
        Thread.sleep(5000);
    }

    //test account creation with an email
    @Test(enabled = false)
    public void SignUpWithEmail() throws InterruptedException {
        SignUpPage signuppage = PageFactory.initElements(driver, SignUpPage.class);
        SignUpPage.clickOnSignUpBtn();
        //getSignUpBtn().click();
        clickSwitchBtwnNumAndEmail();
        //getNameField().sendKeys("Bob Smith");
        signuppage.setNameField(signuppage.getName());
        //setNameField("Sheikh Tashabwir");
        signuppage.setEmailField(signuppage.email);
        Monthdropdown();
        Daydropdown();
        Yeardropdown();
        Thread.sleep(5000);
    }

    //test account creation with a phone number
    @Test(enabled = true)
    public void SignUpWithNum() throws InterruptedException {
        SignUpPage signuppage = PageFactory.initElements(driver, SignUpPage.class);
        SignUpPage.clickOnSignUpBtn();
        //SignUpPage.setNameField(signuppage.getName());
        setPhoneNumField("9176152418");
        Monthdropdown();
        Daydropdown();
        Yeardropdown();
        Thread.sleep(5000);
        SignUpPage.ClickOnNextSignUpPage();
    }
}
