package meal.delivery.service.domain;

import java.util.*;
import lombok.*;
import meal.delivery.service.domain.*;
import meal.delivery.service.infra.AbstractEvent;

@Data
@ToString
public class IngredientAdded extends AbstractEvent {

    private Long id;
    private String name;
    private Long supplierId;

    public IngredientAdded(Ingredient aggregate) {
        super(aggregate);
    }

    public IngredientAdded() {
        super();
    }
}
