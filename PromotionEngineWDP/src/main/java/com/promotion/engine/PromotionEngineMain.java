package com.promotion.engine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PromotionEngineMain implements PromotionDiscount {

  private static Map<String, Integer> unitPrice = new HashMap<>();
  private static Map<String, String> promotions = new HashMap<>();

  private static void init() {

    // Unit price SKU
    unitPrice.put("A", 50);
    unitPrice.put("B", 30);
    unitPrice.put("C", 20);
    unitPrice.put("D", 15);

    // Promotions
    promotions.put("A", "3-A-130");
    promotions.put("B", "2-B-45");
    promotions.put("CD", "1-CD-15");

  }

  @Override
  public void calculateDiscount(List<String> items) {

  }
}
