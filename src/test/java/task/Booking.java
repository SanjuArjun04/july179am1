package task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking extends Utility {
	
	Booking() {
		PageFactory.initElements(driver, this);
		
}
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement finame;
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement liname;
	@FindBy(id="address")
	private WebElement addr;
	@FindBy(id="cc_num")
	private WebElement ccnum;
	@FindBy(xpath="//select[@class='select_combobox']")
	private WebElement cctype;
	@FindBy(id="cc_exp_month")
	private WebElement ccexpmon;
	@FindBy(id="cc_exp_year")
	private WebElement ccexpyear;
	@FindBy(id="cc_cvv")
	private WebElement ccCvv;
	@FindBy(id="book_now")
	private WebElement booknowbtn;
	public WebElement getFiname() {
		return finame;
	}
	public WebElement Liname() {
		return liname;
	}
	public WebElement Addr() {
		return addr;
	}
	public WebElement Ccnum() {
		return ccnum;
	}
	public WebElement Cctype() {
		return cctype;
	}
		
	public WebElement Ccexpmon() {
		return ccexpmon;
	}
	public WebElement Ccexpyear() {
		return ccexpyear;
	}
	public WebElement CcCvv() {
		return ccCvv;
	}
	public WebElement Booknowbtn() {
		return booknowbtn;
	}
		
		
		
		
		
	
	
}

