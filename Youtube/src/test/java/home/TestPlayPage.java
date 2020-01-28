package home;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestPlayPage extends YoutubePlayPage {

   @Test
    public void userCanPlayVideo() {
        YoutubePlayPage play = PageFactory.initElements(driver, YoutubePlayPage.class);
        play.goToVideo(); //passed but not correct
    }

    @Test
    public void UserCanLikeVideo() {
        YoutubePlayPage like = PageFactory.initElements(driver, YoutubePlayPage.class);
        like.likeVideo(); //passed but not correct
    }

    @Test
    public void UserCanUnlikeVideo() {
        YoutubePlayPage unLike = PageFactory.initElements(driver, YoutubePlayPage.class);
        unLike.unLikeVideo(); //passed but need to manage alert
    }

    @Test
    public void UserCanShareVideo() {
        YoutubePlayPage share = PageFactory.initElements(driver, YoutubePlayPage.class);
        share.shareVideo(); //passed but need to manage alert
    }
    @Test
    public void UserCanSavePlaylist() {
        YoutubePlayPage list = PageFactory.initElements(driver, YoutubePlayPage.class);
        list.saveList();//passed but need to manage alert
    }

}
