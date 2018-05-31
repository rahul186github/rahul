package com.crompton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CromptonExcelReading {

	public static void main(String[] args) throws IOException {
		 String CustomerSAPCode,CustomerName,CustomerAddress1,CustomerAddress2,CustomerCity,CustomerState,CustomerCountry,CustomerEmail,CustomerGSTIN,SalesmanCode,SalesmanName;
		 int CustomerPINCode,CustomerStateCode;
		 Long CustomerMobile,CustomerTelephoneNumber,CustomerFaxNumber,SalesmanMobile;
		 Date DateActiveFrom,DateActiveTo;
		
		int iteration=0;
		List<CromptonPojo> cromptonList;
		FileInputStream fin;
		
		fin = new FileInputStream(new File("D:\\Crompton\\Master_Fields_Crompton_PayEx_26_April_2018.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		Sheet sheet = workbook.getSheetAt(0);
		
		DataFormatter dataFormatter = new DataFormatter();
		cromptonList=new ArrayList<>();
		for (Row row : sheet) {

			
			if (iteration < 1) {
				iteration++;
				continue;
			}
			CromptonPojo crompton=new CromptonPojo();
			
			Cell cell0 = row.getCell(0);
            if(cell0==null || cell0.getCellType() == cell0.CELL_TYPE_BLANK)
               {
            	
               }
            else { 
            	CustomerSAPCode=dataFormatter.formatCellValue(cell0);                                     //CustomerSAPCode
            	crompton.setCustomerSAPCode(CustomerSAPCode);
                 }
            
            Cell cell1 = row.getCell(1);
            if(cell1==null || cell1.getCellType() == cell1.CELL_TYPE_BLANK)
               {
            	
               }
            else { 
            	CustomerName=dataFormatter.formatCellValue(cell1);                                     //CustomerName
            	crompton.setCustomerName(CustomerName);
                 }
            
            Cell cell2 = row.getCell(2);
            if(cell2==null || cell2.getCellType() == cell2.CELL_TYPE_BLANK)
               {
            	
               }
            else { 
            	CustomerAddress1=dataFormatter.formatCellValue(cell2);                                     //CustomerAddress1
            	crompton.setCustomerAddress1(CustomerAddress1);
                 }
            
            Cell cell3 = row.getCell(3);
            if(cell3==null || cell3.getCellType() == cell3.CELL_TYPE_BLANK)
               {
            	
               }
            else { 
            	CustomerAddress2=dataFormatter.formatCellValue(cell3);                                     //CustomerAddress2
            	crompton.setCustomerAddress2(CustomerAddress2);
                 }
            
            Cell cell4 = row.getCell(4);
            if(cell4==null || cell4.getCellType() == cell4.CELL_TYPE_BLANK)
               {
            	
               }
            else { 
            	CustomerCity=dataFormatter.formatCellValue(cell4);                                     //CustomerCity
            	crompton.setCustomerCity(CustomerCity);
                 }
            
            Cell cell5 = row.getCell(5);
            if(cell5==null || cell5.getCellType() == cell5.CELL_TYPE_BLANK)
               {
            	
               }
            else { 
            	CustomerPINCode=(int) cell5.getNumericCellValue();                                     //CustomerPINCode
            	crompton.setCustomerPINCode(CustomerPINCode);
                 }
            
            Cell cell6 = row.getCell(6);
            if(cell6==null || cell6.getCellType() == cell6.CELL_TYPE_BLANK)
               {
            	
               }
            else { 
            	CustomerState=dataFormatter.formatCellValue(cell6);                                     //CustomerState
            	crompton.setCustomerState(CustomerState);
                 }
            
            Cell cell7 = row.getCell(7);
            if(cell7==null || cell7.getCellType() == cell7.CELL_TYPE_BLANK)
               {
            	
               }
            else { 
            	CustomerCountry=dataFormatter.formatCellValue(cell7);                                     //CustomerCountry
            	crompton.setCustomerCountry(CustomerCountry);
                 }
            
            Cell cell8 = row.getCell(8);
            if(cell8==null || cell8.getCellType() == cell8.CELL_TYPE_BLANK)
               {
            	
               }
            else { 
            	CustomerSAPCode=dataFormatter.formatCellValue(cell8);                                     //CustomerSAPCode
            	crompton.setCustomerSAPCode(CustomerSAPCode);
                 }
            
            
			
		}

	}

}
