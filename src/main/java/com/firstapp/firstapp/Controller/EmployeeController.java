package com.firstapp.firstapp.Controller;

import com.firstapp.firstapp.Model.Employee;
import com.firstapp.firstapp.Model.EmployeeAddress;
import com.firstapp.firstapp.Model.EmployeeDetail;
import com.firstapp.firstapp.Model.EmployeeEducationalInfo;
import com.firstapp.firstapp.Repo.EmployeeAddressRepository;
import com.firstapp.firstapp.Repo.EmployeeDetailRepository;
import com.firstapp.firstapp.Repo.EmployeeEducationalInfoRepository;
import com.firstapp.firstapp.Repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    EmployeeAddressRepository employeeAddressRepository;
    @Autowired
    EmployeeDetailRepository employeeDetailRepository;
    @Autowired
    EmployeeEducationalInfoRepository employeeEducationalInfoRepository;


    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable String id){
        Optional<Employee> employee=employeeRepository.findById(id);
        return employee.get();
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @PutMapping("employee/{id}")
    public Employee updateEmployee(@PathVariable String id,@RequestBody Employee employee){
        Employee employee1=employeeRepository.getOne(id);
        employee1.setFirstName(employee.getFirstName());
        return employeeRepository.save(employee1);
    }

    @DeleteMapping("employee/{id}")
    public List<Employee> deleteEmployee(@PathVariable String id){
        employeeRepository.deleteById(id);
        return employeeRepository.findAll();
    }

    @PostMapping("/employee/{id}/address")
    public EmployeeAddress createEmployeeAddress(@PathVariable String id,@RequestBody EmployeeAddress employeeAddress){
        Employee employee=employeeRepository.getOne(id);
        employeeAddress.setEmployee(employee);
        return employeeAddressRepository.save(employeeAddress);
    }
    @PutMapping("/employee/{id}/address")
    public EmployeeAddress updateEmployee(@PathVariable String id,@RequestBody EmployeeAddress employeeAddress){
        Employee employee=employeeRepository.getOne(id);
        employeeAddress.setEmployee(employee);
        return employeeAddressRepository.save(employeeAddress);
    }
    @GetMapping("/employee/{id}/address")
    public EmployeeAddress getAddress(@PathVariable String id){
        return employeeAddressRepository.findByEmployeeId(id);
    }
    @PostMapping("/employee/{id}/detail")
    public EmployeeDetail createEmployeeDetail(@PathVariable String id,@RequestBody EmployeeDetail employeeDetail){
        Employee employee=employeeRepository.getOne(id);
        employeeDetail.setEmployee(employee);
        return employeeDetailRepository.save(employeeDetail);
    }

    @PutMapping("/employee/{id}/detail")
    public EmployeeDetail updateEmployeeDetail(@PathVariable String id,@RequestBody EmployeeDetail employeeDetail){
        Employee employee=employeeRepository.getOne(id);
        employeeDetail.setEmployee(employee);
        return employeeDetailRepository.save(employeeDetail);
    }
    @GetMapping("/employee/{id}/detail")
    public EmployeeDetail getDetail(@PathVariable String id){
        return employeeDetailRepository.findByEmployeeId(id);
    }
    @PostMapping("/employee/{id}/educationalInfo")
    public EmployeeEducationalInfo createEmployeeEducationalInfo(@PathVariable String id,@RequestBody EmployeeEducationalInfo employeeEducationalInfo){
        Employee employee=employeeRepository.getOne(id);
        employeeEducationalInfo.setEmployee(employee);
        return employeeEducationalInfoRepository.save(employeeEducationalInfo);
    }
    @PutMapping("/employee/{id}/educationalInfo")
    public EmployeeEducationalInfo updateEmployeeEducationalInfo(@PathVariable String id,@RequestBody EmployeeEducationalInfo educationalInfo){
        Employee employee=employeeRepository.getOne(id);
        educationalInfo.setEmployee(employee);
        return employeeEducationalInfoRepository.save(educationalInfo);
    }
    @GetMapping("/employee/{id}/educationalInfo")
    public EmployeeEducationalInfo getAddressInfo(@PathVariable String id){
        return employeeEducationalInfoRepository.findByEmployeeId(id);
    }
}
