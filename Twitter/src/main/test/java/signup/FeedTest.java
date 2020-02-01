package signup;

import homepage.FeedPage;
import homepage.loginpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FeedTest extends FeedPage {

    WebDriver driverC =  new FirefoxDriver();

    @Test(enabled = true)
    public void feedHomeBtnWorks(){
        FeedPage feed = PageFactory.initElements(driverC, FeedPage.class);
        feed.feedHomeBtn.click();
        Assert.assertEquals(feed.homeTitle.getText(), "Home");
    }
    @Test(enabled = true)
    public void TrendsBtnWorks(){
        FeedPage feeed = PageFactory.initElements(driver, FeedPage.class);
        feeed.TrendsBtn.click();
        Assert.assertEquals(feeed.trendsTitle.getText(), "Trends for you");
    }
    @Test(enabled = true)
    public void NotificationsBtnWorks(){
        FeedPage feeed = PageFactory.initElements(driver, FeedPage.class);
        feeed.NotificationsBtn.click();
        Assert.assertEquals(feeed.notificationsTitle.getText(), "Notifications");
    }
    @Test(enabled = true)
    public void messagesBtnWorks(){
        FeedPage feeed = PageFactory.initElements(driver, FeedPage.class);
        feeed.messagesBtn.click();
        Assert.assertEquals(feeed.msgsTitle.getText(), "Messages");
    }
    @Test(enabled = true)
    public void bookmarksBtnWorks(){
        FeedPage feeed = PageFactory.initElements(driver, FeedPage.class);
        feeed.bookmarksBtn.click();
        Assert.assertEquals(feeed.bkmrksTitle.getText(), "Bookmarks");
    }
    @Test(enabled = true)
    public void ListsBtnWorks(){
        FeedPage feeed = PageFactory.initElements(driver, FeedPage.class);
        feeed.ListsBtn.click();
        Assert.assertEquals(feeed.listsTitle.getText(), "Lists");
    }
    @Test(enabled = true)
    public void profileBtnWorks(){
        FeedPage feeed = PageFactory.initElements(driver, FeedPage.class);
        feeed.profileBtn.click();
        Assert.assertEquals(feeed.profTitle.getText(), "Edit profile");
    }
    @Test(enabled = true)
    public void moreBtnWorks(){
        FeedPage feeed = PageFactory.initElements(driver, FeedPage.class);
        Assert.assertEquals(feeed.logOutBtn.getText(), "Log out");
    }



}
