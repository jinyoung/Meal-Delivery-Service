package meal.delivery.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import meal.delivery.service.RecipesApplication;
import meal.delivery.service.domain.RecipeAdded;

@Entity
@Table(name = "Recipe_table")
@Data
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    @PostPersist
    public void onPostPersist() {
        RecipeAdded recipeAdded = new RecipeAdded(this);
        recipeAdded.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static RecipeRepository repository() {
        RecipeRepository recipeRepository = RecipesApplication.applicationContext.getBean(
            RecipeRepository.class
        );
        return recipeRepository;
    }
}
