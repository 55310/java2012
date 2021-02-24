package com.swcodingschool.Shop.repository;

import com.swcodingschool.Shop.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface ShopRepository extends JpaRepository<Shop, Long>, QuerydslPredicateExecutor<Shop> {
}
