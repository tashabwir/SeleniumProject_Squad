package homePageUHC;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UhcHomePage extends CommonAPI {

    @FindBy(how = How.XPATH, using = "//div[@class='desktop__menu flex-center position-relative justify-between']//li[2]")
    WebElement indvfamly;

    // here need to write down the @ find by  element@
    //driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div[1]/div[1]/div[2]/div[1]/div/nav/ul/li[4]/a")).click();
    //String QLocator = "//h1[text()=\"What do Medicare Parts A and B (Original Medicare) cover?\"]"

   @FindBy(how = How.XPATH,using = "//div[@class='desktop__menu flex-center position-relative justify-between']//li[3]")
   WebElement empy;
   @FindBy(how = How.XPATH,using = "//div[@class='global-nav']//a[contains(@class,'nav-link position-relative size-16 lineHeight-h3 display-inlineBlock weight-medium pb-1 sm-pb-0')][contains(text(),'Medicare')]")
   WebElement medicare;
   @FindBy(how = How.XPATH,using = "//a[contains(text(),'View Medicare Plans')]")
   WebElement findplan;


   @FindBy(how = How.XPATH,using = "//div[@class='find-doctor position-relative talign-center']//a[@class='position-relative'][contains(text(),'Find a Doctor')]")
   WebElement findDoctor;  //1


   @FindBy(how = How.CSS,using = "a[href=’ https://www.yourdentalplan.com/dentistsearch4’]")
   WebElement findDentist;  //2
    @FindBy(how = How.XPATH,using = "//div[@class='utility-nav mx-2']//a[contains(text(),'For Providers')]")
    WebElement forProvider;



    @FindBy(how= How.XPATH,using = "//div[@class='component cta cta--button cta--left aem-GridColumn aem-GridColumn--default--12']//a[contains(text(),'Sign In')]")
    WebElement forSign;




    // Bottom need to write the method   in the running class need to call the method to run the test
    public void clickSign(){
        forSign.click();
    }

    public void clickindvfamly(){
        indvfamly.click();
    }
    public void findPro(){
        forProvider.click();
    }


    public void clickemply(){         // clickemply   it can be any name
        empy.click();
    }
    public void clickMedicare(){
        medicare.click();
    }
    public void clickplan(){
        findplan.click();
    }
    public void clickfindDr(){
        findDoctor.click();
    }
    public void clickfindDentist(){
        findDentist.click();
    }




}
