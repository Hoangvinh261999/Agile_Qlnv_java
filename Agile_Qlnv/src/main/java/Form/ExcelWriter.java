/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Form;

/**
 *
 * @author kuteb
 */
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JTable;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.*;
//import org.apache.commons.io.*;

public class ExcelWriter {

   public void writeToExcel(JTable table, String fileName) throws IOException {
 
      // create a new workbook
      Workbook workbook = new HSSFWorkbook();

      // create a new sheet
      Sheet sheet = workbook.createSheet("Table Data");

      // get the column count and row count of the table
      int rowCount = table.getRowCount();
      int colCount = table.getColumnCount();

      // create header row
      Row headerRow = sheet.createRow(0);
      for (int c = 0; c < colCount; c++) {
         Cell cell = headerRow.createCell(c);
         cell.setCellValue(table.getColumnName(c));
      }

      // create data rows
      for (int r = 0; r < rowCount; r++) {
         Row dataRow = sheet.createRow(r + 1);
         for (int c = 0; c < colCount; c++) {
            Cell cell = dataRow.createCell(c);
            cell.setCellValue(String.valueOf(table.getValueAt(r, c)));
         }
      }

      // write workbook to file
      FileOutputStream fileOut = new FileOutputStream(fileName);
      workbook.write(fileOut);
      fileOut.close();
      
      System.out.println("Excel file đã được tạo thành công!");
   }
}
