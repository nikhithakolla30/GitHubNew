package com.SpringBootProject1.SpringBoot1.service;

import com.SpringBootProject1.SpringBoot1.entity.Department;
import com.SpringBootProject1.SpringBoot1.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
  public  Department saveDepartment(Department department);

  public List<Department> fetchDepartmentList();

 public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

   public void deleteDepartmentById(Long departmentId);

   public Department updateDepartment(Long departmentID, Department department) throws DepartmentNotFoundException;

   public Department fetchDepartmentByName(String departmentName);

  public Department getDepartmentByName(String testDepartment);


}
