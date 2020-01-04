package baseobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage extends basepage {
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement Dresses;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement Tshirt;
	
	public homepage() {
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getwomen() {
		return women;
		}
	public WebElement getDresses() {
		return Dresses;
		}
	public WebElement getTshirt() {
		return  Tshirt;
		}
	
}



