package feedbackCommentCard;

import base.CommonAPI;
import homepage.BoaHomePage;
import homepage.CommentCard;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class CommentCardSubmission extends CommonAPI{
    @Parameters({"searchBarValue3"})
    @Test
    //checks weather FeedBack window appears in a new tab on clicking the feedback web element.
    public void contactUsFromCommentCard(String searchBarValue3)throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.helpSearchBarWebElement.click();
        typeOnInputBox("#nav-search-query", searchBarValue3);
        waitUntilVisible(By.className("results-heading"));
        bhp.feedbackWebElement.click();
        handleNewTab(driver);
        CommentCard cc = PageFactory.initElements(driver, CommentCard.class);
        cc.contentRadio4WebElement.click();
        cc.layoutRadio5WebElement.click();
        cc.easeOfUseRadio4WebElement.click();
        cc.overallUseRadio5WebElement.click();
        typeOnElement(".large", "Good site, easy to fetch informations.");
        cc.submitWebElement.click();
    }
}
