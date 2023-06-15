package meal.delivery.service.domain;

import java.util.*;
import lombok.*;
import meal.delivery.service.domain.*;
import meal.delivery.service.infra.AbstractEvent;

@Data
@ToString
public class OrderCreated extends AbstractEvent {

    private Long id;
    private Long customerId;

    public OrderCreated(Order aggregate) {
        super(aggregate);
    }

    public OrderCreated() {
        super();
    }
}
