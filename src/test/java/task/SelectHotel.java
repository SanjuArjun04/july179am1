package task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends Utility {
	
	SelectHotel() {
		PageFactory.initElements(driver, this);
		
}
	@FindBy(id="radiobutton_0")
	private WebElement radbtn;
	@FindBy(id="continue")
	private WebElement conbtn;
	public WebElement getRadbtn() {
		return radbtn;
	}
	public WebElement getConbtn() {
		return conbtn;
	
	
}
}