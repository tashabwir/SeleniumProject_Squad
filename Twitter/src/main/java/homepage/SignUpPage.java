package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends CommonAPI {

    public String email = "sstashabwir@gmail.com";

    private String name = "Bob Smith";

    //sign up button
    @FindBy(how = How.XPATH, using = "/html/body/div/div/div/div/main/div/div/div/div[1]/div/a[1]")
    private static WebElement  signUpBtn;

    //name text box
    @FindBy(name = "name")
    private static WebElement nameField;

    //Switch between email and number
    @FindBy(how = How.XPATH, using = "/html/body/div/div/div/div/main/div/div/div/div[2]/div[2]/div/div[4]/span")
    private static WebElement switchBtwnNumAndEmail;

    //phone number text box
    @FindBy(name = "phone_number")
    private static WebElement phoneNumField;

    //email text box
    @FindBy(name = "email")
    private static WebElement emailField;

    //DOB month
    @FindBy(xpath = "(//select[contains(@class,'r-30o5oe r-1niwhzg')])[1]")
    private static WebElement monthDropDown;

    //DOB day
    @FindBy(xpath = "(//select[contains(@class,'r-30o5oe r-1niwhzg')])[2]")
    private static WebElement dayDropDown;

    //DOB year
    @FindBy(xpath = "(//select[contains(@class,'r-30o5oe r-1niwhzg')])[3]")
    private static WebElement yearDropDown;

    //next button
    @FindBy(xpath = "(//span[contains(@class,'css-901oao css-16my406')])[2]")
    private static WebElement  nextSignUpPage;

    // ****** GETTERS/SETTERS ******

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static WebElement getSignUpBtn(){
        return signUpBtn;
    }

    public static WebElement getSwitchBtwnNumAndEmail() {
        return switchBtwnNumAndEmail;
    }

    public static WebElement getNameField(){
        return nameField;
    }

    public static WebElement getPhoneNumField(){
        return phoneNumField;
    }

    public static WebElement getEmailField(){
        return emailField;
    }

    public static WebElement getMonthDropDown(){
        return monthDropDown;
    }

    public static WebElement getDayDropDown(){
        return dayDropDown;
    }

    public static WebElement getYearDropDown(){
        return yearDropDown;
    }

    public static WebElement getNextSignUpPage(){
        return nextSignUpPage;
    }

    public void setNameField(String name){
        this.name = name;
        getNameField().sendKeys(name);
    }

    public static void setPhoneNumField(String number){
        getPhoneNumField().sendKeys(number);
    }

    public void setEmailField(String email){
        this.email = email;
        getEmailField().sendKeys(email);
    }

    public static void setMonthDropDown(String value){
        Select monthDropDown = new Select (driver.findElement(By.className("r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-jwli3a r-1loqt21 r-1b6yd1w r-crgep1 r-1ny4l3l r-t60dpp r-1inuy60 r-n072k1 r-vmopo1 r-9qu9m4")));
        monthDropDown.selectByValue(value);
    }

    public static void setDayDropDown(String value){
        Select DayDropDown = new Select (driver.findElement(By.className("r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-jwli3a r-1loqt21 r-1b6yd1w r-crgep1 r-1ny4l3l r-t60dpp r-1inuy60 r-n072k1 r-vmopo1 r-9qu9m4")));
        DayDropDown.selectByValue(value);
    }

    public static void setYearDropDown(String value){
        Select YearDropDown = new Select (driver.findElement(By.className("r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-jwli3a r-1loqt21 r-1b6yd1w r-crgep1 r-1ny4l3l r-t60dpp r-1inuy60 r-n072k1 r-vmopo1 r-9qu9m4")));
        YearDropDown.selectByValue(value);
    }
    // ****** METHODS ******

    public static void clickOnSignUpBtn() throws InterruptedException {
        getSignUpBtn().click();
    }

    public static void  clickSwitchBtwnNumAndEmail(){
        getSwitchBtwnNumAndEmail().click();

    }

    public static void ClickOnNextSignUpPage(){
        getNextSignUpPage().click();
    }


}
