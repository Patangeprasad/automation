package section3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_WebShop {
	
	@FindBy(id="gender-male")
	private WebElement gendertb;
	
	@FindBy(id="FirstName")
	private WebElement firstnametb;
	
	@FindBy(id="LastName")
	private WebElement lastnametb;
	
	@FindBy(id="Email")
	private WebElement emailidtb;
	
	@FindBy(id="Password")
	private WebElement pwdtb;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmpwdtb;
	
	@FindBy(id="register-button")
	private WebElement registerbtn;
	
	public Pom_WebShop(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void genderbtn() {
		gendertb.click();
	}
	
	public void firstnamebox(String name) {
		firstnametb.sendKeys(name);
	}
	
	public void lastnamebox(String name) {
		lastnametb.sendKeys(name);
	}
	
	public void emailid(String id) {
		emailidtb.sendKeys(id);
	}
	
	public void passwardbox(String pwd) {
		pwdtb.sendKeys(pwd);
	}
	
	public void confirmpassward(String pwd) {
		confirmpwdtb.sendKeys(pwd);
	}
	
	public void registerbutton() {
		registerbtn.click();
	}

}
