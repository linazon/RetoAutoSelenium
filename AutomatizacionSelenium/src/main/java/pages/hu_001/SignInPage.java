package pages.hu_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By passwordField = By.id("passwd");
    private By signInButton = By.id("SubmitLogin");

    public SignInPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUserName(String userName){
        driver.findElement(emailField).sendKeys(userName);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public MyAccountPage clickSignInButton(){
        driver.findElement(signInButton).click();
        return new MyAccountPage(driver);
    }


}
