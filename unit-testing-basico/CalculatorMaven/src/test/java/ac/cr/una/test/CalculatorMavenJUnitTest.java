/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.test;

import ac.cr.una.calculatormaven.Calculator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mguzmana
 */
public class CalculatorMavenJUnitTest {
    
    public CalculatorMavenJUnitTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test the Calculator
     */
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        assertEquals(60, result, 0);
    }
}
