package com.sb.TicketApplication;


import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketErrorObject {

    private int statusCode;
    private String msg;
    private LocalDate timestamp;

}
