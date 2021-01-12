package com.firstapp.firstapp.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "employeeAddress")
@Data
@NoArgsConstructor
public class EmployeeAddress {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2",strategy = "uuid2")
    private String id;
    @OneToOne(cascade = {CascadeType.ALL})
    @JsonIgnore
    private Employee employee;
    private String homeno;
    private String street;
    private String district;
    private int pincode;
}
