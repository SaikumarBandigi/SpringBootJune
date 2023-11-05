package com.sb.crud;


import javax.persistence.*;

@Entity                                                       //SELECT * FROM Product WHERE pname LIKE 'k%';
@NamedQuery(name = "Product.findByNameStartingWithK", query = "SELECT p FROM Product p WHERE LOWER(p.pname) LIKE 'k%'")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;
    private String pname;
    private String email;


    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
