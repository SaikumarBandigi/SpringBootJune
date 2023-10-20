package com.sb;

//import com.sb.report.Emp;
//import com.sb.report.EmployeeRepo;
//import com.sb.report.ReportService;
//import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

@SpringBootApplication
public class SpringBootJuneApplication {


//  @Autowired
//  private TicketService ticketService;
//
//    @Autowired
//    private EmployeeService employeeService;

//    @Autowired
//    private UserRepository userRepository;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootJuneApplication.class, args);
    }


//    @Override
//    public void run(String... args) throws Exception {
//        Employee employee1=new Employee();
//        employee1.setEmpname("Prabhas Raju");
//        employee1.setDesignation("Actor");
//        employee1.setSalary(50450l);
//        employee1.setAddress("Jubilee Hilss,Road No:44,Hyderabad");
//        employeeService.createEmp(employee1);
//    }

    ///////////////////////////

//    @Override
//    public void run(String... args) throws Exception {
//        Ticket ticket1 = new Ticket();
//        ticket1.setPassengerName("sonu");
//        ticket1.setEmail("sonu@gmail.com");
//        ticket1.setDestinationStation("manali");
//        ticket1.setSourceStation("narayanpet");
//        ticket1.setTravelDate(new Date());
//        ticketService.SaveTicket(ticket1);
//
//    }


    // angular
//    @Override
//    public void run(String...args) throws Exception {
//        this.userRepository.save(new User("Ramesh", "Fadatare", "ramesh@gmail.com"));
//        this.userRepository.save(new User("Tom", "Cruise", "tom@gmail.com"));
//        this.userRepository.save(new User("Tony", "Stark", "tony@gmail.com"));
//    }


}
