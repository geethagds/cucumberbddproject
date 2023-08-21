package pagespackage;

import org.openqa.selenium.By;
import basepackage.Basec;

public class Createpagexpaths extends Basec {
	public static By cp=By.xpath("//div[@id='ember211']//div//header//section[@id=\"ember214\"]//button");
	public static By pname=By.xpath("//input[@placeholder=\"New project name\"]");
	public static By createbutton=By.xpath("//div[@id=\"ember199\"]//button]");
	
	
	
	public static void createproject()
	{
		driver.findElement(cp).click();

	}
	public static void  pname(String name)
	{
		driver.findElement(pname).sendKeys(name);

	}
	public static void createbutton()
	{
		driver.findElement(createbutton).click();

	}

	
	

}

