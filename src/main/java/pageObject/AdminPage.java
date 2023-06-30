package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	public WebDriver ldriver;

	public AdminPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

//	public static void main(String[] args) {
//		
//		WebDriver driver=new ChromeDriver();
//		
//		WebElement textEmail=driver.findElement(By.xpath("//input[@id='Email']"));
//	}

	@FindBy(xpath = "//input[@id='Email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement txtPassword;

	@FindBy(xpath = "//button[@class='button-1 login-button']")
	WebElement btnLogin;

	public void setUsername(String uname) {
		txtEmail.clear();
        txtEmail.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}

}
