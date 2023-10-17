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
public class Vec3Test {
    
    public Vec3Test() {
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
     * Test of toString method, of class Vec3.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vec3 instance = new Vec3();
        String expResult = "0.0 0.0 0.0";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class Vec3.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int i = 0;
        Vec3 instance = new Vec3();
        double expResult = 0.0;
        double result = instance.get(i);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of set method, of class Vec3.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int i = 0;
        double value = 2.0;
        Vec3 instance = new Vec3();
        instance.set(i, value);
        assertEquals(instance.x(), value, 0.0);
    }

    /**
     * Test of x method, of class Vec3.
     */
    @Test
    public void testX() {
        System.out.println("x");
        Vec3 instance = new Vec3();
        double expResult = 0.0;
        double result = instance.x();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of y method, of class Vec3.
     */
    @Test
    public void testY() {
        System.out.println("y");
        Vec3 instance = new Vec3();
        double expResult = 0.0;
        double result = instance.y();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of z method, of class Vec3.
     */
    @Test
    public void testZ() {
        System.out.println("z");
        Vec3 instance = new Vec3();
        double expResult = 0.0;
        double result = instance.z();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of negate method, of class Vec3.
     */
    @Test
    public void testNegate() {
        System.out.println("negate");
        Vec3 instance = new Vec3(1, 2, 3);
        Vec3 expResult = new Vec3(-1, -2, -3);
        Vec3 result = instance.negate();
        double[] arrayExpResult = {expResult.get(0), expResult.get(1), expResult.get(2) };
        double[] arrayResult = {result.get(0), result.get(1), result.get(2)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of add method, of class Vec3.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Vec3 v = new Vec3(1, 1, 1);
        Vec3 instance = new Vec3(1, 2, 3);
        Vec3 expResult = new Vec3(2.0, 3.0, 4.0);
        Vec3 result = instance.add(v);
        double[] arrayExpResult = {expResult.get(0), expResult.get(1), expResult.get(2) };
        double[] arrayResult = {result.get(0), result.get(1), result.get(2)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of subtract method, of class Vec3.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        Vec3 v = new Vec3(1, 1, 1);
        Vec3 instance = new Vec3(1, 2, 3);
        Vec3 expResult = new Vec3(0, 1, 2);
        Vec3 result = instance.subtract(v);
        double[] arrayExpResult = {expResult.get(0), expResult.get(1), expResult.get(2) };
        double[] arrayResult = {result.get(0), result.get(1), result.get(2)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of multiply method, of class Vec3.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        double t = 2.0;
        Vec3 instance = new Vec3(1, 2, 3);
        Vec3 expResult = new Vec3(2, 4, 6);
        Vec3 result = instance.multiply(t);
        double[] arrayExpResult = {expResult.get(0), expResult.get(1), expResult.get(2) };
        double[] arrayResult = {result.get(0), result.get(1), result.get(2)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of divide method, of class Vec3.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        double t = 2.0;
        Vec3 instance = new Vec3(2, 4, 6);
        Vec3 expResult = new Vec3(1, 2, 3);
        Vec3 result = instance.divide(t);
        double[] arrayExpResult = {expResult.get(0), expResult.get(1), expResult.get(2) };
        double[] arrayResult = {result.get(0), result.get(1), result.get(2)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of length method, of class Vec3.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        Vec3 instance = new Vec3(2, 2, 1);
        double expResult = 3.0;
        double result = instance.length();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of lengthSquared method, of class Vec3.
     */
    @Test
    public void testLengthSquared() {
        System.out.println("lengthSquared");
        Vec3 instance = new Vec3(2, 2, 1);
        double expResult = 9.0;
        double result = instance.lengthSquared();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of dot method, of class Vec3.
     */
    @Test
    public void testDot() {
        System.out.println("dot");
        Vec3 u = new Vec3(1, 1, 1);
        Vec3 v = new Vec3(2, 2, 2);
        double expResult = 6.0;
        double result = Vec3.dot(u, v);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of cross method, of class Vec3.
     */
    @Test
    public void testCross() {
        System.out.println("cross");
        Vec3 u = new Vec3(1, 1, 1);
        Vec3 v = new Vec3(2, 2, 2);
        Vec3 expResult = new Vec3(0.0, 0.0, 0.0);
        Vec3 result = Vec3.cross(u, v);
        double[] arrayExpResult = {expResult.get(0), expResult.get(1), expResult.get(2) };
        double[] arrayResult = {result.get(0), result.get(1), result.get(2)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of unitVector method, of class Vec3.
     */
    @Test
    public void testUnitVector() {
        System.out.println("unitVector");
        Vec3 instance = new Vec3(2, 4, 4);
        Vec3 expResult = new Vec3(0.3, 0.6, 0.6);
        Vec3 result = instance.unitVector();
        double[] arrayExpResult = {expResult.get(0), expResult.get(1), expResult.get(2) };
        double[] arrayResult = {result.get(0), result.get(1), result.get(2)};
        assertArrayEquals(arrayExpResult, arrayResult, 0.2);
    }
    
}
