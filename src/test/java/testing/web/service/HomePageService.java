package testing.web.service;

import testing.web.page.BaseTest;
import testing.web.page.BaseTestService;
import testing.web.element.HomeBasePage;

public class HomePageService extends BaseTestService {
    private HomeBasePage homePage = new HomeBasePage(BaseTest.getDriver());

    public void clickToLoginButton(){
        homePage.getLoginButton().click();
    }

    public void sendEmailAndPassword(String email, String password){
        homePage.getInputEmail().sendKeys(email);
        homePage.getInputPassword().sendKeys(password);
    }
}
