package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class palindromeTest {
    @Test
    public void testPalindromeNormalInput() {
        assertTrue(palindrome.checking("level"));
        assertTrue(palindrome.checking("A man, a plan, a canal — Panama"));
    }

    @Test
    public void testNonPalindromeNormalInput() {
        assertFalse(palindrome.checking("hello"));
        assertFalse(palindrome.checking("bye"));
    }

    @Test
    public void testPalindromeNumbers() {
        assertTrue(palindrome.checking("12321"));
        assertFalse(palindrome.checking("12345"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(palindrome.checking(""));
    }

    @Test
    public void testSingleCharacter() {
        assertTrue(palindrome.checking("a"));
        assertTrue(palindrome.checking("A"));
    }

}
