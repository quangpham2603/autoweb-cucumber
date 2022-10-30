package testing.web.service;

import org.openqa.selenium.support.ui.ExpectedConditions;
import testing.web.page.BaseTest;
import testing.web.page.BaseTestService;
import testing.web.config.GlobalVariables;
import testing.web.element.AmazonHomeBasePage;

public class AmazonHomePageService extends BaseTestService {
    private AmazonHomeBasePage amazonHomePage = new AmazonHomeBasePage(BaseTest.getDriver());

    public void searchItem(String nameItem){
        amazonHomePage.getWait().until(ExpectedConditions.visibilityOf(amazonHomePage.getInputSearch()));
        amazonHomePage.getInputSearch().click();
        amazonHomePage.getInputSearch().sendKeys(nameItem);
    }

    public void clickToSearchButton(){
        amazonHomePage.getSearchButton().click();
    }

    public void getTitle(){
        scenarioContext.setContext(GlobalVariables.TITLE_FIRST_PRODUCT, amazonHomePage.getFirstProduct().getText());
    }
}
