package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;

public class YoutubePlayPage extends CommonAPI {

    public String url = "";

    @BeforeMethod
    public void goToVideo() {
        driver.get("https://www.youtube.com/watch?v=xzoKOw00RMI");
    }

    @FindBy(xpath = "//*[@id=\"top-level-buttons\"]/ytd-toggle-button-renderer[1]/a")
    WebElement like;

    @FindBy(xpath = "//*[@id=\"top-level-buttons\"]/ytd-toggle-button-renderer[2]")
    WebElement unlike;

    @FindBy(xpath = "//*[@id=\"top-level-buttons\"]/ytd-button-renderer[1]/a")
    WebElement share;

    @FindBy(xpath = "/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[4]/div[1]/div/div[7]/div[2]/ytd-video-primary-info-renderer/div/div/div[3]/div/" +
            "ytd-menu-renderer/div/ytd-button-renderer[2]/a/yt-icon-button/button/yt-icon")
    WebElement list;

    public void likeVideo() {
        like.click();
    }

    public void unLikeVideo() {
        unlike.click();
    }

    public void shareVideo() {
        share.click();
    }
    public void saveList() {
        list.click();
    }


}
