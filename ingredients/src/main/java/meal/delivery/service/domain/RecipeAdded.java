package meal.delivery.service.domain;

import java.util.*;
import lombok.*;
import meal.delivery.service.domain.*;
import meal.delivery.service.infra.AbstractEvent;

@Data
@ToString
public class RecipeAdded extends AbstractEvent {

    private Long id;
    private String name;
    private String description;
}
