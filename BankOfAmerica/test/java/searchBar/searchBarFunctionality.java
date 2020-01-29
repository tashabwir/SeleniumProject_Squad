package searchBar;

import base.CommonAPI;
import homepage.BoaHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class searchBarFunctionality extends CommonAPI{
       // driver.get("https://bankofamerica.com");


    @Test ( enabled=false )
    //Checks if the suggestions window pops-up on clicking the text field.
    public void searchBarTextFieldClickFunctionality(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.helpSearchBarWebElement.click();
       isPopUpWindowDisplayed(driver, ".search-container");

    }
    @Parameters({"searchBarValue"})
    @Test ( enabled=false )
    //Checks if the help search bar takes in values and displays the suggestions in a pop-up window
    public void helpSearchBarFunctionality(String searchBarValue){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        typeOnElement("#nav-search-query", searchBarValue);
        clickOnElement(".submit");
        isPopUpWindowDisplayed(driver, ".search-container");
    }
   @Parameters({"searchBarValue2", "searchBarValue3", "searchBarValue4", "searchBarValue"})
    @Test ( enabled=false )
   //Checks if the search bar popup suggestion box dynamically picks up searched values one after the other.
    public void helpSearchBarRepetitiveSearches(String searchBarValue2, String searchBarValue3, String searchBarValue, String searchBarValue4) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.helpSearchBarWebElement.click();
        typeOnElement("#nav-search-query", searchBarValue2);
        sleepFor(2);
        clearInput("#nav-search-query");
        bhp.helpSearchBarWebElement.click();
        typeOnElement("#nav-search-query", searchBarValue3);
        sleepFor(2);
        clearInput("#nav-search-query");
        bhp.helpSearchBarWebElement.click();
        typeOnElement("#nav-search-query", searchBarValue4);
        sleepFor(2);
       clearInput("#nav-search-query");
       bhp.helpSearchBarWebElement.click();
       typeOnElement("#nav-search-query", searchBarValue);
       isPopUpWindowDisplayed(driver, ".search-container");
    }
    @Parameters({"searchBarValue3"})
    @Test ( enabled=false )
    public void searchBarResultRelevance(String searchBarValue3){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        typeOnInputBox("#nav-search-query", searchBarValue3);
        clickByXpath("//a[@name='Search Module - Search Results - Result 1']");
        
    }

    }




