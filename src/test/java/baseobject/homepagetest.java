package baseobject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class homepagetest {
	homepage homepage1;
    basepage dp;
	
    
public homepagetest() {
	homepage1 =new homepage();
	dp=new basepage();
}
 


@Test
public void verifybutton() {
	Assert.assertTrue(dp.elementFound(homepage1.getwomen()));
	Assert.assertTrue(dp.elementFound(homepage1.getDresses()));
	Assert.assertTrue(dp.elementFound(homepage1.getTshirt()));
}
@Test
public void verifywomen() {
	homepage1.getwomen().click();
	Assert.assertTrue(dp.getTitlte().contains("Women"),"failed");
}
@Test
public void verifyDresses() {
    homepage1.getDresses().click();
	Assert.assertTrue(dp.getTitlte().contains("Dresses"),"failed");
}
@Test
public void verifyTshirt() {
	homepage1.getTshirt().click();
	Assert.assertTrue(dp.getTitlte().contains("T-shirts"),"failed");
	
}

	
}


