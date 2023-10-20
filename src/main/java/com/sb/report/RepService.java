//package com.sb.report;
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
//public class RepService {
//
//    @Autowired
//    private StudentRepo studentRepo;
//
//
//    public String getReport(String s) throws FileNotFoundException, JRException {
//        String path = "C:\\Users\\bandi\\OneDrive\\Documents\\PrintWriter";
//        List<Student> students = studentRepo.findAll();
//
//        File file = ResourceUtils.getFile("classpath:students.jrxml");
//        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
//
//        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(students);
//
//
//        Map<String, Object> parameters = new HashMap<>();
//        parameters.put("StudentsReport", "SpringBoot");
//
//        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
//
//
//        if (s.equalsIgnoreCase("html")) {
//            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\students.html");
//        }
//
//        if (s.equalsIgnoreCase("pdf")) {
//            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\students.pdf");
//        }
//
//        return path;
//    }
//
//}
