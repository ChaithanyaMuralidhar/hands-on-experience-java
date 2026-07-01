package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mockito;

public class Mocking {

    @Test
    public void testMockingAndStubbing() {

        // Create a mock object
        Calculator calculator = Mockito.mock(Calculator.class);

        // Stub the method
        Mockito.when(calculator.add(10, 20)).thenReturn(30);

        // Verify the result
        assertEquals(30, calculator.add(10, 20));
    }
}