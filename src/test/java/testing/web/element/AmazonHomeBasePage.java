package testing.web.element;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testing.web.page.BasePage;
@Getter
public class AmazonHomeBasePage extends BasePage {
    public AmazonHomeBasePage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "twotabsearchtextbox")
    private WebElement inputSearch;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchButton;

    @FindBy(xpath = "(//span[@class= 'a-size-medium a-color-base a-text-normal'])[1]")
    private WebElement firstProduct;

}
