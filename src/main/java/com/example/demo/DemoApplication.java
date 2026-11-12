package com.example.demo;

import com.example.demo.Services.OrderService;
import com.example.demo.entities.Order;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner {

    public OrderService orderService;

    public DemoApplication(OrderService orderService) {
        this.orderService = orderService;
    }
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Order order[] = new Order[3];
        order[0] = new Order(1034,150.0,20.0);
        order[1] = new Order(2282,800.0,10.0);
        order[2] = new Order(1309,95.9,0.0);

        for(Order o:order){
            System.out.println("Pedido numero " + o.getCode());
            System.out.println("Valor: " + orderService.total(o));
        }
    }
}
