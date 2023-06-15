package meal.delivery.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import meal.delivery.service.IngredientsApplication;
import meal.delivery.service.domain.IngredientAdded;

@Entity
@Table(name = "Ingredient_table")
@Data
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Long supplierId;

    @PostPersist
    public void onPostPersist() {
        IngredientAdded ingredientAdded = new IngredientAdded(this);
        ingredientAdded.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static IngredientRepository repository() {
        IngredientRepository ingredientRepository = IngredientsApplication.applicationContext.getBean(
            IngredientRepository.class
        );
        return ingredientRepository;
    }
}
