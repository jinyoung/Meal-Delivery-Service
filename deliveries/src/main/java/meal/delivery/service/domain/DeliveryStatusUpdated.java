package meal.delivery.service.domain;

import java.util.*;
import lombok.*;
import meal.delivery.service.domain.*;
import meal.delivery.service.infra.AbstractEvent;

@Data
@ToString
public class DeliveryStatusUpdated extends AbstractEvent {

    private Long id;
    private String status;

    public DeliveryStatusUpdated(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryStatusUpdated() {
        super();
    }
}
