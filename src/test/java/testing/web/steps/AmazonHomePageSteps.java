package testing.web.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import testing.web.config.WebConfig;
import testing.web.config.GlobalVariables;
import testing.web.service.AmazonHomePageService;

public class AmazonHomePageSteps extends BaseSteps{

    private AmazonHomePageService amazonHomePageService = new AmazonHomePageService();

    @Given("I go to the Amazon website")
    public void goToAmazon(){
        amazonHomePageService.goToPage(WebConfig.amazonUrl);
    }

    @When("I search product {string} in search bar")
    public void searchProduct(String nameProduct){
        amazonHomePageService.searchItem(nameProduct);
        amazonHomePageService.clickToSearchButton();
    }

    @Then("I verify the title of first product is name {string}")
    public void verifyTitleFirstProduct(String nameFirstProduct) {
        amazonHomePageService.getTitle();
        Assert.assertEquals(scenarioContext.getContext(GlobalVariables.TITLE_FIRST_PRODUCT), nameFirstProduct);
    }
}
