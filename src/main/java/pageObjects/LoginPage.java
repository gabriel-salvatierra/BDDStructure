package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    private WebElement usernameFld;

    @FindBy(id = "password")
    private WebElement passwordFld;

    @FindBy(id = "loginbtn")
    private WebElement loginBtn;

    public void enterName(String name) {
        usernameFld.sendKeys(name);
    }

    public void enterPassword(String password) {
        passwordFld.sendKeys(password);
    }

    public void loginAction(String name, String password) {
        enterName(name);
        enterPassword(password);
        loginBtn.click();
    }

}
