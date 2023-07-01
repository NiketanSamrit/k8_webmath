package com.edutech.project;

import java.io.FileInputStream;
import java.time.Duration;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class com_webmath_k8_math {

	public static void main(String[] args) {

		 try {
		    	ChromeDriver driver =new ChromeDriver();
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    driver.get("https://www.webmath.com/");
			    Thread.sleep(2000);
			    
			   FileInputStream file = new FileInputStream("C:\\excelr_workspace\\webmath.xlsx");
			    XSSFWorkbook workbook = new XSSFWorkbook(file);
			    XSSFSheet sheet = workbook.getSheet("Sheet1");
			    int rowcount = sheet.getLastRowNum();
			    int colcount = sheet.getRow(1).getLastCellNum();
			    
			    for(int i=1; i<=rowcount; i++)
			    {
			    	String value1= new DataFormatter().formatCellValue(sheet.getRow(i).getCell(1));
			    	String value2= new DataFormatter().formatCellValue(sheet.getRow(i).getCell(2));
			    	String value3= new DataFormatter().formatCellValue(sheet.getRow(i).getCell(3));
			    	String value4= new DataFormatter().formatCellValue(sheet.getRow(i).getCell(4));
			    	
			    	
			   //Add
			    	driver.findElement(By.id("navBox-3")).click();
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/font/font/a[1]")).click();
			    	driver.findElement(By.name("n1")).sendKeys(value1);
			    	Thread.sleep(1000);
			    	driver.findElement(By.name("n2")).sendKeys(value2);
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/center/form/input[5]")).click();
			    	 Thread.sleep(2000);
			    	 
               //subtract			    	 
			    	 driver.findElement(By.id("navBox-3")).click();
			    	 Thread.sleep(1000);
			    	 driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/font/font/a[2]")).click();
			    	 driver.findElement(By.name("n1")).sendKeys(value1);
			    	 Thread.sleep(1000);
				     driver.findElement(By.name("n2")).sendKeys(value2);
				     Thread.sleep(1000);
				     driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/center/form/input[5]")).click();
				     Thread.sleep(2000);
				     
               //multiply     
			    	 driver.findElement(By.id("navBox-3")).click();
			    	 Thread.sleep(1000);
			    	 driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/font/font/a[3]")).click();
			    	 driver.findElement(By.name("n1")).sendKeys(value1);
			    	 Thread.sleep(1000);
				     driver.findElement(By.name("n2")).sendKeys(value2);
				     Thread.sleep(1000);
				     driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/input[3]")).click();
				     Thread.sleep(2000);
				     
                //divide
				     driver.findElement(By.id("navBox-3")).click();
				     Thread.sleep(1000);
				     driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/font/font/a[4]")).click();
				     driver.findElement(By.name("divisor")).sendKeys(value2);
				     Thread.sleep(1000);
				     driver.findElement(By.name("dividend")).sendKeys(value1);
				     Thread.sleep(1000);
				     driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/b/form/center/input")).click();   
				     Thread.sleep(2000);
              	
               //Place Value	
				     driver.findElement(By.id("navBox-3")).click();
				     Thread.sleep(1000);
				     driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/font/font/a[5]")).click();
				     driver.findElement(By.name("number")).sendKeys(value1);
				     Thread.sleep(1000);
				     driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/center/p[2]/input[2]")).click();
				     Thread.sleep(2000);
				     
				//Rounding
				     driver.findElement(By.id("navBox-3")).click();
				     Thread.sleep(2000);
				     driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/font/font/a[6]")).click();
				     driver.findElement(By.name("number")).sendKeys(value1);
				     Thread.sleep(1000);
				     driver.findElement(By.name("roundto")).click();
				     Thread.sleep(500);
				     driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/center/p[3]/select/option[3]")).click();
				     Thread.sleep(1000);
				     driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/center/center/input")).click();   
				     Thread.sleep(2000);
				     
			    //Using a Number Line
			    	driver.findElement(By.id("navBox-3")).click();
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/font/font/a[7]")).click();
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/center/p[1]/input")).sendKeys(value4);
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/center/p[2]/input[1]")).click();
			    	Thread.sleep(2000);

			    //Comparing with a Number Line
			    	driver.findElement(By.id("navBox-3")).click();
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/font/font/a[8]")).click();
			    	driver.findElement(By.name("n1")).sendKeys(value2);
			    	Thread.sleep(1000);
			    	driver.findElement(By.name("n2")).sendKeys(value3);
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/center/p[2]/input")).click();
			    	Thread.sleep(2000);
			    	 
			    //What's a Ratio?,
			    	driver.findElement(By.id("navBox-3")).click();
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[1]/font/font/a[1]")).click();
			    	driver.findElement(By.name("a1")).sendKeys(value2);
			    	Thread.sleep(1000);
			    	driver.findElement(By.name("b1")).sendKeys(value1);
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/font/center/input")).click();
			    	Thread.sleep(2000);

			    //Proportions			    	 
			    	driver.findElement(By.id("navBox-3")).click();
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[1]/font/font/a[2]")).click();
			    	driver.findElement(By.name("a")).sendKeys(value1);
			    	Thread.sleep(1000);
			    	driver.findElement(By.name("b")).sendKeys(value2);
			    	Thread.sleep(1000);
			    	driver.findElement(By.name("c")).sendKeys(value4);
			    	Thread.sleep(1000);
			    	driver.findElement(By.name("d")).sendKeys(value3);
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/font/center/center/input")).click();
			    	Thread.sleep(2000);
				
			    //What's a Fraction?,
			        driver.findElement(By.id("navBox-3")).click();
				    driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/font/a[1]")).click();
				   	driver.findElement(By.name("n")).sendKeys(value2);
				   	Thread.sleep(1000);
			    	driver.findElement(By.name("d")).sendKeys(value1);
			    	Thread.sleep(1000);
				    driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/font/center[2]/input")).click();
				    Thread.sleep(2000); 
			    	 
			    //Comparing Fractions 
			    	driver.findElement(By.id("navBox-3")).click();
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/font/a[2]")).click();
			    	driver.findElement(By.name("n1")).sendKeys(value2);
			    	Thread.sleep(1000);
			    	driver.findElement(By.name("d1")).sendKeys(value1);
			    	Thread.sleep(1000);
			    	driver.findElement(By.name("n2")).sendKeys(value4);
			    	Thread.sleep(1000);
			    	driver.findElement(By.name("d2")).sendKeys(value3);
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/center/center/input")).click();
			    	Thread.sleep(2000);
			    	
			    //The Metric System
			    	
			    	driver.findElement(By.id("navBox-3")).click();
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/font/font/a[1]")).click();
			    	
			    	driver.findElement(By.name("lbstokg")).sendKeys(value1);
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/table[1]/tbody/tr[1]/td[1]/font/center/p/input")).click();
			    	Thread.sleep(2000);
			    	driver.findElement(By.xpath("//*[@id=\"d-mainContainer\"]/div[3]/a/img")).click();
			    	
			    	driver.findElement(By.name("kgtolbs")).sendKeys(value2);
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/table[1]/tbody/tr[1]/td[2]/font/center/p/input")).click();
			    	Thread.sleep(2000);
			    	driver.findElement(By.xpath("//*[@id=\"d-mainContainer\"]/div[3]/a/img")).click();
			    	
			    	driver.findElement(By.name("oztog")).sendKeys(value3);
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/table[1]/tbody/tr[2]/td[1]/font/center/p/input")).click();
			    	Thread.sleep(2000);
			    	driver.findElement(By.xpath("//*[@id=\"d-mainContainer\"]/div[3]/a/img")).click();
			    	
			    	driver.findElement(By.name("gtooz")).sendKeys(value4);
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/table[1]/tbody/tr[2]/td[2]/font/center/p/input")).click();
			    	Thread.sleep(2000);
			    	driver.findElement(By.xpath("//*[@id=\"d-mainContainer\"]/div[3]/a/img")).click();
			    	
			    	driver.findElement(By.name("fttom")).sendKeys(value1);
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/table[2]/tbody/tr[1]/td[1]/font/center/p/input")).click();
			    	Thread.sleep(2000);
			    	driver.findElement(By.xpath("//*[@id=\"d-mainContainer\"]/div[3]/a/img")).click();
			    	
			    	driver.findElement(By.name("mtoft")).sendKeys(value2);
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/table[2]/tbody/tr[1]/td[2]/font/center/p/input")).click();
			    	Thread.sleep(2000);
			    	driver.findElement(By.xpath("//*[@id=\"d-mainContainer\"]/div[3]/a/img")).click();
			    	
			    	driver.findElement(By.name("mtokm")).sendKeys(value3);
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/table[2]/tbody/tr[2]/td[1]/font/center/p/input")).click();
			    	Thread.sleep(2000);
			    	driver.findElement(By.xpath("//*[@id=\"d-mainContainer\"]/div[3]/a/img")).click();
			    	
			    	driver.findElement(By.name("kmtom")).sendKeys(value4);
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/table[2]/tbody/tr[2]/td[2]/font/center/p/input")).click();
			    	Thread.sleep(2000);
			    	driver.findElement(By.xpath("//*[@id=\"d-mainContainer\"]/div[3]/a/img")).click();
			    	
			    	driver.findElement(By.name("galtol")).sendKeys(value1);
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/table[3]/tbody/tr/td[1]/font/center/p/input")).click();
			    	Thread.sleep(2000);
			    	driver.findElement(By.xpath("//*[@id=\"d-mainContainer\"]/div[3]/a/img")).click();
			    	
			    	driver.findElement(By.name("ltogal")).sendKeys(value2);
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/table[3]/tbody/tr/td[2]/font/center/p/input")).click();
			    	Thread.sleep(2000);
			    	driver.findElement(By.xpath("//*[@id=\"d-mainContainer\"]/div[3]/a/img")).click();
			    	
			    	driver.findElement(By.name("mphtokmph")).sendKeys(value3);
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/table[4]/tbody/tr/td[1]/font/center/p/input")).click();
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-mainContainer\"]/div[3]/a/img")).click();
			    	
			    	driver.findElement(By.name("kmphtomph")).sendKeys(value4);
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/table[4]/tbody/tr/td[2]/font/center/p/input")).click();
			    	Thread.sleep(2000);
			    	driver.findElement(By.xpath("//*[@id=\"d-mainContainer\"]/div[3]/a/img")).click();
		    	
			    //Stuff with Time
			    	driver.findElement(By.id("navBox-3")).click();
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/font/font/a[2]")).click();
			    	driver.findElement(By.name("t")).sendKeys(value4);
			    	Thread.sleep(1000);
			    	driver.findElement(By.name("unit")).click();
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/p[1]/select/option[4]")).click();
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/p[2]/input")).click();
			    	Thread.sleep(2000);

			    //Rectangles
			    	driver.findElement(By.id("navBox-3")).click();
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/font/font/a[3]")).click();
			    	driver.findElement(By.name("width")).sendKeys(value1);
			    	Thread.sleep(1000);
			    	driver.findElement(By.name("height")).sendKeys(value2);
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/font/input[1]")).click();
			    	Thread.sleep(2000);
			    	
			    //Making Combinations,
			    	driver.findElement(By.id("navBox-3")).click();
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/font/font/a[4]")).click();
			    	driver.findElement(By.name("items")).sendKeys("2 ");
			    	Thread.sleep(1000);
			    	driver.findElement(By.name("items")).sendKeys("3 ");
			    	Thread.sleep(1000);
			    	driver.findElement(By.name("items")).sendKeys("4 ");
			    	Thread.sleep(1000);
			    	driver.findElement(By.name("items")).sendKeys("5 ");
			    	Thread.sleep(1000);
			    	System.out.println("result");
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/p/input")).click();
			    	Thread.sleep(2000);
		    	
			    //Practice Your Math
			    	driver.findElement(By.id("navBox-3")).click();
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/font/font/a[5]")).click();
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/blockquote/p[3]/input")).click();
			    	Thread.sleep(1000);
				   //	driver.findElement(By.xpath("/html/body/font/form/center/center/font/input")).click();

			    }

			    driver.quit();
			    workbook.close();
	     	} 
		    catch (Exception e) {
			   System.out.println(e.getMessage());
	     	}
	}

}
