package meal.delivery.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import meal.delivery.service.DeliveriesApplication;

@Entity
@Table(name = "Delivery_table")
@Data
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long orderId;

    private String status;

    @PrePersist
    public void onPrePersist() {}

    public static DeliveryRepository repository() {
        DeliveryRepository deliveryRepository = DeliveriesApplication.applicationContext.getBean(
            DeliveryRepository.class
        );
        return deliveryRepository;
    }

    public void updateDeliveryStatus(
        UpdateDeliveryStatusCommand updateDeliveryStatusCommand
    ) {
        //implement business logic here:

        DeliveryStatusUpdated deliveryStatusUpdated = new DeliveryStatusUpdated(
            this
        );
        deliveryStatusUpdated.publishAfterCommit();
    }
}
