package com.zacanbrcom.service;

import com.zacanbrcom.core.MathOp;

public class MathService {
  public int invokeAdd(int number1, int number2) {
    System.out.println("Start add service..");
    return MathOp.sum(number1, number2);
  }
}
