package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Employee;
import edu.icet.ecom.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/employee")
@CrossOrigin()
public class EmployeeController {

    private final EmployeeService service;


    @PostMapping("/add")
    public void add(@RequestBody Employee employee){service.save(employee);
        System.out.println(employee);}

    @GetMapping("/search/{id}")
    public Employee search(@PathVariable Long id){
        return service.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){service.deleteById(id);}

    @PutMapping("/update")
    public void update(@RequestBody Employee customer){service.update(customer);}

    @GetMapping("/get-all")
    public List<Employee> getall(){

        return service.findall();
    }
}
