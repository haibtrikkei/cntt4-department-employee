package ra.demo.service;

import ra.demo.model.entity.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getDepartments();
    Department insertDepartment(Department department);
}
