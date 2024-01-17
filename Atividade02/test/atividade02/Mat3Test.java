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
public class Mat3Test {
    
    public Mat3Test() {
        double[] v = {1, 2, 3};
        Vec3 v1 = new Vec3(1, 2, 3);
        Vec3 v2 = new Vec3(4, 5, 6);
        Vec3 v3 = new Vec3(7, 8, 9);
        Mat3 m = new Mat3();
        Mat3 m1= new Mat3(v);
        Mat3 m2= new Mat3(v1, v2, v3);
        
        Mat3 expResult = new Mat3(0, 0, 0, 0, 0, 0, 0, 0, 0);
        Mat3 expResult1 = new Mat3(1, 2, 3, 0, 0, 0, 0, 0, 0);
        Mat3 expResult2 = new Mat3(1, 2, 3, 4, 5, 6, 7, 8, 9);
        
        double[] arrayExpResult = {
            expResult.get(0,0), expResult.get(0,1), expResult.get(0,2),
            expResult.get(1,0), expResult.get(1,1), expResult.get(1,2),
            expResult.get(2,0), expResult.get(2,1), expResult.get(2,2)
        };
        double[] arrayResult = {
            m.get(0,0), m.get(0,1), m.get(0,2),
            m.get(1,0), m.get(1,1), m.get(1,2),
            m.get(2,0), m.get(2,1), m.get(2,2)
        };
        assertArrayEquals(arrayExpResult, arrayResult, 0);
        
        double[] arrayExpResult1 = {
            expResult1.get(0,0), expResult1.get(0,1), expResult1.get(0,2),
            expResult1.get(1,0), expResult1.get(1,1), expResult1.get(1,2), 
            expResult1.get(2,0), expResult1.get(2,1), expResult1.get(2,2)
        };
        double[] arrayResult1 = {
            m1.get(0,0), m1.get(0,1), m1.get(0,2),
            m1.get(1,0), m1.get(1,1), m1.get(1,2),
            m1.get(2,0), m1.get(2,1), m1.get(2,2),
        };
        assertArrayEquals(arrayExpResult1, arrayResult1, 0);
        
        double[] arrayExpResult2 = {
            expResult2.get(0,0), expResult2.get(0,1), expResult2.get(0,2), 
            expResult2.get(1,0), expResult2.get(1,1), expResult2.get(1,2), 
            expResult2.get(2,0), expResult2.get(2,1), expResult2.get(2,2),
        };
        double[] arrayResult2 = {
            m2.get(0,0), m2.get(0,1), m2.get(0,2),
            m2.get(1,0), m2.get(1,1), m2.get(1,2),
            m2.get(2,0), m2.get(2,1), m2.get(2,2),
        };
        assertArrayEquals(arrayExpResult2, arrayResult2, 0);
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
     * Test of toString method, of class Mat3.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Mat3 instance = new Mat3();
        String expResult = "0.0 0.0 0.0\n0.0 0.0 0.0\n0.0 0.0 0.0";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class Mat3.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int lin = 0;
        int col = 0;
        Mat3 instance = new Mat3();
        double expResult = 0.0;
        double result = instance.get(lin, col);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of set method, of class Mat3.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int lin = 0;
        int col = 0;
        double value = 3.0;
        Mat3 instance = new Mat3();
        instance.set(lin, col, value);
        assertEquals(instance.get(lin, col), value, 0.0);
    }

    /**
     * Test of negate method, of class Mat3.
     */
    @Test
    public void testNegate() {
        System.out.println("negate");
        Mat3 instance = new Mat3(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Mat3 expResult = new Mat3(-1, -2, -3, -4, -5, -6, -7, -8, -9);
        Mat3 result = instance.negate();
        double[] arrayExpResult = {expResult.get(0,0), expResult.get(0,1), expResult.get(0,2), expResult.get(1,0), expResult.get(1,1), expResult.get(1,2), expResult.get(2,0), expResult.get(2,1), expResult.get(2,2)};
        double[] arrayResult = {result.get(0,0), result.get(0,1), result.get(0,2), result.get(1,0), result.get(1,1), result.get(1,2), result.get(2,0), result.get(2,1), result.get(2,2)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of add method, of class Mat3.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Mat3 m = new Mat3(9, 8, 7, 6, 5, 4, 3, 2, 1);
        Mat3 instance = new Mat3(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Mat3 expResult = new Mat3(10, 10, 10, 10, 10, 10, 10, 10, 10);
        Mat3 result = instance.add(m);
        double[] arrayExpResult = {expResult.get(0,0), expResult.get(0,1), expResult.get(0,2), expResult.get(1,0), expResult.get(1,1), expResult.get(1,2), expResult.get(2,0), expResult.get(2,1), expResult.get(2,2)};
        double[] arrayResult = {result.get(0,0), result.get(0,1), result.get(0,2), result.get(1,0), result.get(1,1), result.get(1,2), result.get(2,0), result.get(2,1), result.get(2,2)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of subtract method, of class Mat3.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        Mat3 m = new Mat3(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Mat3 instance = new Mat3(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Mat3 expResult = new Mat3(0, 0, 0, 0, 0, 0, 0, 0, 0);
        Mat3 result = instance.subtract(m);
        double[] arrayExpResult = {expResult.get(0,0), expResult.get(0,1), expResult.get(0,2), expResult.get(1,0), expResult.get(1,1), expResult.get(1,2), expResult.get(2,0), expResult.get(2,1), expResult.get(2,2)};
        double[] arrayResult = {result.get(0,0), result.get(0,1), result.get(0,2), result.get(1,0), result.get(1,1), result.get(1,2), result.get(2,0), result.get(2,1), result.get(2,2)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of multiply method, of class Mat3.
     */
    @Test
    public void testMultiply_double() {
        System.out.println("multiply");
        double t = 2.0;
        Mat3 instance = new Mat3(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Mat3 expResult = new Mat3(2, 4, 6, 8, 10, 12, 14, 16, 18);
        Mat3 result = instance.multiply(t);
        double[] arrayExpResult = {expResult.get(0,0), expResult.get(0,1), expResult.get(0,2), expResult.get(1,0), expResult.get(1,1), expResult.get(1,2), expResult.get(2,0), expResult.get(2,1), expResult.get(2,2)};
        double[] arrayResult = {result.get(0,0), result.get(0,1), result.get(0,2), result.get(1,0), result.get(1,1), result.get(1,2), result.get(2,0), result.get(2,1), result.get(2,2)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of multiply method, of class Mat3.
     */
    @Test
    public void testMultiply_Mat3() {
        System.out.println("multiply");
        Mat3 m = new Mat3(1, 2, 3, 1, 2, 3, 1, 2, 3);
        Mat3 instance = new Mat3(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Mat3 expResult = new Mat3(6, 12, 18, 15, 30, 45, 24, 48, 72);
        Mat3 result = instance.multiply(m);
        double[] arrayExpResult = {expResult.get(0,0), expResult.get(0,1), expResult.get(0,2), expResult.get(1,0), expResult.get(1,1), expResult.get(1,2), expResult.get(2,0), expResult.get(2,1), expResult.get(2,2)};
        double[] arrayResult = {result.get(0,0), result.get(0,1), result.get(0,2), result.get(1,0), result.get(1,1), result.get(1,2), result.get(2,0), result.get(2,1), result.get(2,2)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of divide method, of class Mat3.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        double t = 2.0;
        Mat3 instance = new Mat3(2, 4, 6, 8, 10, 12, 14, 16, 18);
        Mat3 expResult = new Mat3(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Mat3 result = instance.divide(t);
        double[] arrayExpResult = {expResult.get(0,0), expResult.get(0,1), expResult.get(0,2), expResult.get(1,0), expResult.get(1,1), expResult.get(1,2), expResult.get(2,0), expResult.get(2,1), expResult.get(2,2)};
        double[] arrayResult = {result.get(0,0), result.get(0,1), result.get(0,2), result.get(1,0), result.get(1,1), result.get(1,2), result.get(2,0), result.get(2,1), result.get(2,2)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of determinant method, of class Mat3.
     */
    @Test
    public void testDeterminant() {
        System.out.println("determinant");
        Mat3 instance = new Mat3(1, 2, 3, 4, 5, 6, 7, 8, 9);
        double expResult = 0.0;
        double result = instance.determinant();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of inverse method, of class Mat3.
     */
    @Test
    public void testInverse() {
        System.out.println("inverse");
        Mat3 instance = new Mat3(-2, 1, 2, 0, 0, 1, -3, 2, 1);
        Mat3 expResult = new Mat3(-2, 3, 1, -3, 4, 2, 0, 1, 0);
        Mat3 result = instance.inverse();
        double[] arrayExpResult = {expResult.get(0,0), expResult.get(0,1), expResult.get(0,2), expResult.get(1,0), expResult.get(1,1), expResult.get(1,2), expResult.get(2,0), expResult.get(2,1), expResult.get(2,2)};
        double[] arrayResult = {result.get(0,0), result.get(0,1), result.get(0,2), result.get(1,0), result.get(1,1), result.get(1,2), result.get(2,0), result.get(2,1), result.get(2,2)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }
    
}
