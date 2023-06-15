package meal.delivery.service.common;

import io.cucumber.spring.CucumberContextConfiguration;
import meal.delivery.service.IngredientsApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { IngredientsApplication.class })
public class CucumberSpingConfiguration {}
