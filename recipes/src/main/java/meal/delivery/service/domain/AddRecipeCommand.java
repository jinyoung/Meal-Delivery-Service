package meal.delivery.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class AddRecipeCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String name;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String description;
}
