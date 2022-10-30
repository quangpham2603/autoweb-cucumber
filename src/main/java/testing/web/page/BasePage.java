package testing.web.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor javascript ;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30 );
        PageFactory.initElements(driver, this);
        javascript = (JavascriptExecutor) getDriver();
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public JavascriptExecutor getJavascript() {
        return javascript;
    }
}
