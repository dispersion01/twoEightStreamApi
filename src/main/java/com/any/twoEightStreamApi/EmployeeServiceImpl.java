package com.any.twoEightStreamApi;

import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    //  решение через list
    private final List<Employee> employeesList;

    public EmployeeServiceImpl() {
        employeesList = new ArrayList<>();
    }

    @Override
    public Collection<Employee> getAll() {
        return List.copyOf(employeesList);
    }

    @Override
    public Employee add(String familyName, int department, int salary) {
        Employee newElement = new Employee(familyName, department, salary);
        if (newElement.equals(employeesList.contains(familyName))) {
            throw new RuntimeException("Сотрудник уже существует");
        }
        employeesList.add(newElement);
        return newElement;
    }


    public Employee remove(String familyName, int department, int salary) {
        Employee removeElement = new Employee(familyName, department, salary);
        if (employeesList.contains(removeElement)) {
            employeesList.remove(removeElement);
        }
        throw new RuntimeException();

    }

    public Employee find(String familyName, int department, int salary) {
        Employee findElement = new Employee(familyName, department, salary);
        if (employeesList.contains(findElement)) {
            return findElement;
        }
        return findElement;
    }

/*

    //    решение через Map
    private final Map<String, Employee> employeeMap;

    public EmployeeServiceImpl() {
        employeeMap = new HashMap<>();
    }


    private String getKey(String familyName) {
        return familyName;
    }
    @Override
    public Collection<Employee> getAll() {
        return Collections.unmodifiableCollection(employeeMap.values());

    }
    @Override
    public Employee add(String familyName, int department, int salary) {
        String key = getKey(familyName);
        if (employeeMap.containsKey(key)) {
            throw new RuntimeException();
        }
        Employee newElement = new Employee(familyName, department, salary);
        employeeMap.put(key, newElement);
        return newElement;
    }

@Override
    public Employee remove(String familyName, int department, int salary) {
        String key = getKey(familyName);
        if (employeeMap.remove(key) == null) {
            throw new RuntimeException();
        }
        Employee removeElement = new Employee(familyName, department, salary);
        return removeElement;

    }
@Override
    public Employee find(String familyName, int department, int salary) {
        String key = getKey(familyName);
        Employee findElement = employeeMap.get(familyName);
        if (findElement == null) {
            throw new RuntimeException();
        }
        return findElement;
    }
*/



}
