package com.example.customer;

import java.util.List;

public interface DaoCustomer {

    List<Customer> findAllCustomers();

    Customer findCustomerById(int id);

    List<Customer> finAllCustomers();
    Customer finCustomerById(int id);
    Customer saveCustomer(Customer customer);
}
