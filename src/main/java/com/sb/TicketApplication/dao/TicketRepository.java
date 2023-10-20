package com.sb.TicketApplication.dao;

import com.sb.TicketApplication.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TicketRepository extends CrudRepository<Ticket, Integer> {

    Ticket findByPassengerName(String passengerName);
    Ticket getByPassengerName(String passengerName);

}
