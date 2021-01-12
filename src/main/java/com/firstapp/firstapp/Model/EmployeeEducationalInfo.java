package com.firstapp.firstapp.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.core.CollectionFactory;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employeeEducationalInfo")
@Data
@NoArgsConstructor
public class EmployeeEducationalInfo {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2",strategy = "uuid2")
    private String id;
    @OneToOne(cascade = {CascadeType.ALL})
    @JsonIgnore
    private Employee employee;
    private String degree;
    private String university;
    private String college;
    private String cgpa;
}
