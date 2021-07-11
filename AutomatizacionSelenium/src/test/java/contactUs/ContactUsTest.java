package contactUs;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.hu_002.ContactUsPage;

public class ContactUsTest extends BaseTest {

    @Test
    public void testSendContact() throws InterruptedException{
        ContactUsPage contactUsPage = homePage.clickContactUsButton();
        contactUsPage.selectCustomerServiceList();
        Thread.sleep(3000);
    }

}
