package meal.delivery.service.common;

import io.cucumber.spring.CucumberContextConfiguration;
import meal.delivery.service.MarketingApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MarketingApplication.class })
public class CucumberSpingConfiguration {}
