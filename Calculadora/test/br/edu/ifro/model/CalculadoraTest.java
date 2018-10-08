/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 04381210239
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Calculadora.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Calculadora instance = new Calculadora();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Calculadora.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Calculadora instance = new Calculadora();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNum1 method, of class Calculadora.
     */
    @Test
    public void testGetNum1() {
        System.out.println("getNum1");
        Calculadora instance = new Calculadora();
        Integer expResult = null;
        Integer result = instance.getNum1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNum1 method, of class Calculadora.
     */
    @Test
    public void testSetNum1() {
        System.out.println("setNum1");
        Integer num1 = null;
        Calculadora instance = new Calculadora();
        instance.setNum1(num1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNum2 method, of class Calculadora.
     */
    @Test
    public void testGetNum2() {
        System.out.println("getNum2");
        Calculadora instance = new Calculadora();
        Integer expResult = null;
        Integer result = instance.getNum2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNum2 method, of class Calculadora.
     */
    @Test
    public void testSetNum2() {
        System.out.println("setNum2");
        Integer num2 = null;
        Calculadora instance = new Calculadora();
        instance.setNum2(num2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResultado method, of class Calculadora.
     */
    @Test
    public void testGetResultado() {
        System.out.println("getResultado");
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.getResultado();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResultado method, of class Calculadora.
     */
    @Test
    public void testSetResultado() {
        System.out.println("setResultado");
        double resultado = 0.0;
        Calculadora instance = new Calculadora();
        instance.setResultado(resultado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
