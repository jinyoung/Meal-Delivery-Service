package meal.delivery.service.domain;

import meal.delivery.service.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "payments", path = "payments")
public interface PaymentRepository
    extends PagingAndSortingRepository<Payment, Long> {}
