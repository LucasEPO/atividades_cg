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
public class Mat4Test {
    
    public Mat4Test() {
        double[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Vec4 v1 = new Vec4(1, 2, 3, 4);
        Vec4 v2 = new Vec4(5, 6, 7, 8);
        Vec4 v3 = new Vec4(9, 10, 11, 12);
        Vec4 v4 = new Vec4(13, 14, 15, 16);
        Mat4 m = new Mat4();
        Mat4 m1= new Mat4(v);
        Mat4 m2= new Mat4(v1, v2, v3, v4);
        
        Mat4 expResult = new Mat4(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Mat4 expResult1 = new Mat4(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0, 0, 0);
        Mat4 expResult2 = new Mat4(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        
        double[] arrayExpResult = {
            expResult.get(0,0), expResult.get(0,1), expResult.get(0,2), expResult.get(0,3), 
            expResult.get(1,0), expResult.get(1,1), expResult.get(1,2), expResult.get(1,3), 
            expResult.get(2,0), expResult.get(2,1), expResult.get(2,2), expResult.get(2,3), 
            expResult.get(3,0), expResult.get(3,1), expResult.get(3,2), expResult.get(3,3)
        };
        double[] arrayResult = {
            m.get(0,0), m.get(0,1), m.get(0,2), m.get(0,3), 
            m.get(1,0), m.get(1,1), m.get(1,2), m.get(1,3), 
            m.get(2,0), m.get(2,1), m.get(2,2), m.get(2,3), 
            m.get(3,0), m.get(3,1), m.get(3,2), m.get(3,3)
        };
        assertArrayEquals(arrayExpResult, arrayResult, 0);
        
        double[] arrayExpResult1 = {
            expResult1.get(0,0), expResult1.get(0,1), expResult1.get(0,2), expResult1.get(0,3), 
            expResult1.get(1,0), expResult1.get(1,1), expResult1.get(1,2), expResult1.get(1,3), 
            expResult1.get(2,0), expResult1.get(2,1), expResult1.get(2,2), expResult1.get(2,3), 
            expResult1.get(3,0), expResult1.get(3,1), expResult1.get(3,2), expResult1.get(3,3)
        };
        double[] arrayResult1 = {
            m1.get(0,0), m1.get(0,1), m1.get(0,2), m1.get(0,3), 
            m1.get(1,0), m1.get(1,1), m1.get(1,2), m1.get(1,3), 
            m1.get(2,0), m1.get(2,1), m1.get(2,2), m1.get(2,3), 
            m1.get(3,0), m1.get(3,1), m1.get(3,2), m1.get(3,3)
        };
        assertArrayEquals(arrayExpResult1, arrayResult1, 0);
        
        double[] arrayExpResult2 = {
            expResult2.get(0,0), expResult2.get(0,1), expResult2.get(0,2), expResult2.get(0,3), 
            expResult2.get(1,0), expResult2.get(1,1), expResult2.get(1,2), expResult2.get(1,3), 
            expResult2.get(2,0), expResult2.get(2,1), expResult2.get(2,2), expResult2.get(2,3), 
            expResult2.get(3,0), expResult2.get(3,1), expResult2.get(3,2), expResult2.get(3,3)
        };
        double[] arrayResult2 = {
            m2.get(0,0), m2.get(0,1), m2.get(0,2), m2.get(0,3), 
            m2.get(1,0), m2.get(1,1), m2.get(1,2), m2.get(1,3), 
            m2.get(2,0), m2.get(2,1), m2.get(2,2), m2.get(2,3), 
            m2.get(3,0), m2.get(3,1), m2.get(3,2), m2.get(3,3)
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
     * Test of toString method, of class Mat4.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Mat4 instance = new Mat4();
        String expResult = "0.0 0.0 0.0 0.0\n0.0 0.0 0.0 0.0\n0.0 0.0 0.0 0.0\n0.0 0.0 0.0 0.0";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class Mat4.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int lin = 0;
        int col = 0;
        Mat4 instance = new Mat4();
        double expResult = 0.0;
        double result = instance.get(lin, col);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of set method, of class Mat4.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int lin = 0;
        int col = 0;
        double value = 3.0;
        Mat4 instance = new Mat4();
        instance.set(lin, col, value);
        assertEquals(instance.get(lin, col), value, 0.0);
    }

    /**
     * Test of negate method, of class Mat4.
     */
    @Test
    public void testNegate() {
        System.out.println("negate");
        Mat4 instance = new Mat4(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        Mat4 expResult = new Mat4(-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15, -16);
        Mat4 result = instance.negate();
        double[] arrayExpResult = {
            expResult.get(0,0), expResult.get(0,1), expResult.get(0,2), expResult.get(0,3), 
            expResult.get(1,0), expResult.get(1,1), expResult.get(1,2), expResult.get(1,3), 
            expResult.get(2,0), expResult.get(2,1), expResult.get(2,2), expResult.get(2,3), 
            expResult.get(3,0), expResult.get(3,1), expResult.get(3,2), expResult.get(3,3)
        };
        double[] arrayResult = {
            result.get(0,0), result.get(0,1), result.get(0,2), result.get(0,3), 
            result.get(1,0), result.get(1,1), result.get(1,2), result.get(1,3), 
            result.get(2,0), result.get(2,1), result.get(2,2), result.get(2,3), 
            result.get(3,0), result.get(3,1), result.get(3,2), result.get(3,3)
        };
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of add method, of class Mat4.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Mat4 m = new Mat4(16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        Mat4 instance = new Mat4(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        Mat4 expResult = new Mat4(17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17);
        Mat4 result = instance.add(m);
        double[] arrayExpResult = {
            expResult.get(0,0), expResult.get(0,1), expResult.get(0,2), expResult.get(0,3), 
            expResult.get(1,0), expResult.get(1,1), expResult.get(1,2), expResult.get(1,3), 
            expResult.get(2,0), expResult.get(2,1), expResult.get(2,2), expResult.get(2,3), 
            expResult.get(3,0), expResult.get(3,1), expResult.get(3,2), expResult.get(3,3)
        };
        double[] arrayResult = {
            result.get(0,0), result.get(0,1), result.get(0,2), result.get(0,3), 
            result.get(1,0), result.get(1,1), result.get(1,2), result.get(1,3), 
            result.get(2,0), result.get(2,1), result.get(2,2), result.get(2,3), 
            result.get(3,0), result.get(3,1), result.get(3,2), result.get(3,3)
        };
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of subtract method, of class Mat4.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        Mat4 m = new Mat4(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        Mat4 instance = new Mat4(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        Mat4 expResult = new Mat4(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Mat4 result = instance.subtract(m);
        double[] arrayExpResult = {
            expResult.get(0,0), expResult.get(0,1), expResult.get(0,2), expResult.get(0,3), 
            expResult.get(1,0), expResult.get(1,1), expResult.get(1,2), expResult.get(1,3), 
            expResult.get(2,0), expResult.get(2,1), expResult.get(2,2), expResult.get(2,3), 
            expResult.get(3,0), expResult.get(3,1), expResult.get(3,2), expResult.get(3,3)
        };
        double[] arrayResult = {
            result.get(0,0), result.get(0,1), result.get(0,2), result.get(0,3), 
            result.get(1,0), result.get(1,1), result.get(1,2), result.get(1,3), 
            result.get(2,0), result.get(2,1), result.get(2,2), result.get(2,3), 
            result.get(3,0), result.get(3,1), result.get(3,2), result.get(3,3)
        };
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of multiply method, of class Mat4.
     */
    @Test
    public void testMultiply_double() {
        System.out.println("multiply");
        double t = 2.0;
        Mat4 instance = new Mat4(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        Mat4 expResult = new Mat4(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32);
        Mat4 result = instance.multiply(t);
        double[] arrayExpResult = {
            expResult.get(0,0), expResult.get(0,1), expResult.get(0,2), expResult.get(0,3), 
            expResult.get(1,0), expResult.get(1,1), expResult.get(1,2), expResult.get(1,3), 
            expResult.get(2,0), expResult.get(2,1), expResult.get(2,2), expResult.get(2,3), 
            expResult.get(3,0), expResult.get(3,1), expResult.get(3,2), expResult.get(3,3)
        };
        double[] arrayResult = {
            result.get(0,0), result.get(0,1), result.get(0,2), result.get(0,3), 
            result.get(1,0), result.get(1,1), result.get(1,2), result.get(1,3), 
            result.get(2,0), result.get(2,1), result.get(2,2), result.get(2,3), 
            result.get(3,0), result.get(3,1), result.get(3,2), result.get(3,3)
        };
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of multiply method, of class Mat4.
     */
    @Test
    public void testMultiply_Mat4() {
        System.out.println("multiply");
        Mat4 m = new Mat4(1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4);
        Mat4 instance = new Mat4(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        Mat4 expResult = new Mat4 (10, 20, 30, 40, 26, 52, 78, 104, 42, 84, 126, 168, 58, 116, 174, 232);
        Mat4 result = instance.multiply(m);
        double[] arrayExpResult = {
            expResult.get(0,0), expResult.get(0,1), expResult.get(0,2), expResult.get(0,3), 
            expResult.get(1,0), expResult.get(1,1), expResult.get(1,2), expResult.get(1,3), 
            expResult.get(2,0), expResult.get(2,1), expResult.get(2,2), expResult.get(2,3), 
            expResult.get(3,0), expResult.get(3,1), expResult.get(3,2), expResult.get(3,3)
        };
        double[] arrayResult = {
            result.get(0,0), result.get(0,1), result.get(0,2), result.get(0,3), 
            result.get(1,0), result.get(1,1), result.get(1,2), result.get(1,3), 
            result.get(2,0), result.get(2,1), result.get(2,2), result.get(2,3), 
            result.get(3,0), result.get(3,1), result.get(3,2), result.get(3,3)
        };
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of divide method, of class Mat4.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        double t = 2.0;
        Mat4 instance = new Mat4(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32);
        Mat4 expResult = new Mat4(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        Mat4 result = instance.divide(t);
        double[] arrayExpResult = {
            expResult.get(0,0), expResult.get(0,1), expResult.get(0,2), expResult.get(0,3), 
            expResult.get(1,0), expResult.get(1,1), expResult.get(1,2), expResult.get(1,3), 
            expResult.get(2,0), expResult.get(2,1), expResult.get(2,2), expResult.get(2,3), 
            expResult.get(3,0), expResult.get(3,1), expResult.get(3,2), expResult.get(3,3)
        };
        double[] arrayResult = {
            result.get(0,0), result.get(0,1), result.get(0,2), result.get(0,3), 
            result.get(1,0), result.get(1,1), result.get(1,2), result.get(1,3), 
            result.get(2,0), result.get(2,1), result.get(2,2), result.get(2,3), 
            result.get(3,0), result.get(3,1), result.get(3,2), result.get(3,3)
        };
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }

    /**
     * Test of determinant method, of class Mat4.
     */
    @Test
    public void testDeterminant() {
        System.out.println("determinant");
        Mat4 instance = new Mat4(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        double expResult = 0.0;
        double result = instance.determinant();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of inverse method, of class Mat4.
     */
    @Test
    public void testInverse() {
        System.out.println("inverse");
        Mat4 instance = new Mat4(-2, 1, 2, 1, 0, 0, 1, 0, -3, 2, 1, 1, -1, 2, 1, 0);
        Mat4 expResult = new Mat4(2, -3, -2, 1, 1, -2, -1, 1, 0, 1, 0, 0, 4, -6, -3, 1);
        Mat4 result = instance.inverse();
        double[] arrayExpResult = {
            expResult.get(0,0), expResult.get(0,1), expResult.get(0,2), expResult.get(0,3), 
            expResult.get(1,0), expResult.get(1,1), expResult.get(1,2), expResult.get(1,3), 
            expResult.get(2,0), expResult.get(2,1), expResult.get(2,2), expResult.get(2,3), 
            expResult.get(3,0), expResult.get(3,1), expResult.get(3,2), expResult.get(3,3)
        };
        double[] arrayResult = {
            result.get(0,0), result.get(0,1), result.get(0,2), result.get(0,3), 
            result.get(1,0), result.get(1,1), result.get(1,2), result.get(1,3), 
            result.get(2,0), result.get(2,1), result.get(2,2), result.get(2,3), 
            result.get(3,0), result.get(3,1), result.get(3,2), result.get(3,3)
        };
        assertArrayEquals(arrayExpResult, arrayResult, 0);
    }
    
}
