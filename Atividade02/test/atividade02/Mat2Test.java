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
public class Mat2Test {
    
    public Mat2Test() {
        double[] v = {1, 2};
        Vec2 v1 = new Vec2(1, 2);
        Vec2 v2 = new Vec2(3, 4);
        Mat2 m = new Mat2();
        Mat2 m1= new Mat2(v);
        Mat2 m2= new Mat2(v1, v2);
        
        Mat2 expResult = new Mat2(0, 0, 0, 0);
        Mat2 expResult1 = new Mat2(1, 2, 0, 0);
        Mat2 expResult2 = new Mat2(1, 2, 3, 4);
        
        double[] arrayExpResult = {
            expResult.get(0,0), expResult.get(0,1),
            expResult.get(1,0), expResult.get(1,1),
        };
        double[] arrayResult = {
            m.get(0,0), m.get(0,1),
            m.get(1,0), m.get(1,1),
        };
        assertArrayEquals(arrayExpResult, arrayResult, 0);
        
        double[] arrayExpResult1 = {
            expResult1.get(0,0), expResult1.get(0,1),
            expResult1.get(1,0), expResult1.get(1,1),
        };
        double[] arrayResult1 = {
            m1.get(0,0), m1.get(0,1),
            m1.get(1,0), m1.get(1,1),
        };
        assertArrayEquals(arrayExpResult1, arrayResult1, 0);
        
        double[] arrayExpResult2 = {
            expResult2.get(0,0), expResult2.get(0,1),
            expResult2.get(1,0), expResult2.get(1,1),
        };
        double[] arrayResult2 = {
            m2.get(0,0), m2.get(0,1),
            m2.get(1,0), m2.get(1,1),
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
     * Test of toString method, of class Mat2.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Mat2 instance = new Mat2();
        String expResult = "0.0 0.0\n0.0 0.0";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class Mat2.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int lin = 0;
        int col = 0;
        Mat2 instance = new Mat2();
        double expResult = 0.0;
        double result = instance.get(lin, col);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of set method, of class Mat2.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int lin = 0;
        int col = 0;
        double value = 3.0;
        Mat2 instance = new Mat2();
        instance.set(lin, col, value);
        assertEquals(instance.get(lin, col), value, 0.0);
    }

    /**
     * Test of negate method, of class Mat2.
     */
    @Test
    public void testNegate() {
        System.out.println("negate");
        Mat2 instance = new Mat2(1, 2, 3, 4);
        Mat2 expResult = new Mat2(-1, -2, -3, -4);
        Mat2 result = instance.negate();
        double[] arrayExpResult = {expResult.get(0,0), expResult.get(0,1), expResult.get(1,0), expResult.get(1,1)};
        double[] arrayResult = {result.get(0,0), result.get(0,1), result.get(1,0), result.get(1,1)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of add method, of class Mat2.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Mat2 m = new Mat2(4, 3, 2, 1);
        Mat2 instance = new Mat2(1, 2, 3, 4);
        Mat2 expResult = new Mat2(5, 5, 5, 5);
        Mat2 result = instance.add(m);
        double[] arrayExpResult = {expResult.get(0,0), expResult.get(0,1), expResult.get(1,0), expResult.get(1,1)};
        double[] arrayResult = {result.get(0,0), result.get(0,1), result.get(1,0), result.get(1,1)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of subtract method, of class Mat2.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        Mat2 m = new Mat2(1, 2, 3, 4);
        Mat2 instance = new Mat2(1, 2, 3, 4);
        Mat2 expResult = new Mat2(0, 0, 0, 0);
        Mat2 result = instance.subtract(m);
        double[] arrayExpResult = {expResult.get(0,0), expResult.get(0,1), expResult.get(1,0), expResult.get(1,1)};
        double[] arrayResult = {result.get(0,0), result.get(0,1), result.get(1,0), result.get(1,1)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of multiply method, of class Mat2.
     */
    @Test
    public void testMultiply_double() {
        System.out.println("multiply");
        double t = 2.0;
        Mat2 instance = new Mat2(1, 2, 3, 4);
        Mat2 expResult = new Mat2(2, 4, 6, 8);
        Mat2 result = instance.multiply(t);
        double[] arrayExpResult = {expResult.get(0,0), expResult.get(0,1), expResult.get(1,0), expResult.get(1,1)};
        double[] arrayResult = {result.get(0,0), result.get(0,1), result.get(1,0), result.get(1,1)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of multiply method, of class Mat2.
     */
    @Test
    public void testMultiply_Mat2() {
        System.out.println("multiply");
        Mat2 m = new Mat2(4, 3, 2, 1);
        Mat2 instance = new Mat2(1, 2, 3, 4);
        Mat2 expResult = new Mat2(8, 5, 20, 13);
        Mat2 result = instance.multiply(m);
        double[] arrayExpResult = {expResult.get(0,0), expResult.get(0,1), expResult.get(1,0), expResult.get(1,1)};
        double[] arrayResult = {result.get(0,0), result.get(0,1), result.get(1,0), result.get(1,1)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of divide method, of class Mat2.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        double t = 2.0;
        Mat2 instance = new Mat2(2, 4, 6, 8);
        Mat2 expResult = new Mat2(1, 2, 3, 4);
        Mat2 result = instance.divide(t);
        double[] arrayExpResult = {expResult.get(0,0), expResult.get(0,1), expResult.get(1,0), expResult.get(1,1)};
        double[] arrayResult = {result.get(0,0), result.get(0,1), result.get(1,0), result.get(1,1)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of determinant method, of class Mat2.
     */
    @Test
    public void testDeterminant() {
        System.out.println("determinant");
        Mat2 instance = new Mat2(1, 2, 3, 4);
        double expResult = -2.0;
        double result = instance.determinant();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of inverse method, of class Mat2.
     */
    @Test
    public void testInverse() {
        System.out.println("inverse");
        Mat2 instance = new Mat2(1, 1, 1, 2);
        Mat2 expResult = new Mat2(2, -1, -1, 1);
        Mat2 result = instance.inverse();
        double[] arrayExpResult = {expResult.get(0,0), expResult.get(0,1), expResult.get(1,0), expResult.get(1,1)};
        double[] arrayResult = {result.get(0,0), result.get(0,1), result.get(1,0), result.get(1,1)};
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }
    
}
