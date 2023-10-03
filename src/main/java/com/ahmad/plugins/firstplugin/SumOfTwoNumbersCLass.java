package com.ahmad.plugins.firstplugin;


import org.apache.log4j.Logger;

import com.appiancorp.suiteapi.expression.annotations.Function;
import com.appiancorp.suiteapi.expression.annotations.Parameter;

@AhmadFunctionsCategory
public class SumOfTwoNumbersCLass {

  private static final Logger LOG = Logger
    .getLogger(SumOfTwoNumbersCLass.class);

  @Function
  public double sumOfTwoNumbers(
    @Parameter double firstNumber, @Parameter double secondNumber) {
    if (Double.isNaN(firstNumber) || Double.isNaN(secondNumber))
      throw new IllegalArgumentException("Input cannot be null");

    double sum = firstNumber + secondNumber;
    LOG.info("Sum of " + firstNumber + " and " + secondNumber + " is " + sum);

    return sum;
  }
}
