package com.ThoughtWorks.DDD.Order.application;

import com.ThoughtWorks.DDD.Order.domain.order.Order;
import com.ThoughtWorks.DDD.Order.domain.order.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class OrderQueryService {
    private final OrderRepository repository;

    @Autowired
    public OrderQueryService(OrderRepository repository) {

        this.repository = repository;
    }

    public Order queryOrder(@PathVariable("id") long id) {
        return this.repository.findOne(id);
    }
}