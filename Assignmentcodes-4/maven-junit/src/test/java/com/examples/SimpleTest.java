package com.examples;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleTest {

    private static Calculator calculator;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass");
        calculator = new Calculator();
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("@Before");
        calculator.reset();
    }

    @Test
    public void testAddPositiveNumbers() {
        calculator.add(1);
        calculator.add(2);
        assertEquals("Adding 1 and 2 should result in 3", 3, calculator.getTotal());
    }

    @Test
    public void testAddNegativeNumbers() {
        calculator.add(-1);
        calculator.add(-2);
        assertEquals("Adding -1 and -2 should result in -3", -3, calculator.getTotal());
    }

    @Test
    public void testAddZero() {
        calculator.add(0);
        assertEquals("Adding 0 should result in 0", 0, calculator.getTotal());
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("@After");
       
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("@AfterClass");
        calculator = null; // Clean up shared resources.
    }
}
