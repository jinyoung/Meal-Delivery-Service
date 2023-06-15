package meal.delivery.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class UpdateDeliveryStatusCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long deliveryId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String status;
}
