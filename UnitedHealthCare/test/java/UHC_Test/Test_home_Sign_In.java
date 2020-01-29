package UHC_Test;

import homePageUHC.UhcHomeSignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_home_Sign_In extends UhcHomeSignIn {
    @Test(priority = 1)
    public void signInPage() throws InterruptedException {
        UhcHomeSignIn uhcSign = PageFactory.initElements(driver,UhcHomeSignIn.class);
        uhcSign.signIn();
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    public void uhcSign1() throws InterruptedException {
        UhcHomeSignIn uhcSign2 = PageFactory.initElements(driver,UhcHomeSignIn.class);
        uhcSign2.clickViewCheck();
        Thread.sleep(4000);
    }













//      @Test(priority = 1)
//    public void testindvfamly() throws InterruptedException {
//        UhcHomePage uhchp = PageFactory.initElements(driver, UhcHomePage.class);
//        uhchp.clickindvfamly();
//        Thread.sleep(4000);
//    }



}
