package homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BoaHomePage {

    @FindBy(how = How.ID, using = "NAV_PERSONAL")
    public static WebElement personalWebElement;

    @FindBy(how = How.ID, using = "NAV_BUSINESS_ADVANTAGE")
    public static WebElement smallBussinessWebElement;

    @FindBy(how = How.ID, using = "NAV_WEALTH_MANAGEMENT")
    public static WebElement wealthManagemetWebElement;

}
