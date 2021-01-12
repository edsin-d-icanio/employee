package com.firstapp.firstapp.Repo;

import com.firstapp.firstapp.Model.Employee;
import com.firstapp.firstapp.Model.EmployeeAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddress,String> {
}
