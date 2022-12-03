package section3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Skillrary {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoappbtn;
	
	@FindBy(id="course")
	private WebElement coursebtn;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seltrainingbtn;
	
	@FindBy(id="add")
	private WebElement plusebtn;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocart;
	
	
	public Pom_Skillrary(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void gears() {
		gearsbtn.click();
	}
	
	public void demoapp() {
		demoappbtn.click();
	}
	
	public void course(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		driver.switchTo().frame(0);
		a.moveToElement(ele).perform();
		coursebtn.click();
	}

	public void training() {
		seltrainingbtn.click();
	}
	
	public void pluse() {
		plusebtn.click();
	}
	
	public void cart() {
		addtocart.click();
	}
}

