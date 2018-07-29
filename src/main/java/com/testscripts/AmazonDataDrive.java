//package com.testscripts;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import jxl.Sheet;
//import jxl.Workbook;
//import jxl.read.biff.BiffException;
//
//public class AmazonDataDrive {
//
//	 
//	public static void main(String[] args) throws BiffException, IOException {
//		WebDriver driver;
//
//		//Step 1: open the excel workbook
//		  String xlpath = "C:\\Users\\sbatt\\Desktop\\amazon.xls";
//		  FileInputStream fi = new FileInputStream(xlpath);
//		  Workbook wb = Workbook.getWorkbook(fi);
//		  //Step 2: open the sheet
//		  Sheet sh = wb.getSheet("products");
//		  //Get Cell
//		  //System.out.println( sh.getCell(0, 1).getContents());
//		  
//		  int colCount = sh.getColumns();
//		  int rowCount = sh.getRows();
//		  System.out.println("number of columns : " + colCount );
//		  System.out.println("number of rows : " + rowCount );	  
//		  System.setProperty("webdriver.chrome.driver","C:\\Users\\sbatt\\Desktop\\Krishna Yash\\icloud-selenium\\chromedriver_win32\\chromedriver.exe");
//		  driver = new ChromeDriver();
//		  driver.manage().window().maximize();
//		  driver.navigate().to("https://www.amazon.com/");    
//		  for(int i =0;i<=colCount ;i++)
//		  {
//		   for(int j =1;j<=rowCount;j++)
//		   {
//		    String cellValue = sh.getCell(i, j).getContents();
//		    driver.findElement(By.id("twotabsearchtextbox")).clear();
//		   driver.findElement(By.id("twotabsearchtextbox")).sendKeys(cellValue);
//		    System.out.println("product : "+ cellValue);
//		    driver.findElement(By.cssSelector("input.nav-input")).click();
//		   }
//		   
//		  }
//		  
//		  driver.close();
//
//		 }
//}
//
