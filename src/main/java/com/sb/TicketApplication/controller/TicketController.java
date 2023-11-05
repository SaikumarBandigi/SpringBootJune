package com.sb.TicketApplication.controller;

import com.sb.TicketApplication.model.Ticket;
import com.sb.TicketApplication.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


    @DeleteMapping("/deleteById/{id}")
    public void deleteTicket(@PathVariable Integer id) {

        ticketService.deleteTicket(id);
    }

    @GetMapping(value = "/getTicketById")
    public Ticket getTicketById(Integer integer) {
        Ticket ticket = ticketService.getTicketById(integer);
        return ticket;
    }


    @PostMapping("/saveAll")
    public void savAl(@RequestBody Iterable<Ticket> tickets) {
        ticketService.sAll(tickets);
    }


    //Iterable<T> findAllById(Iterable<ID> ids);
    @GetMapping(value = "/findAllById/{ids}")
    public Iterable<Ticket> findAllById(@PathVariable List<Integer> ids) {
        return ticketService.findAll(ids);
    }


    //Iterable<T> findAllById(Iterable<ID> ids);
    @DeleteMapping(value = "/deleteAllById")
    public void deleteAllId(@RequestParam List<Integer> ids) {
        ticketService.deleteAllById(ids);
    }


    // adv Passenger Name
    @GetMapping(value = "/findByPassengerName")
    public Ticket get(String s) {
        return ticketService.getTicketadv(s);
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
