/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class ColorTest {
    
    public ColorTest() {
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
     * Test of writeColorPPM method, of class Color.
     */
    @Test
    public void testWriteColorPPM() {
        System.out.println("writeColorPPM");
        Color instance = new Color();
        String expResult = "0 0 0\n";
        String result = instance.writeColorPPM();
        assertEquals(expResult, result);
    }

    /**
     * Test of writeColorPNG method, of class Color.
     */
    @Test
    public void testWriteColorPNG() {
        System.out.println("writeColorPNG");
        Color instance = new Color();
        int expResult = 0;
        int result = instance.writeColorPNG();
        assertEquals(expResult, result);
    }
    
}
