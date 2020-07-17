package task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
	
	LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="username")
	private WebElement user;
	@FindBy(id="password")
	private WebElement passwrd;
	@FindBy(className="login_button")
	private WebElement loginbtn;
	public WebElement getUser() {
		return user;
	}
	public WebElement getPasswrd() {
		return passwrd;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	

}
