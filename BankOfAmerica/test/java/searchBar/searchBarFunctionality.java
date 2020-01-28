package searchBar;

import base.CommonAPI;
import homepage.BoaHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class searchBarFunctionality extends CommonAPI{


    @Test
    //Checks if the suggestions window pops-up on clicking the text field.
    public void searchBarTextFieldClickFunctionality(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.get("https://bankofamerica.com");
         BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.helpSearchBarWebElement.click();
       isPopUpWindowDisplayed(driver, ".search-container");

    }
    @Test
    //Checks if the help search bar takes in values and displays the suggestions in a pop-up window
    public void helpSearchBarFunctionality(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        typeOnElement("#nav-search-query", "business loan");
        clickOnElement(".submit");
        isPopUpWindowDisplayed(driver, ".search-container");
    }
    @Test
    public void searchBarSuggestionRelevance(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.get("https://bankofamerica.com");
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.helpSearchBarWebElement.click();
        typeOnElement("#nav-search-query", "loans");
        WebElement firstSuggestion = driver.findElement(By.cssSelector("li.type-ahead-item:nth-child(1) > a:nth-child(1)"));
        String fsValue = firstSuggestion.getText();
        System.out.println(fsValue);

    }



}
