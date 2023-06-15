package meal.delivery.service.common;

import io.cucumber.spring.CucumberContextConfiguration;
import meal.delivery.service.PaymentApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { PaymentApplication.class })
public class CucumberSpingConfiguration {}
