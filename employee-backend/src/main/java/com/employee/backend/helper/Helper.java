package com.employee.backend.helper;

import com.employee.backend.model.Employee;
import com.employee.backend.model.Product;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Helper {


    //check that file is of excel type or not
    public static boolean checkExcelFormat(MultipartFile file) {

        String contentType = file.getContentType();

        if (contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
            return true;
        } else {
            return false;
        }

    }


    //convert excel to list of products

    public static List<Employee> convertExcelToListOfProduct(InputStream is) {
        List<Employee> list = new ArrayList<>();

        try {


            XSSFWorkbook workbook = new XSSFWorkbook(is);

            XSSFSheet sheet = workbook.getSheet("Sheet1");

            int rowNumber = 0;
            Iterator<Row> iterator = sheet.iterator();

            while (iterator.hasNext()) {
                Row row = iterator.next();

                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }

                Iterator<Cell> cells = row.iterator();

                int cid = 0;

                Employee p = new Employee();

                while (cells.hasNext()) {
                    Cell cell = cells.next();

                    switch (cid) {
                        case 0:
                           p.setEmpId(cell.getStringCellValue());
                            break;
                        case 1:
                            p.setName(cell.getStringCellValue());
                            break;
                        case 2:
                            p.setPhone(cell.getStringCellValue());
                            break;
                        case 3:
                            p.setEmail(cell.getStringCellValue());
                            break;
                        case 4:
                            p.setHomeManager(cell.getStringCellValue());
                            break;
                        case 5:
                            p.setLocation(cell.getStringCellValue());
                            break;
                        case 6:
                            p.setAddress(cell.getStringCellValue());
                            break;
                        case 7:
                            p.setAgileTeam(cell.getStringCellValue());
                            break;
                        case 8:
                            p.setAssetId(cell.getStringCellValue());
                            break;
                        case 9:
                            p.setCertification(cell.getStringCellValue());
                            break;
                        case 10:
                            p.setCognizantExp(cell.getStringCellValue());
                            break;
                        case 11:
                            p.setHeadPhone(cell.getStringCellValue());
                            break;
                        case 12:
                            p.setInternet(cell.getStringCellValue());
                            break;
                        case 13:
                            p.setLastWorkigDay(cell.getStringCellValue());
                            break;
                        case 14:
                            p.setLibertyExp(cell.getStringCellValue());
                            break;
                        case 15:
                            p.setLibertyApplication(cell.getStringCellValue());
                            break;
                        case 16:
                            p.setPortfolio(cell.getStringCellValue());
                            break;
                        case 17:
                            p.setProjectId(cell.getStringCellValue());
                            break;
                        case 18:
                            p.setProjectName(cell.getStringCellValue());
                            break;
                        case 19:
                            p.setSeatId(cell.getStringCellValue());
                            break;
                        case 20:
                            p.setSeniorDir(cell.getStringCellValue());
                            break;
                        case 21:
                            p.setSkills(cell.getStringCellValue());
                            break;
                        case 22:
                            p.setStatus(cell.getStringCellValue());
                            break;
                        case 23:
                            p.setWorkExp(cell.getStringCellValue());
                            break;
                        case 24:
                            p.setJan(cell.getStringCellValue());
                            break;
                        case 25:
                            p.setFeb(cell.getStringCellValue());
                            break;
                        case 26:
                            p.setMarch(cell.getStringCellValue());
                            break;
                        case 27:
                            p.setApril(cell.getStringCellValue());
                            break;
                        case 28:
                            p.setMay(cell.getStringCellValue());
                            break;
                        case 29:
                            p.setJune(cell.getStringCellValue());
                            break;
                        case 30:
                            p.setJuly(cell.getStringCellValue());
                            break;
                        case 31:
                            p.setAug(cell.getStringCellValue());
                            break;
                        case 32:
                            p.setSept(cell.getStringCellValue());
                            break;
                        case 33:
                            p.setOct(cell.getStringCellValue());
                            break;
                        case 34:
                            p.setNov(cell.getStringCellValue());
                            break;
                        case 35:
                            p.setDecember(cell.getStringCellValue());
                            break;
                        default:
                            break;
                    }
                    cid++;

                }

                list.add(p);


            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }


}
