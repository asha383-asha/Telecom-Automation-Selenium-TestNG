package testscenarios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingdata {
    public static void main(String[] args) throws IOException {

        FileInputStream f = new FileInputStream("C:\\Users\\ASHA\\OneDrive\\Desktop\\write.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(f);

        XSSFSheet ws = wb.getSheet("Sheet1"); // check sheet name

        Row r;
        Cell c;

        r = ws.createRow(0);
        r.createCell(0).setCellValue("mercury");

        r = ws.createRow(2);
        r.createCell(2).setCellValue("automation");

        r = ws.createRow(4);
        r.createCell(4).setCellValue("asha");

        FileOutputStream f1 = new FileOutputStream("C:\\Users\\ASHA\\OneDrive\\Desktop\\write.xlsx");

        wb.write(f1);   // ⭐ IMPORTANT: saves data into Excel

        f.close();
        f1.close();
        wb.close();
    
}

		
		
	}


