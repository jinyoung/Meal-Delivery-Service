package meal.delivery.service.common;

import io.cucumber.spring.CucumberContextConfiguration;
import meal.delivery.service.RecipesApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { RecipesApplication.class })
public class CucumberSpingConfiguration {}
