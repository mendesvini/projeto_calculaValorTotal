package com.example.demo.Services;

import com.example.demo.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        if(order.getPrice()<100){
             return 20.0;
        } else if (order.getPrice()<200) {
            return 12.0;
        }else{
            return 0.0;
        }
    }
}
