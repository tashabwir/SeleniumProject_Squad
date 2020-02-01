package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FeedPage extends CommonAPI {

    @FindBy (how = How.XPATH, using = "/html/body/div/div/div/div/header/div/div/div/div/div[2]/nav/a[1]/div/div/svg")
    public static WebElement feedHomeBtn;

    @FindBy (how = How.XPATH, using = "(//div[contains(@class,'css-1dbjc4n r-1awozwy')])[2]")
    public static WebElement TrendsBtn;

    @FindBy (how = How.XPATH, using = "(//div[contains(@class,'css-1dbjc4n r-1awozwy')])[3]")
    public static WebElement NotificationsBtn;

    @FindBy (how = How.XPATH, using = "(//div[contains(@class,'css-1dbjc4n r-1awozwy')])[4]")
    public static WebElement messagesBtn;

    @FindBy (how = How.XPATH, using = "(//div[contains(@class,'css-1dbjc4n r-1awozwy')])[5]")
    public static WebElement bookmarksBtn;

    @FindBy (how = How.XPATH, using = "//div[@id='react-root']/div[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/a[6]/div[1]")
    public static WebElement ListsBtn;

    @FindBy (how = How.XPATH, using = "//div[@id='react-root']/div[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/a[7]/div[1]")
    public static WebElement profileBtn;

    @FindBy (how = How.XPATH, using = "//div[text()='More']")
    public static WebElement moreBtn;

    ////////////////////////////////////////////////////////////////
    @FindBy (how = How.XPATH, using = "(//span[text()='Home'])[2]")
    public static WebElement homeTitle;

    @FindBy (how = How.XPATH, using = "//span[text()='Trends for you']")
    public static WebElement trendsTitle;

    @FindBy (how = How.XPATH, using = "(//span[text()='Notifications'])[2]")
    public static WebElement notificationsTitle;

    @FindBy (how = How.XPATH, using = "(//span[text()='Messages'])[2]")
    public static WebElement msgsTitle;

    @FindBy (how = How.XPATH, using = "(//span[text()='Bookmarks'])[2]")
    public static WebElement bkmrksTitle;

    @FindBy (how = How.XPATH, using = "(//span[text()='Lists'])[2]")
    public static WebElement listsTitle;

    @FindBy (how = How.XPATH, using = "//span[text()='Edit profile']")
    public static WebElement profTitle;

    @FindBy (how = How.XPATH, using = "//span[text()='Log out']")
    public static WebElement logOutBtn;





}
