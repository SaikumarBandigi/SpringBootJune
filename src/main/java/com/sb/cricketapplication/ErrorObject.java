package com.sb.cricketapplication;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ErrorObject {

    private int statuscode;
    private String msg;
    private LocalDate timestamp;

}