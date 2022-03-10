package com.any.twoEightStreamApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
public class DataEmployeeController {
    private final EmployeeServiceImpl departmentId;

    public DataEmployeeController(EmployeeServiceImpl departmentId) {
        this.departmentId = departmentId;
    }

    @GetMapping(path = "/max-salary")
public int maxSalary (@RequestParam int departmentId) {
        return maxSalary();
    }

    @GetMapping(path = "/min-salary")
    public int minSalary (@RequestParam int departmentId) {
        return minSalary();
    }

    @GetMapping(path = "/average-salary")
    public int averageSalarySalary (@RequestParam int departmentId) {
        return averageSalarySalary();
    }

    @GetMapping(path = "/sum-salary")
    public int sumSalary (@RequestParam int departmentId) {
        return sumSalary();
    }

    @GetMapping(path = "/all")
    public int allEmployeeNames () {
        return allEmployeeNames();
    }
    @GetMapping(path = "/all")
    public int allEmployee (@RequestParam int departmentId) {
        return allEmployee();
    }

}
