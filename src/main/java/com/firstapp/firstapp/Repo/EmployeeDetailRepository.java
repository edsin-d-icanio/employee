package com.firstapp.firstapp.Repo;

import com.firstapp.firstapp.Model.EmployeeDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDetailRepository extends JpaRepository<EmployeeDetail,String> {
}
