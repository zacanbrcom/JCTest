package com.zacanbrcom.core;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MathOpTest {
  @Test
  public void testMathOp() {
    assertEquals(2, MathOp.sum(1, 1));
  }
}
