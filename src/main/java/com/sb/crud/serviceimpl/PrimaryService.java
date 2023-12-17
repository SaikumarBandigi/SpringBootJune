package com.sb.crud.serviceimpl;

import com.sb.crud.service.MyService;
import org.springframework.stereotype.Service;

@Service("PrimaryService")
public class PrimaryService implements MyService {
    @Override
    public String getMessage() {
        return "primary service...";
    }
}
