package pages.hu_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class SignInPage {
    private WebDriver driver;
    private By txtEmail = By.id("email");
    private By txtPassword = By.id("passwd");
    private By signInButton = By.id("SubmitLogin");
    private By alertText = By.className("alert.alert-danger");

    public SignInPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUserName(String userName){
        driver.findElement(txtEmail).sendKeys(userName);
    }

    public void setPassword(String password){
        driver.findElement(txtPassword).sendKeys(password);
    }

    public MyAccountPage clickSignInButton(){
        driver.findElement(signInButton).click();
        return new MyAccountPage(driver);
    }

    public String getAlertText(){
        return driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();

        //return driver.switchTo().activeElement().getText();

    }


}
