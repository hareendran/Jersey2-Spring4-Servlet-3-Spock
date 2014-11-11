package org.harry.rs.employeesample.dao;

import org.harry.rs.employeesample.entity.EmployeeEntity;

import java.util.List;

/**
 * Created by harry on 8/4/14.
 */
public interface EmployeeDAO {

    public List<EmployeeEntity > getAllEmployees();
    public EmployeeEntity getEmployeeDetails(Long empId);
    public List<EmployeeEntity>  saveEmployees(List<EmployeeEntity> ems);
    public EmployeeEntity saveEmployee(EmployeeEntity em);

    void delete(Long id);
}
