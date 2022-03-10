package com.any.twoEightStreamApi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employeesList;

    public EmployeeServiceImpl() {
        this.employeesList = new ArrayList<>();
        employeesList.add(new Employee(0, "Nikolaeva", 33, 300_000));
        employeesList.add(new Employee(1, "Ivanov", 30, 360_000));
        employeesList.add(new Employee(2, "Petrov", 03, 200_000));
        employeesList.add(new Employee(3, "Pavlova", 33, 260_000));

    }

    public void maxSalary(Employee employee) {
        employeesList.stream()
                .max(Comparator.comparingDouble(employeeMax -> employee.getSalary()));// из курсовой метод maxSalary
    }

    public void minSalary(Employee employee) {
        employeesList.stream()
                .min(Comparator.comparingDouble(employeeMin -> employee.getSalary()));// из курсовой метод minSalary
    }

    public void allEmployee(Employee employee) {
        employeesList.stream()
                .forEach(employeeAll -> System.out.println(employee)); // из курсовой метод allEmployee

    }

    public void allEmployeeNames(Employee employee) {
        employeesList.stream()
                .forEach(employeeNames -> System.out.println(employee.getFamilyName())); // из курсовой метод onlyNamesEmployee
    }

    public  void averageSalary(Employee employee) {
       int employeesList = employee.employeesList.stream()   // из курсовой метод midSalary
                .map( employeeAverage -> employeeAverage.chars()
                        .average();
    }
    public void sumSalary(Employee employee) {
        int employeesList = employee.employeesList.stream()   // из курсовой метод midSalary
                .map( employeeAverage -> employeeAverage.chars()
                        .sum();
    }

}
