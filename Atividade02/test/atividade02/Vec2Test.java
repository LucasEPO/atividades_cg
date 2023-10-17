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
public class Vec2Test {
    
    public Vec2Test() {
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
     * Test of toString method, of class Vec2.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vec2 instance = new Vec2();
        String expResult = "0.0 0.0";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class Vec2.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int i = 0;
        Vec2 instance = new Vec2();
        double expResult = 0.0;
        double result = instance.get(i);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of set method, of class Vec2.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int i = 0;
        double value = 2.0;
        Vec2 instance = new Vec2();
        instance.set(i, value);
        assertEquals(instance.x(), value, 0);
    }

    /**
     * Test of x method, of class Vec2.
     */
    @Test
    public void testX() {
        System.out.println("x");
        Vec2 instance = new Vec2();
        double expResult = 0.0;
        double result = instance.x();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of y method, of class Vec2.
     */
    @Test
    public void testY() {
        System.out.println("y");
        Vec2 instance = new Vec2();
        double expResult = 0.0;
        double result = instance.y();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of negate method, of class Vec2.
     */
    @Test
    public void testNegate() {
        System.out.println("negate");
        Vec2 instance = new Vec2(1, 2);
        Vec2 expResult = new Vec2(-1, -2);
        Vec2 result = instance.negate();
        double[] arrayExpResult = {expResult.get(0), expResult.get(1)};
        double[] arrayResult = {result.get(0), result.get(1)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of add method, of class Vec2.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Vec2 v = new Vec2(1, 1);
        Vec2 instance = new Vec2(2, 3);
        Vec2 expResult = new Vec2(3, 4);
        Vec2 result = instance.add(v);
        double[] arrayExpResult = {expResult.get(0), expResult.get(1)};
        double[] arrayResult = {result.get(0), result.get(1)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of subtract method, of class Vec2.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        Vec2 v = new Vec2(1, 1);
        Vec2 instance = new Vec2(2, 3);
        Vec2 expResult = new Vec2(1, 2);
        Vec2 result = instance.subtract(v);
        double[] arrayExpResult = {expResult.get(0), expResult.get(1)};
        double[] arrayResult = {result.get(0), result.get(1)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of multiply method, of class Vec2.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        double t = 2.0;
        Vec2 instance = new Vec2(1, 2);
        Vec2 expResult = new Vec2(2, 4);
        Vec2 result = instance.multiply(t);
        double[] arrayExpResult = {expResult.get(0), expResult.get(1)};
        double[] arrayResult = {result.get(0), result.get(1)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of divide method, of class Vec2.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        double t = 2.0;
        Vec2 instance = new Vec2(2, 4);
        Vec2 expResult = new Vec2(1, 2);
        Vec2 result = instance.divide(t);
        double[] arrayExpResult = {expResult.get(0), expResult.get(1)};
        double[] arrayResult = {result.get(0), result.get(1)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of length method, of class Vec2.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        Vec2 instance = new Vec2(3, 4);
        double expResult = 5.0;
        double result = instance.length();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of lengthSquared method, of class Vec2.
     */
    @Test
    public void testLengthSquared() {
        System.out.println("lengthSquared");
        Vec2 instance = new Vec2(3, 4);
        double expResult = 25.0;
        double result = instance.lengthSquared();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of dot method, of class Vec2.
     */
    @Test
    public void testDot() {
        System.out.println("dot");
        Vec2 u = new Vec2(1, 2);
        Vec2 v = new Vec2(1, 2);
        double expResult = 5.0;
        double result = Vec2.dot(u, v);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of unitVector method, of class Vec2.
     */
    @Test
    public void testUnitVector() {
        System.out.println("unitVector");
        Vec2 instance = new Vec2(3, 4);
        Vec2 expResult = new Vec2(0.6, 0.8);
        Vec2 result = instance.unitVector();
        double[] arrayExpResult = {expResult.get(0), expResult.get(1)};
        double[] arrayResult = {result.get(0), result.get(1)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }
    
}
