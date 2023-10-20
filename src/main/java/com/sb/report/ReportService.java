//package com.sb.report;
//
//
//import net.sf.jasperreports.engine.*;
//import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.util.ResourceUtils;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Service
//public class ReportService {
//
//    @Autowired
//    private EmployeeRepo repository;
//
////    public String exportReport(String reportFormat) throws FileNotFoundException, JRException {
////
////        String path = "C:\\Users\\bandi\\OneDrive\\Documents\\PrintWriter";
////        List<Emp> employees = repository.findAll();
////        //load file and compile it
////        File file = ResourceUtils.getFile("classpath:employees.jrxml");
////        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
////        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employees);
////
////        Map<String, Object> parameters = new HashMap<>();
////        parameters.put("createdBy", "Java Techie");
////
////        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
////
////        if (reportFormat.equalsIgnoreCase("html")) {
////            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\employees.html");
////        }
////        if (reportFormat.equalsIgnoreCase("pdf")) {
////            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\employees.pdf");
////        }
////
////        return "report generated in path : " + path;
////    }
//
//
//    public String exportReport(String s) throws FileNotFoundException, JRException {
//
//        String path = "C:\\Users\\bandi\\OneDrive\\Documents\\PrintWriter";
//        List<Emp> emps = repository.findAll();
//
//        File file = ResourceUtils.getFile("classpath:employees.jrxml");
//        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
//        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(emps);
//
//        Map<String, Object> parameters = new HashMap<>();
//        parameters.put("SpringBoot", "Japser");
//
//        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
//
//
//        if (s.equalsIgnoreCase("html")) {
//            JasperExportManager.exportReportToHtmlFile(jasperPrint,path + "\\employees.html");
//        }
//        if (s.equalsIgnoreCase("pdf")) {
//            JasperExportManager.exportReportToPdfFile(jasperPrint,path + "\\employees.pdf");
//        }
//
//        return path;
//    }
//
//
//}