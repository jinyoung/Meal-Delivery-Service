package meal.delivery.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import meal.delivery.service.MarketingApplication;
import meal.delivery.service.domain.AdvertisementCreated;

@Entity
@Table(name = "Advertisement_table")
@Data
public class Advertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String content;

    private String channel;

    @PostPersist
    public void onPostPersist() {
        AdvertisementCreated advertisementCreated = new AdvertisementCreated(
            this
        );
        advertisementCreated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static AdvertisementRepository repository() {
        AdvertisementRepository advertisementRepository = MarketingApplication.applicationContext.getBean(
            AdvertisementRepository.class
        );
        return advertisementRepository;
    }
}
