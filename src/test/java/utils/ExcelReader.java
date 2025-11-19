package utils;



import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    public static String getCellData(String filePath, String sheetName, int rowNum, int colNum) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(sheetName);
            Row row = sheet.getRow(rowNum);
            Cell cell = row.getCell(colNum);

            String data = cell.getStringCellValue();
            workbook.close();
            fis.close();
            return data;

        } catch (Exception e) {
            throw new RuntimeException("Error while reading Excel: " + e.getMessage());
        }
    }
}

