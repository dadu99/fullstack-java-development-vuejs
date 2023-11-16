package dev.dadu.controller;


import dev.dadu.entity.Employee;
import dev.dadu.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //@RequestMapping("/api/employees")
    //@RequestMapping(value = "/api/employees", method = RequestMethod.GET)
    @GetMapping("/api/employees")
    public List<Employee> findAllEmployees() {
        return employeeService.getAllEmployees();
    }

    //@RequestMapping("/api/employees/{id}")
    @GetMapping("/api/employees/{id}")
    public Employee findAnEmployee(@PathVariable int id) {
        return employeeService.getAnEmployee(id);
    }

    //@RequestMapping(value = "/api/employees", method = RequestMethod.POST)
    @PostMapping("/api/employees")
    public void createEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
    }


    //@RequestMapping(value = "/api/employees/{id}", method = RequestMethod.PUT)
    @PutMapping("/api/employees/{id}")
    public void updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
    }

    //@RequestMapping(value = "/api/employees/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/api/employees/{id}")
    public List<Employee> deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
        return employeeService.getAllEmployees();
    }
}