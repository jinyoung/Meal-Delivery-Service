package meal.delivery.service.domain;

import java.util.*;
import lombok.*;
import meal.delivery.service.domain.*;
import meal.delivery.service.infra.AbstractEvent;

@Data
@ToString
public class OrderUpdated extends AbstractEvent {

    private Long id;
    private Long recipeId;
    private Long quantity;
}
