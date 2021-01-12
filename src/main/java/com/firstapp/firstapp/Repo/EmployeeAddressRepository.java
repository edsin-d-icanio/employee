package com.firstapp.firstapp.Repo;

import com.firstapp.firstapp.Model.Employee;
import com.firstapp.firstapp.Model.EmployeeAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddress,String> {
    EmployeeAddress findByEmployeeId(String id);
}
