package ru.mirea.task31.test.java.Hello;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import ru.mirea.task31.main.java.Hello.Hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {

    @Test
    void Test1() {
        Hello test1 = new Hello();
        int actual = test1.calc(5);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void Test2() {
        Hello test1 = new Hello();
        int actual = test1.calc(6);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void Test3() {
        Hello test1 = new Hello();
        try {
            int actual = test1.calc(0);
            Assert.fail("Expected ArithmeticExceptio");
        }catch (ArithmeticException e) {
            Assert.assertNotEquals("", e.getMessage());
        }
    }

    @Test
    void Test4() {
        Hello test1 = new Hello();
        int actual = test1.calculate(4);
        int expected = 5;
        assertEquals(expected, actual);
    }
}