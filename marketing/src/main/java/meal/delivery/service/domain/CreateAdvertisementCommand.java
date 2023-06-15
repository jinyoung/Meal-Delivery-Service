package meal.delivery.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateAdvertisementCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String content;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String channel;
}
