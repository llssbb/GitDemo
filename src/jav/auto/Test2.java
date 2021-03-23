package jav.auto;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2
{
	@Test
	public void webPersonalLoan()
	{
		Reporter.log("Personal 1st method",true);
	}
	
	@Test
	public void mobilePersonalLoan()
	{
		Reporter.log("mobilePersonalLoan mthd",true);
	}
	
	@Test(groups= {"smoke"})
	public void mobilePersonalCarLoan()
	{
		Reporter.log("mobilePersonalCarLoan mthd",true);
	}
	
	@Test
	public void mobilePersonalStudyLoan()
	{
		Reporter.log("mobilePersonalStudyLoan mthd",true);
	}
	
	
	@Test(groups= {"smoke"})
	public void apiPersonalLoan()
	{
		Reporter.log("apiPersonalLoan method",true);
	}
	
}
