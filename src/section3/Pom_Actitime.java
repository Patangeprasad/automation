package section3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Actitime {
	
	//Declaration
	
	@FindBy(id="loginButton")
	private WebElement loginbtn;
	
	@FindBy(name="pwd")
	private WebElement passwordtb;
	
	@FindBy(id="username")
	private WebElement usernametb;
	
	//Initialization
	public Pom_Actitime(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
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