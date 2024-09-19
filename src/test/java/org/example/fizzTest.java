package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class fizzTest {
    @Test
    public void testFizz() {
        assertEquals("1", fizzbuzz.fizzBuzz(1));
        assertEquals("2", fizzbuzz.fizzBuzz(2));
        assertEquals("3", fizzbuzz.fizzBuzz(3));
        assertEquals("fizz", fizzbuzz.fizzBuzz(5));
        assertEquals("buzz", fizzbuzz.fizzBuzz(7));
        assertEquals("fizzbuzz", fizzbuzz.fizzBuzz(35));
    }
}