package com.noy.department.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
public class Employee {
    private String id;
    private String name;
    private int age;
    private String position;
    private String organizationId;
    private String departmentId;
}
