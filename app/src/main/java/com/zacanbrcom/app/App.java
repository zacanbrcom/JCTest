package com.zacanbrcom.app;

import com.zacanbrcom.service.MathService;

public class App {
  public static void main(String[] args) {
    int result = generateExample();
    System.out.println("The result is: " + result);
  }

  static int generateExample() {
    System.out.println("Start main program..");
    System.out.println("Create the math service..");
    MathService mathService = new MathService();
    // int value1 = new Random().nextInt() & Integer.MAX_VALUE;
    // int value2 = new Random().nextInt() & Integer.MAX_VALUE;

    System.out.println(String.format("Sum of two number %d and %d", 1, 1));
    return mathService.invokeAdd(1, 1);
  }
}
