/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.alcreta.test;

import net.alcreta.clases.palindromo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alvaro
 */
public class palindromoTest {
    
    public palindromoTest() {
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

    @Test
    public void testGetPalindromo() {
        System.out.println("test: getPalindromo");
        palindromo oPalindromo = new palindromo();
        assertNotNull("objeto palindromo creado", oPalindromo);
        assertEquals("getPalindromo: devuelve un palindromo", oPalindromo.getPalindromo("arenera"), "arenera");
        assertTrue("getPalindromo: devuelve un palindromo", "arenera".equals(oPalindromo.getPalindromo("arenera")));
        if (!oPalindromo.getPalindromo("arenera").equals("arenera")) {
            fail("getPalindromo: palindromo no iguales");
        }
        assertSame("prueba getReference", oPalindromo, oPalindromo.getReference());
        palindromo oPalindromo2 = new palindromo();
        assertNotSame("no son el mismo objeto", oPalindromo, oPalindromo2);
    }
}
