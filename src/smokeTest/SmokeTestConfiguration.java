package uk.gov.hmcts.labs.ramparitalaspringboot.smoketests;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("uk.gov.hmcts.labs-ramparitala-springboot.smoketests")
@PropertySource("application.properties")
public class SmokeTestConfiguration {
  //TODO: implement smoke tests here
}