package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

    @Test
    public void userCanSearchYoutube() {
        YoutubeHomePage ytdSearchBox = PageFactory.initElements(driver, YoutubeHomePage.class);
        ytdSearchBox.searchYouTube("Mind is prison"); //passed
    }

    @Test
    public void userCanClickOnLOgo() {
        YoutubeHomePage ytdLogo = PageFactory.initElements(driver, YoutubeHomePage.class);
        ytdLogo.clickOnLogo(); //passed
    }

    @Test
    public void userCanClickOnHamburgerMenuIcon() {
        YoutubeHomePage ytdHamburgerMenu = PageFactory.initElements(driver, YoutubeHomePage.class);
        ytdHamburgerMenu.clickOnHamburgerMenuIcon(); //passed
    }

    @Test
    public void userCanGoToSettings() {
        YoutubeHomePage ytdSettings = PageFactory.initElements(driver, YoutubeHomePage.class);
        ytdSettings.useSettings(); //passed
    }

    @Test
    public void userCanClickOnHome() {
        YoutubeHomePage ytdHome = PageFactory.initElements(driver, YoutubeHomePage.class);
        ytdHome.clickOnHome(); //passed
    }

    @Test
    public void userCanCheckTrendingVideos() {
        YoutubeHomePage ytdTrending = PageFactory.initElements(driver, YoutubeHomePage.class);
        ytdTrending.clickOnTrending(); //passed
    }

    @Test
    public void userCanClickOnVideoIcon() {
        YoutubeHomePage ytdVideoIcon = PageFactory.initElements(driver, YoutubeHomePage.class);
        ytdVideoIcon.clickOnTrending(); //passed
    }

    @Test
    public void userCanCheckSubscriptions() {
        YoutubeHomePage ytdSubscriptions = PageFactory.initElements(driver, YoutubeHomePage.class);
        ytdSubscriptions.checkSubscriptions(); //passed
    }

    @Test
    public void userCanLibrary() {
        YoutubeHomePage ytdLibrary = PageFactory.initElements(driver, YoutubeHomePage.class);
        ytdLibrary.checkLibrary(); //passed
    }

    @Test
    public void userCanCheckApps() {
        YoutubeHomePage ytdApp = PageFactory.initElements(driver, YoutubeHomePage.class);
        ytdApp.checkApps(); //passed
    }

    @Test
    public void userCanCheckHistory() {
        YoutubeHomePage ytdHistory = PageFactory.initElements(driver, YoutubeHomePage.class);
        ytdHistory.checkHistory(); //passed
    }

    @Test
    public void userCanCheckPopularMusic() {
        YoutubeHomePage ytdPopularMusic = PageFactory.initElements(driver, YoutubeHomePage.class);
        ytdPopularMusic.checkPopularMusic(); //passed
    }

     @Test
    public void userCanCheckPopularSportsVideos() {
        YoutubeHomePage ytdPopularSportsVideos = PageFactory.initElements(driver, YoutubeHomePage.class);
        ytdPopularSportsVideos.checkPopularSportsVideos(); //passed
    }


}
