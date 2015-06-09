import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;


public class ReadfrmExcel {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception{
		excelRead();
	}
	public static String[][] excelRead() throws Exception{
		String path=System.getProperty("user.dir");
		File fl=new File(path+"\\Test.xls");
		FileInputStream flis=new FileInputStream(fl);
	
			
		HSSFWorkbook wb=new HSSFWorkbook(flis);
		HSSFSheet sheet=wb.getSheet("Sheet1");
		
		int rowNum=sheet.getLastRowNum() + 1;
		int colNum=sheet.getRow(0).getLastCellNum();
		
		String data[][]=new String[rowNum][colNum];
		
		for(int i=0; i<rowNum; i++)
		{
			HSSFRow row=sheet.getRow(i);
			
			for (int j=0; j<colNum; j++)
			{
				HSSFCell cell=row.getCell(j);
				Object value=null;
				String data1 = null;
							
				if(cell!=null && cell.getCellType()==0)
				{
					value=cell.getNumericCellValue();
					data1=value.toString();
				}
				else if(cell!=null && cell.getCellType()==1)
				{
					value=cell.getStringCellValue();
					data1=value.toString();
				}
				
				data[i][j]=data1;
				//System.out.println("["+i+"]["+j+"]"+data[i][j]);
				//String value=cellTostring(cell);
				
			}
			
			
		}
		
		
		
		return data;	
		
	}

	private static String cellTostring(HSSFCell cell) {
		// TODO Auto-generated method stub
		int type;
		Object result = null;
		type=cell.getCellType();
		
		switch(type)
		{
		
		case 0:
			result=cell.getNumericCellValue();
			break;
		case 1:
			result=cell.getStringCellValue();
			break;
		default:
			System.out.println("Not a valid type");
		}
		
		return result.toString();
	}

}
