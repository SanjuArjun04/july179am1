package task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm extends Utility {
	
	Confirm() {
		PageFactory.initElements(driver, this);
		
}
	public WebElement getTabrow() {
		// TODO Auto-generated method stub
		return tabrow;
	}
@FindBy(xpath="(//table[@width='100%'])[4]")
private WebElement tabrow;



	
	
}

