package com.gl.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gl.model.Employee;

@Repository
public class employeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveEmployee(Employee emp) {
        sessionFactory.getCurrentSession().saveOrUpdate(emp);
    }

    @Override
    public void updateEmployee(Employee emp) {
        sessionFactory.getCurrentSession().update(emp);
    }

    @Override
    public void deleteEmployee(Long id) {
        Employee emp = getEmployeeById(id);
        if (emp != null) {
            sessionFactory.getCurrentSession().delete(emp);
        }
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Employee> getAllEmployees() {
        return sessionFactory.getCurrentSession().createQuery("from Employee").list();
    }
}
