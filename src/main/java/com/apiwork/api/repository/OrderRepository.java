package com.apiwork.api.repository;

import com.apiwork.api.enteties.Item;
import com.apiwork.api.enteties.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
