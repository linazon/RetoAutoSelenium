package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.hu_001.SignInPage;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public SignInPage clickFormAuthentication(){
        clickLink("Sign in");
        return new SignInPage(driver);
    }

}
