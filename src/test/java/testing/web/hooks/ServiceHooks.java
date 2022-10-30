package testing.web.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import testing.web.page.BaseTest;

public class ServiceHooks {
    @Before
    public void initTest(){
        BaseTest.createDriver();
    }

    @After
    public void afterHooks(){
        BaseTest.tearDown();
    }
}
