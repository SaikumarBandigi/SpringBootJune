package com.sb.hib.controller;

import com.sb.hib.model.Worker;
import com.sb.hib.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/addre")
public class WorkerController {

    @Autowired
    private WorkerService workerService;


    @PostMapping("/save")
    public void saveWor(@RequestBody Worker worker) {
        workerService.saveAddre(worker);
    }


}
