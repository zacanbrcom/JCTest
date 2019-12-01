package com.zacanbrcom.app;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class AppTest {
  @Test
  public void testMathService() {
    assertTrue(App.generateExample() > 0);
  }
}
