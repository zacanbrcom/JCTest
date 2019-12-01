package com.zacanbrcom.service;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class MathServiceTest {
  @Test
  public void testInvokeAdd() {
    MathService service = new MathService();
    assertTrue(service.invokeAdd(1, 1) >= 0);
  }
}
