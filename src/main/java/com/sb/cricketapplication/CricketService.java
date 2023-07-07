package com.sb.cricketapplication;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CricketService {


    private static List<Cricketer> values = new ArrayList<>();

    static {
        values.add(new Cricketer(1, "sachin", 100));
        values.add(new Cricketer(2, "kohli", 90));
        values.add(new Cricketer(3, "dhoni", 80));
        values.add(new Cricketer(4, "rohith", 70));
    }

    public Cricketer get(Integer id) {

        Optional<Cricketer> cricketer = values.stream().filter(e -> e.getCid() == id).findFirst();

        if (!cricketer.isPresent()) {
            throw new CricketerNotFoundException("Cricketer not found" + id);
        } else {
            return cricketer.get();
        }
    }

}