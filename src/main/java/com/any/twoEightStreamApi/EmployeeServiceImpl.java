package com.any.twoEightStreamApi;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;


@Service
public class EmployeeServiceImpl implements EmployeeService {


//    Map<Integer, List<Employee>> employeesMap = new HashMap<>();
    List<Employee> employeesList = new ArrayList<>();


    public EmployeeServiceImpl(List<Employee> employeesList) {
        this.employeesList = employeesList;
    }


    public Employee maxSalary(int departmentId) { //максимальная зарплата
        return employeesList.stream()
                .filter(employee -> employee.getDepartment() == departmentId))
        .max(Comparator.comparingInt(Employee::getSalary))
                .orElseThrow();
    }

    public Employee minSalary(int departmentId) { //минимальная зарплата
        return employeesList.stream()
                .filter(employee -> employee.getDepartment() == departmentId))
        .min(Comparator.comparingInt(Employee::getSalary))
                .orElseThrow();
    }

    public Employee allEmployee(int departmentId) {
      return   employeesList.stream()
                .filter(employee -> employee.getDepartment() == departmentId))
                .forEach(employeeAll -> System.out.println(employee)); // из курсовой метод allEmployee
    }

    public Map<Integer, List<Employee>> allEmployeeNames(Employee employee) {
        return  employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .orElseThrow();
    }

    public Employee averageSalary(int departmentId) { //средняя зарплата
        return employeesList..stream()
                .filter(employee -> employee.getDepartment() == departmentId))
        .average(Comparator.comparingInt(Employee::getSalary))
                .orElseThrow();

                ;
    }

    public Employee sumSalary(Employee departmentId) { //сумма зарплат
        return .stream()
                .filter(employee -> employee.getDepartment() == departmentId))
        .sum(Comparator.comparingInt(Employee::getSalary))
                .orElseThrow();;
    }

}
