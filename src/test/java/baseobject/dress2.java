package baseobject;

import org.seleniumhq.jetty9.server.Authentication.Failed;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dress2 {
	dress1 dress;
    basepage ms;


public dress2() {
	dress =new dress1();
	ms=new basepage();
}

@Test
  public void dressespaly() {
	  dress.getdress().click();
	  Assert.assertTrue(ms.getTitlte().contains("Dresses"));
  
}

@Test
  public void verifdisplay() {
	 Assert.assertTrue(dress.getsmall().isDisplayed(), "fail");
	 Assert.assertTrue(dress.getmedium().isDisplayed(),"fail");
	 Assert.assertTrue(dress.getlarge().isDisplayed(),"fail" );
	 
	  }
@Test
public void verifycart() {
	ms.mouse(dress.getprodect());
    dress.getcart().click();
    dress.getchekout().click();
    Assert.assertTrue(dress.getTxtAttribute(dress.getchekout()).contains("1"),"fail");
}
}