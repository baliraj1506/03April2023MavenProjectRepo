package stepdefinations;

import org.openqa.selenium.WebDriver;

import Utitlities.ReadConfig;
import pageObject.AddNewCustomerPage;
import pageObject.AdminPage;
import pageObject.Vendor;

public class Base {

	public WebDriver driver;
	
	public AdminPage ad;
	public AddNewCustomerPage addCust;
	public Vendor vendor;
	public ReadConfig readConfig;


}
