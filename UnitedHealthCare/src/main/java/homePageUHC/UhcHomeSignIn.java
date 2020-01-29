package homePageUHC;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UhcHomeSignIn extends CommonAPI {
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/header/div/div/div[1]/div[1]/div[2]/div[1]/div/nav/ul/li[3]/a")
    WebElement indvfamly;  //                       1




    @FindBy(how = How.XPATH,using = "//div[@class='signin signin-menu ml-4']//button[@class='signin-menu__button m-0 py-0 pl-4 pr-8 position-relative border-hairline borderColor-greyDigital borderRadius-default width-auto color-inherit bg-white cursor-pointer lineHeight-h1'][contains(text(),'Sign In')]")
    WebElement viewCheck; //                        2







    public void signIn(){
        indvfamly.click();
    }      //                                       1





    public void clickViewCheck(){
        viewCheck.click();
    }








    
}
