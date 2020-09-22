package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model. Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByCategory(Category  category);

    Page<Customer> findAllByuserNameContaining(String userName, Pageable pageable);
}
