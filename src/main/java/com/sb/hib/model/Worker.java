package com.sb.hib.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int wid;

    private String wname;

    @OneToMany(cascade = CascadeType.ALL, targetEntity = Address.class,mappedBy = "worker")
    private List<Address> address = new ArrayList<>();


    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }


}
