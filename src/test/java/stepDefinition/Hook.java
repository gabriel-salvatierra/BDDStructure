package stepDefinition;

import cucumber.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hook {

    TestContext testContext;

    public Hook(TestContext context) {
        testContext = context;
    }

    @Before
    public void beforeHookPlaceholder() {
        System.out.println("Before hook - Placeholder");
    }

    @After
    public void afterHookPlaceholder() {
        testContext.getWebDriverManager().closeDriver();
        System.out.println("After Hook - Closes driver");
    }
}
