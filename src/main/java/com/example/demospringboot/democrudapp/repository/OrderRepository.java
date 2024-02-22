package com.example.demospringboot.democrudapp.repository;

import com.example.demospringboot.democrudapp.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
