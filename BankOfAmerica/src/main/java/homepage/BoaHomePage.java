package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class BoaHomePage extends CommonAPI{

    @FindBy(how = How.ID, using = "NAV_PERSONAL")
    public static WebElement personalWebElement;

    @FindBy(how = How.CSS, using = "#NAV_BUSINESS_ADVANTAGE")
    public static WebElement smallBusinessWebElement;

    @FindBy(how = How.CSS, using = "#NAV_WEALTH_MANAGEMENT")
    public static WebElement wealthManagemetWebElement;

    @FindBy(how = How.CSS, using = "#NAV_BUSINESS_INSTITUTIONS")
    public static WebElement businessInstitutionWebElement;

    @FindBy(how = How.ID, using = "NAV_SECURITY")
    public static WebElement securityWebElement;

    @FindBy(how = How.LINK_TEXT, using = "About Us")
    public static WebElement aboutUsWebElement;

    @FindBy(how = How.CSS, using = "#NAV_EN_ES")
    public static WebElement enEspanolWebElement;

    @FindBy(how = How.CSS, using = "#NAV_CONTACT_US")
    public static WebElement contactUsWebElement;

    @FindBy(how = How.CSS, using = "#NAV_HELP")
    public static WebElement helpnWebElement;

    @FindBy(how = How.XPATH, using = "//input[@id='nav-search-query' and @class='search-query']")
    public static WebElement helpSearchBarWebElement;

    @FindBy(how = How.CSS, using = ".submit")
    public static WebElement helpSearchButtonWebElement;

    @FindBy(how = How.XPATH, using = "//a[@class='track-me' and @name='Search Module - Top Result - See More Search Results']")
    public static WebElement viewAllSearchWebElement;

    @FindBy(how = How.CSS, using = ".search-form")
    public static WebElement popUpHelpSuggestionsWebElement;

    @FindBy(how = How.CSS, using = "a[name='Search Module - Feedback']")
    public static WebElement feedbackWebElement;

    @FindBy(how = How.ID, using ="navChecking")
    public static WebElement checkingWebElement;

    public WebElement getHelpSearchButtonWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return helpSearchButtonWebElement;
    }
}
