package com.sb.TicketApplication.controller;

import com.sb.TicketApplication.TicketErrorObject;
import com.sb.TicketApplication.model.Ticket;
import com.sb.TicketApplication.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/save")
    public Ticket saveTicket(@RequestBody Ticket ticket) {

        return ticketService.SaveTicket(ticket);
    }

    @PutMapping("/update")
    public Ticket updateTicket(Integer integer, String name) {

        return ticketService.updateTicket(integer, name);
    }


     @PutMapping("/updatee")
    public Ticket updateTicket(@RequestBody Ticket ticket) {

        return ticketService.updateTicketUsingJson(ticket);
    }

    @GetMapping("/getAllTickets")
    public Iterable<Ticket> getAllTickets() {

        return ticketService.getAllTickets();
    }


    @DeleteMapping("/deleteById")
    public void deleteTicket(Integer integer) {

        ticketService.deleteTicket(integer);
    }

    @GetMapping(value = "/getTicketById")
    public Ticket getTicketById(Integer integer) {

        Ticket ticket = null;
        ticket = ticketService.getTicketById(integer);
        // return ticketService.getTicketById(integer);
        return ticket;
    }


//    @ExceptionHandler
//    public ResponseEntity<TicketErrorObject> getEx(NoSuchElementException ex) {
//        TicketErrorObject ticketErrorObject = new TicketErrorObject(HttpStatus.NOT_FOUND.value(), ex.getMessage(), LocalDate.now());
//        ResponseEntity<TicketErrorObject> res = new ResponseEntity<>(ticketErrorObject, HttpStatus.NOT_FOUND);
//        return res;
//    }


    /*

    {
    "passengerName":"prashanth",
    "sourceStation":"chennai",
    "destinationStation":"ooty",
    "travelDate":"2023-04-26",
    "email":"p@gmail.com"
}
     */

}
