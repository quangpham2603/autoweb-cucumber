package testing.web.element;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testing.web.page.BasePage;

@Getter
public class HomeBasePage extends BasePage {
    public HomeBasePage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "email")
    private WebElement inputEmail;

    @FindBy(id = "pass")
    private WebElement inputPassword;

    @FindBy(xpath = "//button[@name= 'login']")
    private WebElement loginButton;
}
