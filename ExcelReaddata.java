package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReaddata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fin=new FileInputStream("./Data.docx/Customer.xlsx");
		Workbook wb=WorkbookFactory.create(fin);
		String data = wb.getSheet("Customer").getRow(1).getCell(2).getStringCellValue();
		System.out.println(data);
	}
}
