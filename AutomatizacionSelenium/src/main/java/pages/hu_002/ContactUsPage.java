package pages.hu_002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {

    private WebDriver driver;
    private By customerList = By.xpath("//*[@id=\"id_contact\"]/option[2]");
    private By webmasterList = By.xpath("//*[@id=\"id_contact\"]/option[3]");
    private By emailField = By.id("email");
    private By orderField = By.id("id_order");
    private By attachFileButton = By.className("uploader");
    private By attachFilefield = By.id("fileUpload");


    public ContactUsPage(WebDriver driver){
        this.driver= driver;
    }

    public void selectCustomerServiceList(){
        driver.findElement(customerList).click();
    }

    public void selectWebmasterList(){
        driver.findElement(webmasterList).click();
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
    public void attachFile(String absolutePathOfFile){
        driver.findElement(attachFileButton).click();
        driver.findElement(attachFilefield).sendKeys(absolutePathOfFile);
                //driver.findElement(attachFileField).sendKeys(absolutePathOfFile);

    }





}
