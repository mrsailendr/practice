package excelreader.lmg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyExcelReader {

	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream(new File("howtodoinjava_demo.xlsx"));
			//Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);
 
            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
