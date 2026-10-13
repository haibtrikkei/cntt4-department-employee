package ra.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ra.demo.model.dto.response.ApiDataResponse;
import ra.demo.model.entity.Department;
import ra.demo.service.DepartmentService;
import ra.demo.service.impl.DepartmentServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/v1/departments")
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;

    @GetMapping
    public ResponseEntity<ApiDataResponse<List<Department>>> getDepartments() {
        return new ResponseEntity<>(new ApiDataResponse<>(
                true,
                "Lấy danh sách phòng ban thành công!",
                departmentService.getDepartments(),
                HttpStatus.OK
        ), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ApiDataResponse<Department>> insertDepartment(@RequestBody Department department) {
        return new ResponseEntity<>(new ApiDataResponse<>(
                true,
                "Thêm phòng ban " + department.getDepartName() + " thành công!",
                departmentService.insertDepartment(department),
                HttpStatus.CREATED
        ), HttpStatus.CREATED);
    }
}
