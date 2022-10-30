package testing.web.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testing.web.config.WebConfig;
import testing.web.service.HomePageService;

public class HomePageStep extends BaseSteps {
    private HomePageService homePageService = new HomePageService();

    @Given("I go to the facebook website")
    public void goToFacebook() {
        homePageService.goToPage(WebConfig.webUrl);
    }

    @When("I fill the email {string} and passWord {string}")
    public void fillEmailAndPassWord(String email, String passWord) {
        homePageService.sendEmailAndPassword(email, passWord);
    }

    @Then("I click to login button")
    public void clickLoginButton() {
        homePageService.clickToLoginButton();
    }
}
