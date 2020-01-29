package UHC_Test;

import homePageUHC.UhcHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_UHC_HP extends UhcHomePage {

    @Test(priority = 1)
    public void testindvfamly() throws InterruptedException {
        UhcHomePage uhchp = PageFactory.initElements(driver, UhcHomePage.class);
        uhchp.clickindvfamly();
        Thread.sleep(4000);
    }

    @Test(enabled = false)
    public void fdDoctor() throws InterruptedException {
        UhcHomePage uhchp2 = PageFactory.initElements(driver, UhcHomePage.class);
        uhchp2.clickfindDr();   // Pass
        Thread.sleep(4000);
    }

    @Test(enabled = false)
    public void finDen() throws InterruptedException {
        UhcHomePage uhchp3 = PageFactory.initElements(driver, UhcHomePage.class);
        uhchp3.clickfindDentist();
        Thread.sleep(4000);
    }

    @Test(priority = 3)
    public void fndProvider() {
        UhcHomePage uhchp4 = PageFactory.initElements(driver, UhcHomePage.class);
        uhchp4.findPro();
    }                  // Pass

//    @Test(priority = 5)
//    public void signIn() {
//        UhcHomePage uhchp5 = PageFactory.initElements(driver, UhcHomePage.class);
//        uhchp5.clickSign();
//    }  //Failed







    @Test(priority = 2)
    public void testemply()  {
        UhcHomePage uhchp2 = PageFactory.initElements(driver,UhcHomePage.class);
        uhchp2.clickemply();
    }



    // This is working

    @Test(priority = 4)
    public void findgoodPlan() {
        UhcHomePage uhcp4 = PageFactory.initElements(driver, UhcHomePage.class);
        uhcp4.clickplan();
    }













}
