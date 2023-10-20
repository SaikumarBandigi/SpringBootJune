//package com.sb.report;
//
//import net.sf.jasperreports.engine.JRException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.io.FileNotFoundException;
//
//@RestController
//@RequestMapping("/student")
//public class StudentController {
//
//    @Autowired
//    private StudentRepo studentRepo;
//    @Autowired
//    private RepService repService;
//
//
//    @PostMapping("/post")
//    public Student postStudent(@RequestBody Student student) {
//       return studentRepo.save(student);
//    }
//
//    @GetMapping("/rep/{s}")
//    public String generate(@PathVariable String s) throws JRException, FileNotFoundException {
//        return repService.getReport(s);
//    }
//}
