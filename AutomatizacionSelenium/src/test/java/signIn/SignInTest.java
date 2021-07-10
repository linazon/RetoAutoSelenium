package signIn;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.hu_001.MyAccountPage;
import pages.hu_001.SignInPage;

import static org.testng.Assert.assertTrue;

public class SignInTest extends BaseTest {

    @Test
    public void testSuccessfullSignIn() throws InterruptedException {
        SignInPage signInPage = homePage.clickFormAuthentication();
        signInPage.setUserName("linazon94@gmail.com");
        signInPage.setPassword("112358");
        MyAccountPage myAccountPage = signInPage.clickSignInButton();
       // assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!")
        //        ,"Alert text is incorrect");
        Thread.sleep(5000);
    }

}
