package SelenumRelated;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


public class ReadWriteJXL {

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		// TODO Auto-generated method stub
		//read();
		write();
	}
	
	public static void read() throws BiffException, IOException
	{
		Workbook wb = null ;
		File file = new File(System.getProperty("user.dir")+"\\src\\ImpTopics\\ReadWritexls.xls");
		wb = Workbook.getWorkbook(file);
		
		Sheet sh = wb.getSheet(0);
		//getcell(col,row)
		Cell c = sh.getCell(1,1);
		//get the content of the cell
		System.out.println(c.getContents());
		
		System.out.println(sh.getRows());
		System.out.println(sh.getColumns());
		System.out.println(sh.getRow(0));
		System.out.println(sh.getColumn(0));

		System.out.println(sh.getName());
		System.out.println(sh.isHidden());
		System.out.println(sh.isProtected());
		System.out.println(sh.findCell("G"));
		System.out.println(sh.getSettings());
		System.out.println(sh.getColumnWidth(0));
		
		if (wb != null) {
            wb.close();
        }
	}
	
	public static void write() throws IOException, RowsExceededException, WriteException
	{
		WritableWorkbook wb = null;
		wb = Workbook.createWorkbook(new File(System.getProperty("user.dir")+"\\src\\ImpTopics\\NewExcelJXL.xls"));
		
		WritableSheet excelSheet = wb.createSheet("Sheet 2", 1);
		//writing data
		//col,row,contents
		Label label = new Label(0, 0, "Test Count");
        excelSheet.addCell(label);
        
        //setting format
        WritableCellFormat cFormat = new WritableCellFormat();
        WritableFont font = new WritableFont(WritableFont.ARIAL, 16, WritableFont.BOLD);
        cFormat.setFont(font);
        
        Label label1 = new Label(0, 1, "Test Count", cFormat);
        excelSheet.addCell(label1);
        
        //Number number = new Number(0, 1, 1);
        //excelSheet.addCell(number);
        

        wb.write();
        System.out.println("Write completed successfully");
        if (wb != null) {
            wb.close();
        }
	}
	
	
	
	

}
