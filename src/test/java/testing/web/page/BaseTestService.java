package testing.web.page;

import org.openqa.selenium.WebElement;
import testing.web.config.ScenarioContext;

public class BaseTestService {
    private BasePage basePage = new BasePage(BaseTest.getDriver());

    protected final ScenarioContext scenarioContext;

    public BaseTestService() {
        this.scenarioContext = ScenarioContext.getInstance();
    }

    public void goToPage(String url){
        basePage.getDriver().get(url);
    }
    public void refreshPage(){
        basePage.getDriver().navigate().refresh();
    }
    public void scrollIntoView(WebElement element){
        basePage.getJavascript().executeScript("arguments[0].scrollIntoView();", element);
    }

    public void jsClick(WebElement element){
        basePage.getJavascript().executeScript("arguments[0].click();", element);
    }
}
