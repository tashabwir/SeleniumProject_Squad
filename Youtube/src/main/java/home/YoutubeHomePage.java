package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YoutubeHomePage extends CommonAPI {

    @FindBy(css = "ytd-topbar-logo-renderer[id= 'logo']")
    WebElement logoIcon;

    @FindBy(id = "search")
    WebElement homeSearchBox;

    @FindBy(xpath = "//*[@id=\"search-icon-legacy\"]/yt-icon")
    WebElement searchBtn;

    @FindBy(xpath = "//button[@id='button' and @aria-label='Guide']")
    WebElement hamburgerMenuIcon;

    @FindBy(xpath = "//button[@class='style-scope yt-icon-button' and @aria-label='Settings']")
    WebElement settings;

    @FindBy(css = "a[title='Home']")
    WebElement homeBtn;

    @FindBy(xpath = "//a[@id='endpoint' and @href='/feed/trending']")
    WebElement trendingBtn;

    @FindBy(xpath = "//button[@class='style-scope yt-icon-button' and @aria-label='Create a video or post']")
    WebElement videoIcon;

    @FindBy(css = "a[title='Subscriptions']")
    WebElement subscriptions;

    @FindBy(css = "a[title='Library']")
    WebElement library;

    @FindBy(xpath = "/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/div[2]" +
            "/ytd-topbar-menu-button-renderer[2]/div/a/yt-icon-button/button/yt-icon")
    WebElement appIcon;

    @FindBy(xpath = "//*[@id=\"endpoint\"]")
    WebElement history;

    @FindBy(xpath = "//*[@id=\"endpoint\"]/paper-item/yt-formatted-string")
    WebElement popularMusic;

    @FindBy(xpath = "//*[@id=\"endpoint\"]/paper-item/yt-formatted-string")
    WebElement popularSportsVideos;


    public void navigateToYouTube() {
        driver.get("https://www.youtube.com/");
    }

    public void clickOnLogo() {
        logoIcon.click();
    }

    public void searchYouTube(String words) {
        homeSearchBox.sendKeys(words);
        searchBtn.click();
    }

    public void clickOnHamburgerMenuIcon() {
        hamburgerMenuIcon.click();
    }
    public void HoverOnHamburgerMenuIcon() {
        mouseHoverByXpath("//button[@id='button' and @aria-label='Guide']");
    }


    public void useSettings() {
        settings.click();
    }
    public void MouseoverSettings() {
        mouseHoverByXpath("//button[@class='style-scope yt-icon-button' and @aria-label='Settings']");

    }

    public void clickOnHome() {
        homeBtn.click();
    }

    public void clickOnTrending() {
        trendingBtn.click();
    }

    public void clickOnVideoIcon() {
        videoIcon.click();
    }

    public void checkSubscriptions() {
        subscriptions.click();
    }

    public void checkLibrary() {
        library.click();
    }

    public void checkApps() {
        appIcon.click();
    }

    public void checkHistory() {
        history.click();
    }

    public void checkPopularMusic() {
        history.click();
    }

    public void checkPopularSportsVideos() {
        popularSportsVideos.click();
    }

}
