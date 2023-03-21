package com.SpringBootProject1.SpringBoot1.controller;

import com.SpringBootProject1.SpringBoot1.entity.Department;
import com.SpringBootProject1.SpringBoot1.service.DepartmentService;
import com.SpringBootProject1.SpringBoot1.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
   @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody  Department department){DepartmentService service = new DepartmentServiceImpl();
    return departmentService.saveDepartment(department);
  }
}
