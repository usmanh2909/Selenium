import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	//identify testcases columns by scanning the entire 1st row
	//once column is identified scan entire column to identify purchase  testcase row
	//grab all the purchase data
	public ArrayList<String> getdata(String Testcasename) throws IOException {
		
		ArrayList<String> a = new ArrayList<String>();
		FileInputStream file = new FileInputStream("C:\\Users\\usman\\Desktop\\demodata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		int num =workbook.getNumberOfSheets();
		
		for(int i=0;i<num;i++) {
			
			if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
				
				XSSFSheet sheet=workbook.getSheetAt(i);
				Iterator<Row> row = sheet.iterator();//sheet is collectn of rows
				Row first=row.next();
				//System.out.println(first);
				Iterator<Cell> ce = first.cellIterator();//row is collection of cells
				int k=0;
				int colmn=0;
				while(ce.hasNext()) {
					Cell value = ce.next();
					//System.out.println(value);
					if(value.getStringCellValue().equalsIgnoreCase("Testcases")) 
					{
						colmn=k;
					}
					k++;
				}
				System.out.println(colmn);
				while(row.hasNext()) {
				Row r = row.next();
				if(r.getCell(colmn).getStringCellValue().equalsIgnoreCase(Testcasename)) {
					Iterator<Cell> cv = r.cellIterator();
					while(cv.hasNext()) {
						
						
						a.add(cv.next().getStringCellValue());
					}
					
				}
				}
			}
		}return a;
	}
	
	public static void main(String[] args) throws IOException {
		
		dataDriven d = new dataDriven();
		ArrayList data = d.getdata("Add Profile");
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		//finelement(By.id()).sendkeys(data.get(0));

}}
