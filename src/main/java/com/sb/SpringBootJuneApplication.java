package com.sb;

import com.sb.TicketApplication.model.Ticket;
import com.sb.TicketApplication.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class SpringBootJuneApplication implements CommandLineRunner {


    @Autowired
    private TicketService ticketService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJuneApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Ticket ticket1 = new Ticket();
        ticket1.setPassengerName("sonu");
        ticket1.setEmail("sonu@gmail.com");
        ticket1.setDestinationStation("manali");
        ticket1.setSourceStation("narayanpet");
        ticket1.setTravelDate(new Date());
        ticketService.SaveTicket(ticket1);

    }
}
