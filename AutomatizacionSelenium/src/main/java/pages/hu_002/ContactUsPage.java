package pages.hu_002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContactUsPage {

    private WebDriver driver;
    private List<String> subjectHeading = Arrays.asList("//*[@id=\"id_contact\"]/option[1]",
            "//*[@id=\"id_contact\"]/option[2]","//*[@id=\"id_contact\"]/option[3]");
    private By emailField = By.id("email");
    private By orderField = By.id("id_order");
    private By attachFileButton = By.className("uploader");
    private By attachFilefield = By.id("fileUpload");
    private By attachAction = By.className("action");

    private By messageField = By.id("message");
    private By submitButton = By.id("submitMessage");
    private By successfulText = By.className("alert");



    public ContactUsPage(WebDriver driver){
        this.driver= driver;
    }

    public void selectSubjectHeadingList(int index){
        driver.findElement(By.xpath(subjectHeading.get(index))).click();
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void setOrderNumber(String orderNumber){
        driver.findElement(orderField).sendKeys(orderNumber);
    }

    /**
     * Provides path of file to the form then clicks Upload button
     * @param absolutePathOfFile The complete path of the file to upload
     */
    public void attachFile(String absolutePathOfFile) throws InterruptedException {
        driver.findElement(attachFileButton).click();
        Thread.sleep(3000);
        driver.findElement(attachAction).sendKeys(absolutePathOfFile);
                //driver.findElement(attachFileField).sendKeys(absolutePathOfFile);
    }

    public void setMessage(String message){
        driver.findElement(messageField).sendKeys(message);
    }

    public void clickSubmitButton(){
        driver.findElement(submitButton).click();
    }

    public String getSuccessfulText(){
        return driver.findElement(successfulText).getText();
    }
}
