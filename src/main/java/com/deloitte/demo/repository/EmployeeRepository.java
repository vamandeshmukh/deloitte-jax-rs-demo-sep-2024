// // EmployeeRepository.java 

package com.deloitte.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.deloitte.demo.model.Employee;

public class EmployeeRepository {

    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EmployeePU");

    public Employee addEmployee(Employee employee) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();
        entityManager.close();
        return employee;
    }

    public List<Employee> getAllEmployees() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Employee> employees = entityManager.createQuery("SELECT e FROM Employee e", Employee.class).getResultList();
        entityManager.close();
        return employees;
    }

    // Implement other methods like updateEmployee, getEmployeeById, deleteEmployee...
}
