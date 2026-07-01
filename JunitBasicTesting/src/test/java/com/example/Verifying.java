package com.example;

import org.junit.Test;
import org.mockito.Mockito;

public class Verifying {

    @Test
    public void testVerifyInteraction() {

        // Create a mock object
        Calculator calculator = Mockito.mock(Calculator.class);

        // Call the mocked method
        calculator.add(10, 20);

        // Verify that the method was called once
        Mockito.verify(calculator).add(10, 20);
    }
}