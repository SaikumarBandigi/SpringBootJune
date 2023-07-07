package com.sb.cricketapplication;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class Cricketer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;
    private String cname;
    private int score;
}
