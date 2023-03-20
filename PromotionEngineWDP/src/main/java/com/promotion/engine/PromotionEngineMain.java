package com.promotion.engine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PromotionEngineMain implements PromotionDiscount {

  public static int totalAmount = 0;
  private static Map<String, Integer> unitPrice = new HashMap<>();
  private static Map<String, String> promotions = new HashMap<>();
  private static List<String> items = new ArrayList<>();


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

  public static void main(String[] args) {
    init();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of SKUs");

    int total = sc.nextInt();

    System.out.println(
        "Enter the " + total + " input items in -> [item - quantity] format E.g 1-A");
    String[] input = new String[total];
    for (int i = 0; i < total; i++) {
      input[i] = sc.next();
      String quantity = input[i].split("-")[0];
      String item = input[i].split("-")[1];
      for (int j = 0; j < Integer.parseInt(quantity); j++) {
        items.add(item);
      }
    }
    new PromotionEngineMain().calculateDiscount(items);

    System.out.println("Total Amount after discount is : {} "+ totalAmount);
  }

  @Override
  public void calculateDiscount(List<String> items) {
    for (String promo : promotions.keySet()) {
      String split1 = promotions.get(promo).split("-")[0];
      String split2 = promotions.get(promo).split("-")[2];
      if (promo.length() == 1) {
        int count = Collections.frequency(items, promo);
        totalAmount = totalAmount + (count / Integer.parseInt(split1)) * Integer.parseInt(split2);
        totalAmount = totalAmount + (count % Integer.parseInt(split1)) * unitPrice.get(promo);
      } else {
        char[] arr = promo.toCharArray();
        int c1 = Collections.frequency(items, String.valueOf(arr[0]));
        int c2 = Collections.frequency(items, String.valueOf(arr[1]));
        if (c1 >= c2) {
          totalAmount = totalAmount + (c1 - (c1 - c2)) * Integer.parseInt(split2);
          totalAmount = totalAmount + (c1 - c2) * unitPrice.get(String.valueOf(arr[0]));
        } else {
          totalAmount = totalAmount + (c2 - (c2 - c1)) * Integer.parseInt(split2);
          totalAmount = totalAmount + (c2 - c1) * unitPrice.get(String.valueOf(arr[1]));
        }
      }
    }
  }

}
