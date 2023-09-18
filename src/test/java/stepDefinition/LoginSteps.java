package stepDefinition;

import data.PropertiesDataHandler;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverInitializer;

import java.io.IOException;

public class LoginSteps extends DriverInitializer {
    @Given("user at home screen app")
    public void userAtHomeScreenApp() {
        femaleDaily.onBoardingScreen().tapNextButton();
        femaleDaily.onBoardingScreen().tapNextButton();
        femaleDaily.onBoardingScreen().tapButtonGetStarted();
        femaleDaily.homeScreen().tapCloseButtonBanner();
    }

    @Given("user at login form screen")
    public void userAtLoginFormScreen() {
        femaleDaily.homeScreen().tapLoginButton();
        femaleDaily.welcomeScreen().tapOKButtonMPC();
        femaleDaily.welcomeScreen().tapLoginButton();
    }

    @When("user input valid username and password")
    public void userInputValidUsernameAndPassword() throws IOException {
        String username = new PropertiesDataHandler().getPropsValue("USERNAME");
        String password = new PropertiesDataHandler().getPropsValue("PASSWORD");

        femaleDaily.loginFormScreen().inputUsername(username);
        femaleDaily.keyboardScreen().tapButtonDone();
        femaleDaily.loginFormScreen().tapButtonNext();
        femaleDaily.loginFormScreen().inputPassword(password);
        femaleDaily.keyboardScreen().tapButtonDone();
        femaleDaily.loginFormScreen().tapButtonLogin();
    }

    @Then("user can login into member area")
    public void userCanLoginIntoMemberArea() {
        femaleDaily.homeScreen().tapCloseButtonCompleteProfile();
        femaleDaily.homeScreen().tapRemindLatterRateApp();
        femaleDaily.homeScreen().tapCloseButtonBanner();
        femaleDaily.homeScreen().validateProfilePictureElement();
    }
}
