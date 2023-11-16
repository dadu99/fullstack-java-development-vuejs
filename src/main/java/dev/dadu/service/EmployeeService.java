package dev.dadu.service;

import dev.dadu.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    Employee empl = new Employee();

     List<Employee> employeeList = new ArrayList<>(Arrays.asList(
             new Employee(1, "First Employee", "Washington"),
             new Employee(2, "Second Employee", "New York")
            ));

     public List<Employee> getAllEmployees() {
         return  employeeList;
     }

     public Employee getAnEmployee(int id) {
         return employeeList.stream().filter(e -> (
                 e.getId() == id)).findFirst().get();
     }

     public void createEmployee(Employee employee) {
         employeeList.add(employee);
     }

    public void updateEmployee(Employee employee) {
        List<Employee> tempEmployee = new ArrayList<>();
        for(Employee emp : employeeList) {
            if(emp.getId() == employee.getId()) {
                emp.setName(employee.getName());
                emp.setLocation(employee.getLocation());
            }
            tempEmployee.add(emp);
        }
        this.employeeList = tempEmployee;
    }

    public void deleteEmployee(int id) {
         ArrayList<Employee> tempEmployee = new ArrayList<>();
         for(Employee emp : employeeList) {
             if(emp.getId() == id)   //compare every id that we have
                 continue;
                 tempEmployee.add(emp);
         }
         this.employeeList = tempEmployee;

    }
}
