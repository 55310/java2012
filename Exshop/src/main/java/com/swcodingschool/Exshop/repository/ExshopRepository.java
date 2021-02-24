package com.swcodingschool.Exshop.repository;

import com.swcodingschool.Exshop.entity.Exshop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface ExshopRepository extends JpaRepository<Exshop, Long>, QuerydslPredicateExecutor<Exshop> {
}
