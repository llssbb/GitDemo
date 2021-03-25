package jav.auto;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {

	@Test(groups= {"smoke"})
	public void hi()
	{
		Reporter.log("hi",true);
	}
	
	@Test
	public void how()
	{
		Reporter.log("how",true);
	}
	
	@Test
	public void are()
	{
		Reporter.log("are",true);
	}
	
	@Test(groups= {"smoke"})
	public void you()
	{
		Reporter.log("you",true);
	}
	
	@Test
	public void helloGood()
	{
		Reporter.log("Hello,Good",true);
	}
	
	
	@Test
	public void forNewBranch()
	{
		Reporter.log("Hello,Good",true);
	}
	

}
