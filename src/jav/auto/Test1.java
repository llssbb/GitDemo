package jav.auto;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 
{
	@Test(groups= {"smoke"})
	public void webHomeLoan()
	{
		Reporter.log("1st method",true);
	}
	
	@Test
	public void mobileHomeLoan()
	{
		Reporter.log("2nd mthd",true);
	}
	@Test
	public void apiHomeLoan1()
	{
		Reporter.log("3rd method",true);
	}
	@Test
	public void apiHomeLoan2()
	{
		Reporter.log("3rd method",true);
	}
	@Test
	public void apiHomeLoan3()
	{
		Reporter.log("3rd method",true);
	}
	@Test
	public void apiHomeLoan4()
	{
		Reporter.log("3rd method",true);
	}
	@Test
	public void apiHomeLoan5()
	{
		Reporter.log("3rd method",true);
	}
	
	
}
