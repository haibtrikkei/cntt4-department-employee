package ra.demo.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ra.demo.model.entity.Department;
import ra.demo.repository.DepartmetRepository;
import ra.demo.service.DepartmentService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmetRepository departmetRepository;

    @Override
    public List<Department> getDepartments() {
        return departmetRepository.findAll();
    }

    @Override
    public Department insertDepartment(Department department) {
        return departmetRepository.save(department);
    }
}
