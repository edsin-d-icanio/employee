package com.firstapp.firstapp.Model.rest;

import com.firstapp.firstapp.Model.Employee;
import com.firstapp.firstapp.Model.EmployeeAddress;
import com.firstapp.firstapp.Model.EmployeeDetail;
import com.firstapp.firstapp.Model.EmployeeEducationalInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeeModel {
    private Employee personalInfo;
    private EmployeeEducationalInfo educationalInfo;
    private EmployeeDetail employeeDetail;
    private EmployeeAddress address;
}
