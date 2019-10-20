package data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadriven{
	
//	WebDriver driver;
//	  
//	  public void setup(String password, String username) throws
//	  InterruptedException {
//	  
//	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
//	  driver= new ChromeDriver();
//	
//	Thread.sleep(10000); 
//	driver.manage().window().maximize();
//	  driver.findElement(By.xpath("//input[@name='ldomain']")).sendKeys(username);
//	  driver.findElement(By.xpath("//input[@name='lpass']")).sendKeys(password);
//	  
//	  
//	  } @DataProvider(name="wordpressData") 
//	  public Object[][] passdata() {
//	  Object[][] data=new Object[2][2];
//	  
//	  data[0][0]= "admin1"; data[0][1]= "admin1"; data[0][1]= "admin3"; data[1][1]=
//	  "admin4"; return data; }
	 
	
	@Test
	public void file1() throws IOException
	{
File src= new File("C:\\Users\\ASUS\\Desktop\\Book1.xlsx");
FileInputStream fis= new FileInputStream(src);
//FileOutputStream fout= new FileOutputStream(src);
XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet sheet= wb.getSheet("Sheet1");

sheet.getRow(0).createCell(2).setCellValue("Pass");
FileOutputStream fout= new FileOutputStream(src);
	 
	wb.write(fout); 
	wb.close();
 }

}


