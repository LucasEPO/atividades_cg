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
public class Vec4Test {
    
    public Vec4Test() {
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
     * Test of toString method, of class Vec4.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vec4 instance = new Vec4();
         String expResult = "0.0 0.0 0.0 0.0";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class Vec4.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int i = 0;
        Vec4 instance = new Vec4();
        double expResult = 0.0;
        double result = instance.get(i);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of set method, of class Vec4.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int i = 0;
        double value = 2.0;
        Vec4 instance = new Vec4();
        instance.set(i, value);
        assertEquals(instance.x(), value, 0.0);
    }

    /**
     * Test of x method, of class Vec4.
     */
    @Test
    public void testX() {
        System.out.println("x");
        Vec4 instance = new Vec4();
        double expResult = 0.0;
        double result = instance.x();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of y method, of class Vec4.
     */
    @Test
    public void testY() {
        System.out.println("y");
        Vec4 instance = new Vec4();
        double expResult = 0.0;
        double result = instance.y();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of z method, of class Vec4.
     */
    @Test
    public void testZ() {
        System.out.println("z");
        Vec4 instance = new Vec4();
        double expResult = 0.0;
        double result = instance.z();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of a method, of class Vec4.
     */
    @Test
    public void testA() {
        System.out.println("a");
        Vec4 instance = new Vec4();
        double expResult = 0.0;
        double result = instance.a();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of negate method, of class Vec4.
     */
    @Test
    public void testNegate() {
        System.out.println("negate");
        Vec4 instance = new Vec4(1, 2, 3, 4);
        Vec4 expResult = new Vec4(-1, -2, -3, -4);
        Vec4 result = instance.negate();
        double[] arrayExpResult = {expResult.get(0), expResult.get(1), expResult.get(2), expResult.get(3) };
        double[] arrayResult = {result.get(0), result.get(1), result.get(2), result.get(3)};
        assertArrayEquals(arrayExpResult, arrayResult, 0.0);
    }

    /**
     * Test of add method, of class Vec4.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Vec4 v = new Vec4(1, 1, 1, 1);
        Vec4 instance = new Vec4(1, 2, 3, 4);
        Vec4 expResult = new Vec4(2.0, 3.0, 4.0, 5.0);
        Vec4 result = instance.add(v);
        double[] arrayExpResult = {expResult.get(0), expResult.get(1), expResult.get(2), expResult.get(3)};
        double[] arrayResult = {result.get(0), result.get(1), result.get(2), result.get(3)};
        assertArrayEquals(arrayExpResult, arrayResult, 0.0);
    }

    /**
     * Test of subtract method, of class Vec4.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        Vec4 v = new Vec4(1, 1, 1, 1);
        Vec4 instance = new Vec4(1, 2, 3, 4);
        Vec4 expResult = new Vec4(0.0, 1.0, 2.0, 3.0);
        Vec4 result = instance.subtract(v);
        double[] arrayExpResult = {expResult.get(0), expResult.get(1), expResult.get(2), expResult.get(3) };
        double[] arrayResult = {result.get(0), result.get(1), result.get(2), result.get(3)};
        assertArrayEquals(arrayExpResult, arrayResult, 0.0);
    }

    /**
     * Test of multiply method, of class Vec4.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        double t = 2.0;
        Vec4 instance = new Vec4(1, 2, 3, 4);
        Vec4 expResult = new Vec4(2.0, 4.0, 6.0, 8.0);
        Vec4 result = instance.multiply(t);
        double[] arrayExpResult = {expResult.get(0), expResult.get(1), expResult.get(2), expResult.get(3) };
        double[] arrayResult = {result.get(0), result.get(1), result.get(2), result.get(3)};
        assertArrayEquals(arrayExpResult, arrayResult, 0.0);
    }

    /**
     * Test of divide method, of class Vec4.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        double t = 2.0;
        Vec4 instance = new Vec4(2, 4, 6, 8);
        Vec4 expResult = new Vec4(1.0, 2.0, 3.0, 4.0);
        Vec4 result = instance.divide(t);
        double[] arrayExpResult = {expResult.get(0), expResult.get(1), expResult.get(2), expResult.get(3) };
        double[] arrayResult = {result.get(0), result.get(1), result.get(2), result.get(3)};
        assertArrayEquals(arrayExpResult, arrayResult, 0.0);
    }

    /**
     * Test of length method, of class Vec4.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        Vec4 instance = new Vec4(2, 2, 2, 2);
        double expResult = 4.0;
        double result = instance.length();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of lengthSquared method, of class Vec4.
     */
    @Test
    public void testLengthSquared() {
        System.out.println("lengthSquared");
        Vec4 instance = new Vec4(2, 2, 2, 2);
        double expResult = 16.0;
        double result = instance.lengthSquared();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of dot method, of class Vec4.
     */
    @Test
    public void testDot() {
        System.out.println("dot");
        Vec4 u = new Vec4(1, 1, 1, 1);
        Vec4 v = new Vec4(2, 2, 2, 2);
        double expResult = 8.0;
        double result = Vec4.dot(u, v);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of unitVector method, of class Vec4.
     */
    @Test
    public void testUnitVector() {
        System.out.println("unitVector");
        Vec4 instance = new Vec4(2, 2, 2, 2);
        Vec4 expResult = new Vec4(0.5, 0.5, 0.5, 0.5);
        Vec4 result = instance.unitVector();
        double[] arrayExpResult = {expResult.get(0), expResult.get(1), expResult.get(2), expResult.get(3) };
        double[] arrayResult = {result.get(0), result.get(1), result.get(2), result.get(3)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }
    
}
