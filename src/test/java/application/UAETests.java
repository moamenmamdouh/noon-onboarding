package application;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ListingPage;
import pages.OTPPage;
import pages.PhoneRegistrationPage;
import pages.FoodAppPage;

public class UAETests extends BaseTests {

    @Test
    public void firstRegistrationTest(){
        registrationPage.addEmail("uaeautomation100@test.com");
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
        FoodAppPage foodAppPage = listingPage.createFoodApp();
    }

}
