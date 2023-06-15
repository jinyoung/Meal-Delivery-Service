package meal.delivery.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class AddToOrderCommand {

    private Long orderId;
    private Long recipeId;
    private Long quantity;
}
