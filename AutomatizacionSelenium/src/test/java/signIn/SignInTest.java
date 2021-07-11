package signIn;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.hu_001.MyAccountPage;
import pages.hu_001.SignInPage;
import pages.hu_002.ContactUsPage;

import static org.testng.Assert.assertTrue;

public class SignInTest extends BaseTest {

    @Test
    public void testSuccessfullSignIn() throws InterruptedException {
        SignInPage signInPage = homePage.clickSignInPageButton();
        signInPage.setUserName("linazon94@gmail.com");
        signInPage.setPassword("112358");
        MyAccountPage myAccountPage = signInPage.clickSignInButton();
        assertTrue(myAccountPage.getWelcomeMessage().contains("Welcome to your account. Here you can manage all of your" +
                        " personal information and orders.")
                ,"Welcome message is incorrect");
        Thread.sleep(3000);
        myAccountPage.clickLogOutButton();
        Thread.sleep(3000);

    }


}
