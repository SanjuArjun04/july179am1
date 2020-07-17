package task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



	
		public class HotelSearch extends Utility {
			
			HotelSearch() {
				PageFactory.initElements(driver, this);
				
			}
			@FindBy(id="location")
			private WebElement ddloc;
			@FindBy(id="hotels")
			private WebElement ddhotel;
			@FindBy(id="room_type")
			private WebElement ddroom;
			@FindBy(id="room_nos")
			private WebElement ddroomno;
			@FindBy(id="adult_room")
			private WebElement ddadultroom;
			@FindBy(id="child_room")
			private WebElement ddchildroom;
			@FindBy(id="Submit")
			private WebElement submitbtn;
			
			public WebElement getDdloc() {
				return ddloc;
			}
			public WebElement getDdhotel() {
				return ddhotel;
			}
			public WebElement getDdroom() {
				return ddroom;
			}
			public WebElement getDdroomno() {
				return ddroomno;
			}
			public WebElement getDdadultroom() {
				return ddadultroom;
			}
			public WebElement getDdchildroom() {
				return ddchildroom;
			}
			public WebElement getSubmitbtn() {
				return submitbtn;
			}
			
	
		
			
			
			
			
			


			
			
			
			

		

	}


