package com.sb;

//import com.sb.report.Emp;
//import com.sb.report.EmployeeRepo;
//import com.sb.report.ReportService;
//import net.sf.jasperreports.engine.JRException;


import com.sb.crud.model.Person;
import com.sb.crud.model.Product;
import com.sb.crud.service.PersonService;
import com.sb.crud.service.ProductService;
import com.sb.employeeapplication.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.ConfigurableWebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableWebMvc
public class SpringBootJuneApplication {


    //  @Autowired
//  private TicketService ticketService;
//
    @Autowired
    private EmployeeService employeeService;

//    @Autowired
//    private UserRepository userRepository;

    @Autowired
    private PersonService personService;

    public SpringBootJuneApplication() {
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(SpringBootJuneApplication.class, args);

    }


    //////////////////// one way for CommandLineRunner //////////////////////
//
//    // Inner class implementing CommandLineRunner
//    @Bean
//    public CommandLineRunner init(ProductService productService) {
//        return new MyCommandLineRunner(productService);
//    }
//
//    // Inner class definition
//    private static class MyCommandLineRunner implements CommandLineRunner {
//
//        private final ProductService productService;
//
//        public MyCommandLineRunner(ProductService productService) {
//            this.productService = productService;
//        }
//
//        @Override
//        public void run(String... args) throws Exception {
//            // Your initialization logic here
//            // Example: Adding a product
//            Product product = new Product();
//            product.setPname("dell");
//            product.setEmail("d@gmail.com");
//            productService.saveProduct(product);
//        }
//    }


//////////////////////////// second way for CommandLineRunner /////////////////

//    @Bean
//    CommandLineRunner commandLineRunner(EmployeeService employeeService) {
//        return args -> {
//            Employee employee1 = new Employee();
//            employee1.setEmpname("Prabhas Raju");
//            employee1.setDesignation("Actor");
//            employee1.setSalary(50450l);
//            employee1.setAddress("Jubilee Hilss,Road No:44,Hyderabad");
//            employeeService.createEmp(employee1);
//        };
//    }


    ////////////////////// third way for CommandLineRunner (through implements commandLineRunner) ///////////////
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


    private void createPersons() {

        /*
         * List<Person> personList=new ArrayList<Person>();
         *
         * personList.add(new Person("Kiran", "kumar", "kiran@gmail.com", 20));
         *
         * personList.add(new Person("Kiran1", "kumar", "kiran@gmail.com", 20));
         *
         * personList.add(new Person("Kiran2", "kumar", "kiran@gmail.com", 20));
         * personList.add(new Person("Kiran3", "kumar", "kiran@gmail.com", 20));
         * personList.add(new Person("Kiran4", "kumar", "kiran@gmail.com", 20));
         * personList.add(new Person("Kiran5", "kumar", "kiran@gmail.com", 20));
         * personList.add(new Person("Kiran7", "kumar", "kiran@gmail.com", 20));
         * personList.add(new Person("Kiran8", "kumar", "kiran@gmail.com", 20));
         *
         * personService.saveAllpersons(personList);
         *
         * personList=null;
         */

        // List<Person> personList=new ArrayList<Person>();
        // Person per=new Person();

        List<Person> personList = Arrays.asList(new Person("Kiran", "kumar", "kiran@gmail.com", 20),
                new Person("Ram", "kumar", "ram@gmail.com", 22),
                new Person("RamKiran", "LaxmiKiran", "sita@gmail.com", 30),
                new Person("Lakshamn", "Seth", "seth@gmail.com", 50),
                new Person("Sita", "Kumar", "lakshman@gmail.com", 50),
                new Person("Ganesh", "Kumar", "ganesh@gmail.com", 50),
                new Person("KiranKiran", "kumar", "kiran@yahoo.com", 20),
                new Person("RamRam", "kumar", "ram@yahoo.com", 22),
                new Person("RamKiranRamKiran", "LaxmiKiran", "sita@yahoo.com", 30),
                new Person("RamKiranRamKiran", "Seth", "seth@yahoo.com", 50),
                new Person("SitaSita", "Kumar", "lakshman@yahoo.com", 50),
                new Person("GaneshSita", "Kumar", "ganesh@yahoo.com", 50));

        Iterable<Person> list = personService.saveAllPersons(personList);
        for (Person person : list) {
            System.out.println("Person Object" + person.toString());

        }
    }


////////////////////////////////////////////////


}

/*
In a Spring application, you can then use the configuration class to load the application context and obtain beans.
 */
