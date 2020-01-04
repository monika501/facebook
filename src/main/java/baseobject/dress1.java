package baseobject;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dress1 extends basepage {
	

	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement Dresses;
	
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category#size-s']")
	private WebElement small;
	
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category#size-m']")
	private WebElement medium;
	
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category#size-l']")
	private WebElement large;
	
	@FindBy(xpath="(//a[@href='http://automationpractice.com/index.php?id_product=3&controller=product'])[1]")
	private WebElement prodect;
	
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=3&token=e817bb0705dd58da8db074c69f729fd8']")
	private WebElement cart;
	 
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=order']")
	private WebElement checkout;
	
	@FindBy(xpath="(//input[@value='1'])[2]")
	private WebElement value;
	
	public dress1() {
		PageFactory.initElements(driver, this);	
		}
	public WebElement getdress() {
		return Dresses;
	
	}
	public WebElement getsmall() {
		return small;
	}
	public WebElement getmedium() {
		return medium;
	}
	public WebElement getlarge() {
		return large;
	}
	public WebElement getprodect() {
		return prodect;
	}
	public WebElement getcart() {
		return cart;
	}
	public WebElement getchekout() {
		return checkout;
	}
    public WebElement getvalue() {
    	return getvalue();
    }
	
	
	

	
	
	
	

}
