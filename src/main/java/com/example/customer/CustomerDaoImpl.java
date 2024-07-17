package com.example.customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CustomerDaoImpl implements DaoCustomer {

    private final EntityManager entityManager;

    public CustomerDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Customer> findAllCustomers() {
        TypedQuery<Customer> query = entityManager.createQuery("SELECT c FROM Customer c", Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer findCustomerById(int id) {
        return entityManager.find(Customer.class, id);
    }

    @Override
    public List<Customer> finAllCustomers() {
        return List.of();
    }

    @Override
    public Customer finCustomerById(int id) {
        return null;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return entityManager.merge(customer);
    }
}
