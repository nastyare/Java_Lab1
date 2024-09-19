package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class quadraticTest {
    @Test
    void testTwoRealRoots() {
        double a = 1;
        double b = -5;
        double c = 6;

        double discriminant = b * b - 4 * a * c;
        assertTrue(discriminant > 0, "Дискриминант должен быть положительным");

        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        assertEquals(3.0, root1, 0.001, "Первый корень должен быть 3");
        assertEquals(2.0, root2, 0.001, "Второй корень должен быть 2");
    }

    @Test
    void testOneRealRoot() {
        double a = 1;
        double b = -4;
        double c = 4;

        double discriminant = b * b - 4 * a * c;
        assertTrue(discriminant == 0, "Дискриминант должен быть равен нулю");

        double root = -b / (2 * a);

        assertEquals(2.0, root, 0.001, "Корень должен быть 2");
    }

    @Test
    void testNoRealRoots() {
        double a = 1;
        double b = 1;
        double c = 1;

        double discriminant = b * b - 4 * a * c;
        assertTrue(discriminant < 0, "Дискриминант должен быть отрицательным");
    }

    @Test
    void testNegativeDiscriminant() {
        double a = 1;
        double b = 2;
        double c = 5;

        double discriminant = b * b - 4 * a * c;
        assertTrue(discriminant < 0, "Дискриминант должен быть отрицательным");
    }
}
