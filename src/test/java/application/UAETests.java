package application;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.BasicTabPage;
import pages.ListingPage;
import pages.OTPPage;
import pages.PhoneRegistrationPage;

public class UAETests extends BaseTests {

    @Test
    public void firstRegistrationTest(){
        registrationPage.addEmail("food@automation1.com");
        registrationPage.addPassword("12345678");
        PhoneRegistrationPage phoneRegistration = registrationPage.clickNext();
        phoneRegistration.waitPhoneRegistration();
        phoneRegistration.addPhone("504938449");
        OTPPage otpPage = phoneRegistration.clickNext();
        otpPage.waitOTP();
        otpPage.addOTP();
        ListingPage listingPage = otpPage.clickNext();
        listingPage.waitListing();
        listingPage.clickFillApp();
        listingPage.scrollToFoodApp();
        BasicTabPage basicTab = listingPage.createFoodApp();
    }

}
