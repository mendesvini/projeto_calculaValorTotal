package com.example.demo.Services;

import com.example.demo.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order){
        double total = 0;
        double percent = order.getPrice()*(1-(order.getDiscount()/100));

        double frete = shippingService.shipment(order);
        total = percent + frete;
        return total;
    }
}
