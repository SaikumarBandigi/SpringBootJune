package com.sb.report;

////import net.sf.jasperreports.engine.JRException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.io.FileNotFoundException;
//import java.util.List;
//
//@RestController
//@RequestMapping("/jasper")
//public class EmpController {
//
//    @Autowired
//    private EmployeeRepo repository;
//    @Autowired
//    private ReportService service;
//
//    @GetMapping("/getEmployees")
//    public List<Emp> getEmployees() {
//        return repository.findAll();
//    }
//
//    @PostMapping("/postEmp")
//    public Emp save(@RequestBody Emp emp) {
//       return repository.save(emp);
//    }
//
//
//    @GetMapping("/report/{format}")
//    public String generateReport(@PathVariable String format) throws FileNotFoundException, JRException {
//        return service.exportReport(format);
//    }
//}
