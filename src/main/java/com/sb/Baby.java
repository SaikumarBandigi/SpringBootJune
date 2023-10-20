package com.sb;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Baby {

    public Baby() {
        System.out.println("Baby Constructor called..");
    }

}
