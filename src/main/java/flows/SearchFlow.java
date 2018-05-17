package flows;

import pages.SearchPage;
import utils.WebDriverFactory;

public class SearchFlow {
    private static SearchPage getPage(){
        return new SearchPage(WebDriverFactory.getWebDriver());
    }

    private static void userTypeSearchPhrase(String phrase){
        getPage().type(getPage().getSearchField(), phrase);
    }

    private static void userClickSearchButton(){
        getPage().click(getPage().getSearchButton());
    }
}
