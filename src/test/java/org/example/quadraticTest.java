package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class quadraticTest {
    @Test
    public void testTwoRoots() {
        Pair result = quadratic.findRoots(1, -3, 2);
        assertEquals(2.0, result.first);
        assertEquals(1.0, result.second);
    }

    @Test
    public void testOneRoot() {
        Pair result = quadratic.findRoots(1, -2, 1);
        assertEquals(1.0, result.first);
        assertEquals(null, result.second);
    }

    @Test
    public void testNoRoots() {
        Pair result = quadratic.findRoots(1, 1, 1);
        assertEquals(null, result.first);
        assertEquals(null, result.second);
    }

    @Test
    public void testNegativeDiscriminant() {
        Pair result = quadratic.findRoots(1, 2, 5);
        assertEquals(null, result.first);
        assertEquals(null, result.second);
    }
}
