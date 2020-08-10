package Com_ActiTime_Generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	
	public static String getData(String file_path, String sheet_name, int rn, int cn)
	{
		try {
				
		FileInputStream f = new FileInputStream(new File(file_path));
		String data = WorkbookFactory.create(f).getSheet(sheet_name).getRow(rn).getCell(cn).toString();
		return data;
	}
catch(Exception e)
		{
	return null;
		}
	}
		
		public static int getRow(String file_path, String sheet_name)
		{
		
		try
		{
			FileInputStream f = new FileInputStream(new File(file_path));
			int rn = WorkbookFactory.create(f).getSheet(sheet_name).getLastRowNum();
			return rn;
		}
			catch(Exception e)
		{
				return 0;
		}
}
		public static int getCell(String file_path, String sheet_name, int rn)
		{
		
		try
		{
			FileInputStream f = new FileInputStream(new File(file_path));
			int cn = WorkbookFactory.create(f).getSheet(sheet_name).getRow(rn).getLastCellNum();
			return cn;
		}
			catch(Exception e)
		{
				return 0;
		}		
		}
}
