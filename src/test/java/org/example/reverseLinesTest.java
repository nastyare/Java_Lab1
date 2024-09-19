package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class reverseLinesTest {
    @Test
    public void testBackwardWord() {
        assertEquals("tset", reverseLines.reversing("test"));
        assertEquals("a", reverseLines.reversing("a"));
        assertEquals("", reverseLines.reversing(""));
        assertEquals("!dlroW ,olleH", reverseLines.reversing("Hello, World!"));
    }
}
