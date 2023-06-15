package meal.delivery.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import meal.delivery.service.PaymentApplication;
import meal.delivery.service.domain.PaymentMade;

@Entity
@Table(name = "Payment_table")
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long orderId;

    private Double amount;

    @PostPersist
    public void onPostPersist() {
        PaymentMade paymentMade = new PaymentMade(this);
        paymentMade.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static PaymentRepository repository() {
        PaymentRepository paymentRepository = PaymentApplication.applicationContext.getBean(
            PaymentRepository.class
        );
        return paymentRepository;
    }
}
