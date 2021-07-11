package pages.hu_002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.hu_001.MyAccountPage;

public class ContactUsPage {

    private WebDriver driver;
    private By customerList = By.xpath("//*[@id=\"id_contact\"]/option[2]");
    

    public ContactUsPage(WebDriver driver){
        this.driver= driver;
    }

    public void selectCustomerServiceList(){
        driver.findElement(customerList).click();

    }

}
