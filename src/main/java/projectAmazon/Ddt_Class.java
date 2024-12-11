package projectAmazon;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Ddt_Class
{
	public static String username,password, mobile_no,Invalid_username,Invalid_password,profileinfo_username,profileinfo_password;
	public void ddtmethod() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\Test\\eclipse-workspace\\Project1\\DataSheet\\RegistrationSheet1.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		
		 username= w1.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		 password= w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		mobile_no=  NumberToTextConverter.toText(w1.getSheet("registration_no").getRow(1).getCell(0).getNumericCellValue());
		 Invalid_username= w1.getSheet("invalid login").getRow(1).getCell(0).getStringCellValue();
		Invalid_password= w1.getSheet("invalid login").getRow(1).getCell(1).getStringCellValue();
		profileinfo_username=  NumberToTextConverter.toText(w1.getSheet("profile information").getRow(1).getCell(0).getNumericCellValue());
		profileinfo_password= w1.getSheet("profile information").getRow(1).getCell(1).getStringCellValue();

	}

}
