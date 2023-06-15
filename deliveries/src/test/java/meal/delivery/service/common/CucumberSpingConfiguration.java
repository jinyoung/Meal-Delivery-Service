package meal.delivery.service.common;

import io.cucumber.spring.CucumberContextConfiguration;
import meal.delivery.service.DeliveriesApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DeliveriesApplication.class })
public class CucumberSpingConfiguration {}
