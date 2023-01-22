package SelenumRelated;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWritePOI {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Read();
		
		//String[] dataToWrite = {"S","B"};
		//Write(dataToWrite);
		
		//CreateWorkBookSheet();
		//OpenExistingWorkBook();
	}
	
	public static void Read() throws IOException
	{
		
		File fs = new File(System.getProperty("user.dir")+"\\ReadTest.xlsx");
		
		FileInputStream fis = new FileInputStream(fs);
		
		Workbook wb = null;
		wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheetAt(0);
		
		//System.out.println(sh.getRow(0).getCell(0));
		//System.out.println(sh.getRow(1).getCell(0));

		int rowCount = sh.getLastRowNum()-sh.getFirstRowNum(); //1-0
		int colCount = sh.getRow(0).getLastCellNum(); //2
		System.out.println(rowCount+""+colCount);
	
		for(int i = 0 ; i<rowCount+1;i++)
		{
			for(int j =0; j<colCount;j++)
			{
				System.out.println(sh.getRow(i).getCell(j));
			}
		}
		System.out.println("Read Completed");
	}
	
	public static void Write(String[] dataToWrite) throws IOException
	{
		File fs = new File(System.getProperty("user.dir")+"\\src\\ImpTopics\\ReadWrite.xlsx");

		FileInputStream fis = new FileInputStream(fs);
		Workbook wb = null;
		wb = new XSSFWorkbook(fis);
		
		Sheet sh = wb.getSheetAt(0);
		int rowCount = sh.getLastRowNum()-sh.getFirstRowNum(); //1-0
		int colCount = sh.getRow(0).getLastCellNum(); //2

		//create a new row
		Row row = sh.createRow(rowCount+1);
		
		for(int j = 0 ; j<dataToWrite.length; j++)
		{
			row.createCell(j).setCellValue(dataToWrite[j]);
		}

		FileOutputStream outputStream = new FileOutputStream(fs);
		wb.write(outputStream);
		outputStream.close();
		
		System.out.println("Write Completed");
	}
	
	public static void CreateWorkBookSheet() throws IOException
	{
		XSSFWorkbook wb = new XSSFWorkbook();
		FileOutputStream fs = new FileOutputStream(new File("NewSheet.xlsx"));
		wb.createSheet();
		
		wb.write(fs);
		fs.close();
		System.out.println("Sheet created successfully");
		
	}
	
	public static void OpenExistingWorkBook() throws IOException
	{
		
		File fs = new File(System.getProperty("user.dir")+"\\src\\ImpTopics\\ReadWrite.xlsx");
		FileInputStream fis = new FileInputStream(fs);
		XSSFWorkbook wb = null ;
		wb = new XSSFWorkbook(fis);
		
		
		if(fs.exists() && fs.isFile())
		{
			 System.out.println("xlsx file open successfully.");
		}
		else
		{
			 System.out.println("Error to open .xlsx file.");
		}
		
	}
	
	
	
	
}
