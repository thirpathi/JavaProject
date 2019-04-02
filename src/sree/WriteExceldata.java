package sree;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;

	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class WriteExceldata {

		public static void main(String[] args) throws Exception {
			
			//File F= new File("C:\\Users\\sree\\Desktop\\job\\Book1.xlsx");
			File F= new File("C:\\Users\\hp\\Desktop\\New folder (3)\\Book1.xlsx");

			FileInputStream  input = new FileInputStream(F);
			XSSFWorkbook  wb = new XSSFWorkbook(input);
			XSSFSheet st = wb.getSheet("sheet2");
		
			String  rowvalue = st.getRow(1).getCell(0).getStringCellValue();
			System.out.println("display the row values.............................."+rowvalue);
			
			double column = st.getRow(1).getCell(1).getNumericCellValue();		
			System.out.println("dispaly column value............................."+column);
			
		//create cell on eligible column
			st.getRow(1).createCell(2).setCellValue("eligible for vote");
		
			st.getRow(2).createCell(2).setCellValue("not eligible for vote");
			
		FileOutputStream output = new FileOutputStream (F);
			wb.write(output);
	//collect total rows and columns in excel sheet:		
			int trows  = st.getLastRowNum();
			System.out.println("total rows in a sheet ....................................."+trows);	
	//display total a column values:
					for (int r=1; r<=trows; r++) {
					String  trowdata =	st.getRow(r).getCell(0).getStringCellValue();
						System.out.println("total row data is................................"+ trowdata);
					}
		//display total b column values:		
				int brow = st.getLastRowNum();					
				System.out.println("total   brows in a sheet ....................................."+brow);
											for(int  a=1 ; a<=brow; a++ )
									{
						double  bdata= st.getRow(a).getCell(1).getNumericCellValue();
						System.out.println("bdata taotal balue is ........................."+bdata);
					}

		}

	}
