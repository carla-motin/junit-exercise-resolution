package com.training.tests;

import com.training.main.Example;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExampleTest {

    Example example = new Example();

    @BeforeClass
    public static void setUp() {
        System.out.println("Iniciando os testes");
    }

    @Test
    public void testGetFullName() {
        Assert.assertEquals("Maria Silva", example.getFullName("Maria", "Silva"));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(15, example.multiply(5, 3));
    }

    @Test
    public void testIsGreater() {
        Assert.assertTrue(example.isGreater(5, -1));
        Assert.assertFalse(example.isGreater(50, 51));
    }

}
