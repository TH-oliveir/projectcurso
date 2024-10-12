package com.tholiveiweb.coursetest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tholiveiweb.coursetest.entities.OrderItem;
import com.tholiveiweb.coursetest.entities.pk.OrderItemPK;
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
