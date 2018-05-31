/*
 *java version "1.8.0_131"
 *05 April 2018
 *File Name ZWS_READ_CUSTOMERS_v1.xlsx
 */

package com.retailer;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

public class Retailers {

	public static void main(String[] args)
			throws EncryptedDocumentException, InvalidFormatException, IOException, ParseException {

		List<Retailer> Retailers = null;
		Date date;
		java.sql.Date sqlDate;
		int iteration = 0;
		double totalValue,taxableValue;

		FileInputStream fin = new FileInputStream(new File("d:\\ZWS_READ_CUSTOMERS_v1.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		Sheet sheet = workbook.getSheetAt(0);

		DataFormatter dataFormatter = new DataFormatter();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		Retailers = new ArrayList<>();

		for (Row row : sheet) {

			if (iteration == 0) {
				iteration++;
				continue;
			}

			Retailer retail = new Retailer();

			Cell cell2 = row.getCell(2);
			String RetailerCode = dataFormatter.formatCellValue(cell2); // RetailerCode
			retail.setRetailerCode(RetailerCode);

			Cell cell3 = row.getCell(3);
			String invoiceNo = dataFormatter.formatCellValue(cell3);    // invoiceNo
			retail.setInvoiceNo(invoiceNo);

			Cell cell6 = row.getCell(6);
			String invoiceData = dataFormatter.formatCellValue(cell6);  // invoiceData
			date = dateFormat.parse(invoiceData);
			sqlDate = new java.sql.Date(date.getTime());
			retail.setInvoiceData(sqlDate);

			Cell cell9 = row.getCell(9);
			String dueDate = dataFormatter.formatCellValue(cell9);     // dueDate
			date = dateFormat.parse(dueDate);  
			sqlDate = new java.sql.Date(date.getTime());
			retail.setDueDate(sqlDate);
			

			Cell cell19 = row.getCell(19);
			totalValue=cell19.getNumericCellValue();
			retail.setTotalValue((float)totalValue);                   // totalValue

			Cell cell21 = row.getCell(21);
			taxableValue=cell21.getNumericCellValue();
			retail.setTaxableValue((float)taxableValue);               // taxableValue

			Retailers.add(retail);              

		}
		System.out.println(Retailers);
		workbook.close();
	}

}
