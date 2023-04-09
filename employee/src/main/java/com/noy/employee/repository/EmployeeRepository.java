package com.noy.employee.repository;

import com.noy.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
    List<Employee> findByDepartmentId(String departmentId);
    List<Employee> findByOrganizationId(String organizationId);
}
