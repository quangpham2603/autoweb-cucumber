package testing.web.steps;

import testing.web.config.ScenarioContext;

public class BaseSteps {
    protected final ScenarioContext scenarioContext;

    public BaseSteps() {
        this.scenarioContext = ScenarioContext.getInstance();
    }
}
