package signIn;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pages.hu_001.MyAccountPage;
import pages.hu_001.SignInPage;
import pages.hu_002.ContactUsPage;

import static org.testng.Assert.assertTrue;

public class SignInTest extends BaseTest {

    @Test
    public void testSuccessfullSignIn() {
        SignInPage signInPage = homePage.clickSignInPageButton();
        signInPage.setUserName("linazon94@gmail.com");
        signInPage.setPassword("112358");
        MyAccountPage myAccountPage = signInPage.clickSignInButton();
        Assertions.assertTrue(myAccountPage.getWelcomeMessage().contains("Welcome to your account. Here you can manage all of your" +
                        " personal information and orders.")
                ,"Welcome message is incorrect");
        myAccountPage.clickLogOutButton();
    }

    @ParameterizedTest
    @CsvFileSource(files = {"src/test/resources/params/signInTest.csv"},
            numLinesToSkip = 1)
    public void testAlertTextError(String email, String password, String alert1, String alert2){
        SignInPage signInPage = homePage.clickSignInPageButton();
        signInPage.setUserName(email);
        signInPage.setPassword(password);
        signInPage.clickSignInButton();
        //Assertions.assertEquals("There is 1 error",signInPage.getAlertText());
        Assertions.assertTrue(signInPage.getAlertText().contains(alert1)
                &&signInPage.getAlertText().contains(alert2),"Alert incorrect");
    }


}
