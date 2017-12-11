package com.nic.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nic.models.Order;

public class OrdersService {

    private static Map<String,Order> orders = new HashMap<>();
    private static int nextId = 6;
    static {
    	orders.put("1", new Order("1", "Mobile", 33));
        orders.put("2", new Order("2", "Care", 44));
        orders.put("3", new Order("3", "Pen", 33));
        orders.put("4", new Order("4", "Laptop", 44));
        orders.put("5", new Order("5", "Book", 66));
    }

    public Order get(String id) {
        return orders.get(id);
    }

    public List<Order> getAll() {
        return new ArrayList<>(orders.values());
    }

    public void save(Order order) {
        if (order.getItemId() == null) {
            order.setItemId(String.valueOf(nextId++));
        }

        orders.put(order.getItemId(), order);
    }

    public void remove(String id) {
        orders.remove(id);
        //throw new RuntimeException("Order remove currently not supported!");
    }

}
