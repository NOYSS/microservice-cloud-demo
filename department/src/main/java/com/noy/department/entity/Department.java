package com.noy.department.entity;

import com.noy.department.model.Employee;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.List;

@Data
@Entity
public class Department {
    @Id
    private String id;
    private String name;
    private String organizationId;
    @Transient
    private List<Employee> employees;
}
