package dev.dadu.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Employee {

    private int id;
    private String name;
    private String location;


    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return this.location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public Employee() {}
    public Employee(int _id, String _name, String _location) {
        this.id = _id;
        this.name = _name;
        this.location = _location;
    }
}
