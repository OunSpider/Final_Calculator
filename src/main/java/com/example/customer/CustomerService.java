package com.example.customer;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Transactional
public class CustomerService {

    private final DaoCustomer customerDao;

    public CustomerService(DaoCustomer customerDao) {
        this.customerDao = customerDao;
    }

    public List<Customer> getAllCustomers() {
        return customerDao.findAllCustomers();
    }

    public Customer getCustomer(int id) {
        return customerDao.findCustomerById(id);
    }

    @Transactional
    public Customer addCustomer(Customer customer) {
        customer.setId(0);
        return customerDao.saveCustomer(customer);
    }

    @Transactional
    public Customer updateCustomer(int id, Customer customer) {
        customer.setId(id);
        return customerDao.saveCustomer(customer);
    }
}
