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

  @Test
   void scenarioBtest5() {
    String userInput = "2" + System.getProperty("line.separator") + "1-A"
        + System.getProperty("line.separator") + "1-B" + System.getProperty("line.separator");
    InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
    System.setIn(inputStream);
    PromotionEngineMain.main(null);
    assertEquals(80, PromotionEngineMain.totalAmount);
  }

  @Test
   void scenarioBtest6() {
    String userInput = "3" + System.getProperty("line.separator") + "1-A"
        + System.getProperty("line.separator") + "1-B" + System.getProperty("line.separator") + "1-C"
        + System.getProperty("line.separator");
    InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
    System.setIn(inputStream);
    PromotionEngineMain.main(null);
    assertEquals(100, PromotionEngineMain.totalAmount);
  }

  @Test
   void scenarioBtest7() {
    String userInput = "3" + System.getProperty("line.separator") + "1-A"
        + System.getProperty("line.separator") + "1-B" + System.getProperty("line.separator") + "1-D"
        + System.getProperty("line.separator");
    InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
    System.setIn(inputStream);
    PromotionEngineMain.main(null);
    assertEquals(95, PromotionEngineMain.totalAmount);
  }

  @Test
   void scenarioBtest8() {
    String userInput = "1" + System.getProperty("line.separator") + "3-A"
        + System.getProperty("line.separator");
    InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
    System.setIn(inputStream);
    PromotionEngineMain.main(null);
    assertEquals(130, PromotionEngineMain.totalAmount);
  }

  @Test
   void scenarioBtest9() {
    String userInput = "1" + System.getProperty("line.separator") + "2-B"
        + System.getProperty("line.separator");
    InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
    System.setIn(inputStream);
    PromotionEngineMain.main(null);
    assertEquals(45, PromotionEngineMain.totalAmount);
  }
}
