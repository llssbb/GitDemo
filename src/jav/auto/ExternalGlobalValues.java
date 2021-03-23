package jav.auto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ExternalGlobalValues 
{
	public static void main(String[] args) throws IOException
	{
       Properties prop = new Properties();
  
       
       //to tell where the properties are present
       FileInputStream fis= new FileInputStream("C:\\LataProject\\Automation\\src\\data.properties");
       prop.load(fis);
       System.out.println(prop.getProperty("browser"));
       System.out.println(prop.getProperty("url"));
       prop.setProperty("browser", "firefox");
       System.out.println(prop.getProperty("browser"));
       
       //to store the values in property file
       
       FileOutputStream fos=new FileOutputStream("C:\\LataProject\\Automation\\src\\data.properties");
        prop.store(fos, null);
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
}
}