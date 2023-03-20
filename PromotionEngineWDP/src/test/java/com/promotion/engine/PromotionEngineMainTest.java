package com.promotion.engine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class PromotionEngineMainTest {
  @AfterEach
   void reset() {
    PromotionEngineMain.totalAmount = 0;
  }

  @Test
  void scenarioAtest1() {
    String userInput = "1" + System.getProperty("line.separator") + "1-A"
        + System.getProperty("line.separator");
    InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
    System.setIn(inputStream);
    PromotionEngineMain.main(null);
    assertEquals(50, PromotionEngineMain.totalAmount);
  }

  @Test
  void scenarioAtest2() {
    String userInput = "1" + System.getProperty("line.separator") + "1-B"
        + System.getProperty("line.separator");
    InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
    System.setIn(inputStream);
    PromotionEngineMain.main(null);
    assertEquals(30, PromotionEngineMain.totalAmount);
  }

  @Test
   void scenarioAtest3() {
    String userInput = "1" + System.getProperty("line.separator") + "1-C"
        + System.getProperty("line.separator");
    InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
    System.setIn(inputStream);
    PromotionEngineMain.main(null);
    assertEquals(20, PromotionEngineMain.totalAmount);
  }

  @Test
   void scenarioAtest4() {
    String userInput = "1" + System.getProperty("line.separator") + "1-D"
        + System.getProperty("line.separator");
    InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
    System.setIn(inputStream);
    PromotionEngineMain.main(null);
    assertEquals(15, PromotionEngineMain.totalAmount);
  }
}
