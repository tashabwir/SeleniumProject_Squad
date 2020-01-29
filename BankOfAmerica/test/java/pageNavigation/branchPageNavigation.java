package pageNavigation;

import base.CommonAPI;
import homepage.BoaHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class branchPageNavigation extends CommonAPI {


@Parameters({"smallBusinessUrl"})
@Test
//This test checks weather the 'Small Business' element takes the user to the small business page
    public void smallBusinessTabFunctionality(String smallBusinessUrl) throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    driver.get("https://bankofamerica.com");
    driver.navigate().to(smallBusinessUrl);
    String smallBusinessPageTitle = driver.getTitle();
    navigateBack();
    //driver.navigate().back();
    BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
    bhp.smallBusinessWebElement.click();
    String currentPageTitle = driver.getTitle();
    Assert.assertEquals(currentPageTitle, smallBusinessPageTitle);
}
@Parameters({"wealthManagementUrl"})
    @Test
//This test checks weather the 'Wealth Management' element takes the user to the wealth management page
    public void wealthManagementTabFunctionality(String wealthManagementUrl) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate().to(wealthManagementUrl);
        String wealthManagementPageTitle = driver.getTitle();
        driver.navigate().back();
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.wealthManagemetWebElement.click();
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, wealthManagementPageTitle);
    }
    @Parameters({"businessInstitutionUrl"})
    @Test
//This test checks weather the 'Business and Institution' element takes the user to the business and institution page
    public void businessNInstitutionTabFunctionality(String businessInstitutionUrl) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate().to(businessInstitutionUrl);
        String businessNInstitutionPageTitle = driver.getTitle();
        driver.navigate().back();
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.businessInstitutionWebElement.click();
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, businessNInstitutionPageTitle);
    }
    @Parameters({"securityUrl"})
    @Test
//This test checks weather the 'Security' element takes the user to the security page
    public void securityTabFunctionality(String securityUrl) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate().to(securityUrl);
        String securityPageTitle = driver.getTitle();
        driver.navigate().back();
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.securityWebElement.click();
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, securityPageTitle);
    }
    @Parameters({"aboutUsUrl"})
    @Test
    //This test checks weather the 'About Us' element takes the user to the about us page
    public void aboutUsTabFunctionality(String aboutUsUrl) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate().to(aboutUsUrl);
        String aboutUsPageTitle = driver.getTitle();
        driver.navigate().back();
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.aboutUsWebElement.click();
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, aboutUsPageTitle);
    }
    @Parameters({"enEspanolUrl"})
    @Test
    //This test checks weather the 'En español' element takes the user to the spanish page
    public void EnEspañolTabFunctionality(String enEspanolUrl) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate().to(enEspanolUrl);
        String enEspanolPageTitle = driver.getTitle();
        driver.navigate().back();
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.enEspanolWebElement.click();
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, enEspanolPageTitle);
    }
    @Parameters({"contactUsUrl"})
    @Test
    //This test checks weather the 'Contact Us' element takes the user to the contact us page
    public void contactUsTabFunctionality(String contactUsUrl) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.get("https://www.bankofamerica.com");
        driver.navigate().to(contactUsUrl);
        String contactUsPageTitle = driver.getTitle();
        driver.navigate().back();
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.contactUsWebElement.click();
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, contactUsPageTitle);
    }
    @Test
    //Checks if the pop-up window for state selection appears on clicking the help element
    public void helpTabFunctionality(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.helpnWebElement.click();
        isPopUpWindowDisplayed(driver,"#stateModalContent > h3:nth-child(1)");
    }


}
