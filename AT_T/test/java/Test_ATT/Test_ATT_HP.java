package Test_ATT;

import base.CommonAPI;
import homePage_AT_T.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_ATT_HP extends CommonAPI {

    @Test
    public void testhamburger() throws InterruptedException {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.clickhamburger();
        hp.clickaccount();
        hp.clickSignin();
        hp.addUserName();
        hp.addPsw();
        hp.showPassword();
        hp.clickSign();
        hp.forGetUser();
        hp.forGetEmailAcct();
        hp.enterValidPhoneNumber();
        hp.enterValidAcct();
        hp.enterValidZipCode();
        hp.signInNeedToClick();
        hp.clickNeedToCancel();
        hp.clickThePopUp();
        hp.clickCancelAgain();
        hp.clickCancelIt();
        hp.clickforGetThePassword();
        hp.needToEnterThePassword();
        hp.needToEnterTheLastName();
        hp.clickContinueP();
        hp.clickForGetU();
        hp.enterValidE();
        hp.clickNTContinue();
        hp.findAnotherW();
        hp.enterValidPhone();
        hp.enterVAC();
        hp.enterZipCode_Too();
        hp.clickContinueAgT();
        hp.needTo_Cancel();
        hp.n_T_Cancel();
        hp.continute_WithOut_Signing();
        hp.activate_New_Ph();
        hp.activate_New_Acct();
        hp.enterZip_Code();
        hp.not_Robot();
        //hp.further_Continues();
        hp.anotherNToCancel();






       //Thread.sleep(500);
    }
}


