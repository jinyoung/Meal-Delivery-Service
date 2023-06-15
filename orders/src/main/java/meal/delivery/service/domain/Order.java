package meal.delivery.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import meal.delivery.service.OrdersApplication;
import meal.delivery.service.domain.OrderCreated;

@Entity
@Table(name = "Order_table")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long customerId;

    @PostPersist
    public void onPostPersist() {
        OrderCreated orderCreated = new OrderCreated(this);
        orderCreated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static OrderRepository repository() {
        OrderRepository orderRepository = OrdersApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }

    public void addToOrder(AddToOrderCommand addToOrderCommand) {
        //implement business logic here:

        OrderUpdated orderUpdated = new OrderUpdated(this);
        orderUpdated.publishAfterCommit();
    }
}
