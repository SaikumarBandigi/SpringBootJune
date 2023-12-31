package com.sb.TicketApplication.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_ticket")
public class Ticket {

    @Id
    @Column(name = "ticket_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ticketId;

    @Column(name = "passenger_name")
    private String passengerName;

    @Column(name = "source_station")
    private String sourceStation;

    @Column(name = "destination_station")
    private String destinationStation;

    @Column(name = "travel_date")
    private Date travelDate;

    private String email;


    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getSourceStation() {
        return sourceStation;
    }

    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public Date getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Ticket() {
    }


    public Ticket(Integer ticketId, String passengerName, String sourceStation, String destinationStation, Date travelDate, String email) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
        this.travelDate = travelDate;
        this.email = email;
    }
}