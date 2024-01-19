package atividade03;

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
public class IOObjTest {
    
    public IOObjTest() {
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
     * Test of readObj method, of class IOObj.
     */
    @Test
    public void testReadObj() {
        System.out.println("readObj");
        String objPath = "src/atividade03/assets/girlOBJ.obj";
        IOObj instance = new IOObj();
        instance.readObj(objPath);
    }

    /**
     * Test of toString method, of class IOObj.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        IOObj instance = new IOObj();
        instance.readObj("src/atividade03/assets/girlOBJ.obj");
        String expResult = "Número de vértices: 9417\n" 
                +"Número de normais: 9333\n" 
                +"Número de coordenadas de tuxturas: 10346\n" 
                +"Número de faces: 9110";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
