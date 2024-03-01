package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
		}
@FindBy(xpath= "//input[@id='input-email']")
WebElement address;

@FindBy(xpath="//input[@id='input-password']")
WebElement password;

@FindBy(xpath="//button[normalize-space()='Login']")
WebElement logIn;

public void sendAddress(String email) {
	address.sendKeys(email);
}

public void sendPassword(String pw) {
	password.sendKeys(pw);
}

public void selectLogIn() {
	logIn.click();
}
public String teXtVerify()
{
	try {
	return(driver.getTitle());
	}
	catch(Exception e) {
		return (e.getMessage());
			
}
}

}
