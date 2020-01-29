package homePage_AT_T;

import base.CommonAPI;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends CommonAPI {
    @FindBy(how = How.XPATH, using = "//i[@id='ge5p-menu-active']")
    WebElement Hamburgerlink;
    @FindBy(how = How.XPATH,using = "//i[@class='icon-down']")
   WebElement Acountlink;
    @FindBy(how = How.XPATH,using = "//a[contains(text(),'Sign in')]")
   WebElement SigninLink;
    @FindBy(how = How.XPATH,using = "//input[@id='userName']")
    WebElement enterUserName;
    //input[@id='userName']
    @FindBy(how = How.XPATH,using = "//input[@id='password']")
    WebElement enterPsw;
    @FindBy(how = How.XPATH,using = "//button[@id='loginShowPassword']")
    WebElement showPsw;
    @FindBy(how= How.XPATH,using = "//span[contains(text(),'Sign in')]")
    WebElement signIn;
    @FindBy(how=How.XPATH,using = "//a[@id='forgotUserIdLink']")
    WebElement forgetUser;
    @FindBy(how =How.XPATH,using = "//a[contains(text(),'Forgot contact email?')]")
    WebElement forGetEmail;
    @FindBy(how=How.XPATH,using = "//input[@name='phoneNumber']")
    WebElement enterPhoneNumber;
    //                  *****************************************
    @FindBy(how=How.XPATH,using = "//input[@name='accountNumber']")
    WebElement enterAcct;
    @FindBy(how=How.XPATH,using = "//input[@name='zipCode']")
    WebElement enterZip;
    @FindBy(how=How.XPATH,using = "//button[contains(text(),'Continue')]")
    WebElement signInNext;
    @FindBy(how=How.XPATH,using = "//button[contains(text(),'Cancel')]")
    WebElement clickCancel;
    @FindBy(how=How.XPATH,using = "//i[contains(@class,'styles__att-icon styles__att-icon-close Modal__modal-close-icon')]")
    WebElement cancelPopUp;
    @FindBy(how=How.XPATH,using = "//button[contains(text(),'Cancel')]")
    WebElement cancelAgain;  //6
    @FindBy(how=How.XPATH,using = "//button[contains(text(),'Yes, cancel')]")
    WebElement yesCancelIt;
    @FindBy(how = How.XPATH,using = "//a[@id='forgotPasswordLink']")
    WebElement forgetThePassword;
    @FindBy(how=How.XPATH,using = "//input[@name='userID']")
    WebElement enterThePasswordAgain;
    @FindBy(how=How.XPATH,using = "//input[@name='lastName']")
    WebElement enterTheLastName;

    @FindBy(how=How.XPATH,using = "//button[contains(text(),'Continue')]")
    WebElement needToCo;
    @FindBy(how=How.XPATH,using = "//a[contains(text(),'Forgot user ID?')]")
    WebElement forGetU;
    @FindBy(how=How.XPATH,using = "//input[@name='contactEmail']")
    WebElement enterVEmail;
    @FindBy(how=How.XPATH,using = "//button[contains(text(),'Continue')]")
    WebElement needTC;
    @FindBy(how=How.XPATH,using = "//a[contains(text(),'another way')]")
    WebElement findAnotherWay;
    @FindBy(how=How.XPATH,using = "//input[@name='phoneNumber']")
    WebElement enterThePh;
    @FindBy(how=How.XPATH,using = "//input[@name='accountNumber']")
    WebElement enterTheAc;
    @FindBy(how=How.XPATH,using = "//input[@name='zipCode']")
    WebElement zipCode;
    @FindBy(how=How.XPATH,using = "//button[contains(text(),'Continue')]")
    WebElement clickEToo;
    @FindBy(how=How.XPATH,using = "//button[contains(text(),'Cancel')]")
    WebElement needTo_C;
    //                          *********************************
    @FindBy(how=How.XPATH,using = "//button[contains(text(),'Yes, cancel')]")
    WebElement need_T_Cancel;
    @FindBy(how=How.XPATH,using = "//a[@class='wt_Body']")
    WebElement continue_WithO;
    @FindBy(how=How.XPATH,using = "//input[@name='Active AT&T phone number']")
    WebElement activate_PH;
    @FindBy(how=How.XPATH,using = "//input[@name='Active account number']")
    WebElement activata_Acct;
    @FindBy(how=How.XPATH,using = "//input[@placeholder='5-digit ZIP code']")
    WebElement enterZ_Code;
    //...............
    @FindBy(how=How.XPATH,using = "//body[@class='attgn-page']")
    WebElement clickAm_Not_Robot;
    @FindBy(how=How.XPATH,using = "//button[contains(text(),'Continue')]")
    WebElement further_C;
    @FindBy(how=How.XPATH,using = "//button[contains(text(),'Cancel')]")
    WebElement another_Click_Cancel;




    public void clickhamburger() throws InterruptedException {
        Hamburgerlink.click();
        Thread.sleep(1000);
    }
    public void clickaccount() throws InterruptedException {
        Acountlink.click();
        Thread.sleep(1000);
    }
    public void clickSignin() throws InterruptedException {
        SigninLink.click();
        Thread.sleep(500);
    }
    public void addUserName() throws InterruptedException {
        enterUserName.sendKeys("Sajjad123");
        Thread.sleep(200);
    }
    public void addPsw(){
        enterPsw.sendKeys("pakistan786");
    }
    public void showPassword() throws InterruptedException {
        showPsw.click();
        Thread.sleep(400);
    }
    public void clickSign() throws InterruptedException {
        signIn.click();
        Thread.sleep(2000);
    }
    public void forGetUser() throws InterruptedException {
        forgetUser.click();
        Thread.sleep(4000);
    }
    public void forGetEmailAcct() throws InterruptedException {
        forGetEmail.click();
        Thread.sleep(200);
    }
    public void enterValidPhoneNumber() throws InterruptedException {
        enterPhoneNumber.sendKeys("7189561604");
        Thread.sleep(2000);
    }
    public void enterValidAcct() throws InterruptedException {
        enterAcct.sendKeys("123456789");
        Thread.sleep(2000);
    }
    public void enterValidZipCode() throws InterruptedException {
        enterZip.sendKeys("11102");
        Thread.sleep(2000);
    }
    public void signInNeedToClick(){
        signInNext.click();
    }
    public void clickNeedToCancel() throws InterruptedException {
        clickCancel.click();
        Thread.sleep(1000);
    }
    public void clickThePopUp() throws InterruptedException {
        cancelPopUp.click();
        Thread.sleep(1000);
    }
    public void clickCancelAgain() throws InterruptedException {
        cancelAgain.click();
        Thread.sleep(3000);
    }
    public void clickCancelIt(){
        yesCancelIt.click();
    }
    public void clickforGetThePassword(){
        forgetThePassword.click();
    }
    public void needToEnterThePassword() throws InterruptedException {
        enterThePasswordAgain.sendKeys("786Allah");
        Thread.sleep(1000);
    }
    public void needToEnterTheLastName() throws InterruptedException {
        enterTheLastName.sendKeys("AkkBBAr");
        Thread.sleep(1000);
    }
    public void clickContinueP() throws InterruptedException {
        needToCo.click();
        Thread.sleep(2000);
    }
    public void clickForGetU() throws InterruptedException {
        forGetU.click();
        Thread.sleep(1000);
    }
    public void enterValidE() throws InterruptedException {
        enterVEmail.sendKeys("sadfr@gmail.com");
        Thread.sleep(2000);
    }
    public void clickNTContinue() throws InterruptedException {
        needTC.click();
        Thread.sleep(1000);
    }
    public void findAnotherW() throws InterruptedException {
        findAnotherWay.click();
        Thread.sleep(1000);
    }
    public void enterValidPhone() throws InterruptedException {
        enterThePh.sendKeys("7199673456");
        Thread.sleep(1000);
    }
    public void enterVAC(){
        enterTheAc.sendKeys("234567892");
    }
    public void enterZipCode_Too(){
        zipCode.sendKeys("11104");
    }
    public void clickContinueAgT() throws InterruptedException {
        clickEToo.click();
        Thread.sleep(1000);
    }
    public void needTo_Cancel() throws InterruptedException {
        needTo_C.click();
        Thread.sleep(500);
    }
    public void n_T_Cancel() throws InterruptedException {
        need_T_Cancel.click();
        Thread.sleep(500); // 1000
    }
    public void continute_WithOut_Signing() throws InterruptedException {
        continue_WithO.click();
        Thread.sleep(1000); // 2000
    }
    public void activate_New_Ph() throws InterruptedException {
        activate_PH.sendKeys("3489561602");
        Thread.sleep(500); //1000
    }
    public void activate_New_Acct() throws InterruptedException {
        activata_Acct.sendKeys("3467864567");
        Thread.sleep(500); //1000
    }
    public void enterZip_Code() throws InterruptedException {
        enterZ_Code.sendKeys("11101");
        Thread.sleep(500);   //1000
    }
    public void not_Robot() throws InterruptedException {
        clickAm_Not_Robot.click();
        Thread.sleep(2000);
    }
    public void further_Continues() throws InterruptedException {
        further_C.click();
        Thread.sleep(1000);
    }
    public void anotherNToCancel() throws InterruptedException {
        another_Click_Cancel.click();
        Thread.sleep(2000);
    }
    // All testst passed except go further continue in the Robot page










}

