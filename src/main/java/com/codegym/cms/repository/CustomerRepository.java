package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model. Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByCategory( Category  Category);

    Page<Customer> findAllByUserNameContaining(String userName, Pageable pageable);
}
