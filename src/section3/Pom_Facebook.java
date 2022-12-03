package section3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Facebook {
	
	@FindBy(id="email")
	private WebElement usernametb;
	
	@FindBy(name="pass")
	private WebElement passwordtb;
	
	@FindBy(name="login")
	private WebElement loginbtn;

	public Pom_Facebook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void usernametextbox(String name) {
		usernametb.sendKeys(name);
	}
	public void passwordtextbox(String pwd) {
		passwordtb.sendKeys(pwd);
	}
	public void loginbutton() {
		loginbtn.click();	
	}
	

}
