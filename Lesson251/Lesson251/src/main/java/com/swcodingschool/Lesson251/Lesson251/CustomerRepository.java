package com.swcodingschool.Lesson251.Lesson251;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

	List<Customer> findByLastNameStartsWithIgnoreCase(String lastName);
}
