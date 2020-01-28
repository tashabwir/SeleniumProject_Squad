package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSignInPage extends CommonAPI {

   @Test
    public void userCanSigInYouTubeAccount() {
        YouTubeSignInPage ytdSignIn = PageFactory.initElements(driver, YouTubeSignInPage.class);
        ytdSignIn.signIn("myautotestmail2020@gmail.com", "tester1234"); //passed-failed!!???
    }

}
