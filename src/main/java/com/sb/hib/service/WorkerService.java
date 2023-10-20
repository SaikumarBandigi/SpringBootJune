package com.sb.hib.service;

import com.sb.hib.dao.WorkerDao;
import com.sb.hib.model.Address;
import com.sb.hib.model.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WorkerService {

    @Autowired
    private WorkerDao workerDao;


    public void saveAddre(Worker worker) {
        workerDao.save(worker);
    }

//    @Transactional
//    public void saveAddre(Worker worker) {
//        // Associate the addresses with the worker
//        for (Address address : worker.getAddress()) {
//            address.setWorker(worker);
//        }
//
//        workerDao.save(worker);
//    }


}
