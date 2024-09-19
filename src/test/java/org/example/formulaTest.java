package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class formulaTest {
    @Test
    public void testFindSum() {
        formula calculation = new formula();
        double result = calculation.findSum();

        assertTrue(result > 0);

        assertTrue(result < 1);
    }
}
