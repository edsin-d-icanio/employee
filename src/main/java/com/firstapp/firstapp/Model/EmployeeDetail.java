package com.firstapp.firstapp.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.property.access.internal.PropertyAccessStrategyResolverInitiator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employeeDetails")
@Data
@NoArgsConstructor
public class EmployeeDetail {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2",strategy = "uuid2")
    private String id;
    @OneToOne(cascade = {CascadeType.ALL})
    @JsonIgnore
    private Employee employee;
    private String role;
    private int salary;
    private Date joiningDate;
    private String experience;
}
