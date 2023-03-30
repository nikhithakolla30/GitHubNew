package com.SpringBootProject1.SpringBoot1.service;

import com.SpringBootProject1.SpringBoot1.entity.Department;
import com.SpringBootProject1.SpringBoot1.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DepartmentServiceTest {
    @Autowired
  private DepartmentService departmentService;
    @MockBean
   private DepartmentRepository departmentRepository;
    private Department department;

    @BeforeEach
    void setUp() {
        Department department = Department.builder()
                .departmentName("IT")
                .departmentAddress("Ahmedabad")
                .departmentCode("It-06")
                .departmentId(1L)
                .build();

        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("It"))
                .thenReturn(department);
    }
    @Test
    public void findByDepartmentNameIgnoreCase_shouldReturnDepartment() {
        // Arrange
        Department department = new Department();
        department.setDepartmentId(1L);
        department.setDepartmentName("Engineering");
        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("engineering"))
                .thenReturn(department);

        // Act
        Department result = departmentRepository.findByDepartmentNameIgnoreCase("engineering");

        // Assert
        assertNotNull(result);
        assertEquals("Engineering", result.getDepartmentName());
        assertEquals(1L, result.getDepartmentId().longValue());
    }
}
