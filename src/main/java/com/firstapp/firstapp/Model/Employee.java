package com.firstapp.firstapp.Model;

import antlr.StringUtils;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2",strategy = "uuid2")
    private String id;
    private String firstName;
    private String lastName;
    private long phoneNumber;
}