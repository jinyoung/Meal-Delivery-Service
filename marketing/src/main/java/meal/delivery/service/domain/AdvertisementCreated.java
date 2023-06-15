package meal.delivery.service.domain;

import java.util.*;
import lombok.*;
import meal.delivery.service.domain.*;
import meal.delivery.service.infra.AbstractEvent;

@Data
@ToString
public class AdvertisementCreated extends AbstractEvent {

    private Long id;
    private String content;
    private String channel;

    public AdvertisementCreated(Advertisement aggregate) {
        super(aggregate);
    }

    public AdvertisementCreated() {
        super();
    }
}
