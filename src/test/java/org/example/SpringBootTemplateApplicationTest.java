package org.example;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

@WebMvcTest
@ActiveProfiles("dev")
public class SpringBootTemplateApplicationTest {

  @Autowired
  private ApplicationContext applicationContext;

  @Test
  public void contextLoads() {
    assertNotNull(applicationContext);
  }
}
