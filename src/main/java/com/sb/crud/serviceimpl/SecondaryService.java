package com.sb.crud.serviceimpl;

import com.sb.crud.service.MyService;
import org.springframework.stereotype.Service;

@Service("secondaryservice")
public class SecondaryService implements MyService {
    @Override
    public String getMessage() {
        return "SecondaryService";
    }
}
