package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommentCard extends CommonAPI{

    @FindBy(how=How.LINK_TEXT, using = "Contact Us")
    public static WebElement contactUsWebElement;

    @FindBy(how=How.CSS, using = "#c4")
    public static WebElement contentRadio4WebElement;

    @FindBy(how=How.CSS, using = "#d5")
    public static WebElement layoutRadio5WebElement;

    @FindBy(how=How.CSS, using = "#u4")
    public static WebElement easeOfUseRadio4WebElement;

    @FindBy(how=How.CSS, using = "#o5")
    public static WebElement overallUseRadio5WebElement;

    @FindBy(how=How.CSS, using = ".large")
    public static WebElement textBoxWebElement;

    @FindBy(how=How.CSS, using = "#submitButton")
    public static WebElement submitWebElement;

    @FindBy(how=How.CSS, using = "#footerLink1")
    public static WebElement privacyAndSecurityWebElement;

}
