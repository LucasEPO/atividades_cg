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
public class MyImagesTest {
    
    public MyImagesTest() {
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
     * Test of getImageWidth method, of class MyImages.
     */
    @Test
    public void testGetImageWidth() {
        System.out.println("getImageWidth");
        MyImages instance = new MyImages(300, 256, "TestePPM", "ppm");
        int expResult = 300;
        int result = instance.getImageWidth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getImageHeight method, of class MyImages.
     */
    @Test
    public void testGetImageHeight() {
        System.out.println("getImageHeight");
        MyImages instance = new MyImages(300, 256, "TestePPM", "ppm");
        int expResult = 256;
        int result = instance.getImageHeight();
        assertEquals(expResult, result);
    }

    /**
     * Test of getImageName method, of class MyImages.
     */
    @Test
    public void testGetImageName() {
        System.out.println("getImageName");
        MyImages instance = new MyImages(300, 256, "TestePPM", "ppm");
        String expResult = "TestePPM";
        String result = instance.getImageName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getImagefileName method, of class MyImages.
     */
    @Test
    public void testGetImagefileName() {
        System.out.println("getImagefileName");
        MyImages instance = new MyImages(300, 256, "TestePPM", "ppm");
        String expResult = "TestePPM.ppm";
        String result = instance.getImagefileName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getImageType method, of class MyImages.
     */
    @Test
    public void testGetImageType() {
        System.out.println("getImageType");
        MyImages instance = new MyImages(300, 256, "TestePPM", "ppm");
        String expResult = "PPM";
        String result = instance.getImageType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setImageType method, of class MyImages.
     */
    @Test
    public void testSetImageType() {
        System.out.println("setImageType");
        String imageType = "png";
        MyImages instance = new MyImages(300, 256, "TestePPM", "ppm");
        instance.setImageType(imageType);
        assertEquals(imageType, instance.getImageType());
    }

    /**
     * Test of setImageName method, of class MyImages.
     */
    @Test
    public void testSetImageName() {
        System.out.println("setImageName");
        String imageName = "TestePNG";
        MyImages instance = new MyImages(300, 256, "TestePPM", "ppm");
        instance.setImageName(imageName);
        assertEquals(imageName, instance.getImageName());
    }

    /**
     * Test of setImageWidth method, of class MyImages.
     */
    @Test
    public void testSetImageWidth() {
        System.out.println("setImageWidth");
        int imageWidth = 0;
        MyImages instance = new MyImages(300, 256, "TestePPM", "ppm");
        instance.setImageWidth(imageWidth);
        assertEquals(imageWidth, instance.getImageWidth());
    }

    /**
     * Test of setImageHeight method, of class MyImages.
     */
    @Test
    public void testSetImageHeight() {
        System.out.println("setImageHeight");
        int imageHeight = 0;
        MyImages instance = new MyImages(300, 256, "TestePPM", "ppm");
        instance.setImageHeight(imageHeight);
        assertEquals(imageHeight, instance.getImageHeight());
    }

    /**
     * Test of generateImage method, of class MyImages.
     */
    @Test
    public void testGenerateImage() {
        System.out.println("generateImage");
        MyImages instance = new MyImages(256, 256, "TestePPM", "ppm");
        instance.generateImage();
    }

    /**
     * Test of generateShapesPPM method, of class MyImages.
     */
    @Test
    public void testGenerateShapesPPM() {
        System.out.println("generateShapesPPM");
        String shape = "square";
        Color color = new Color("#2B4A2C");
        MyImages instance = new MyImages(300, 256, "TestePPM", "ppm");
        instance.generateShapesPPM(shape, color);
    }

    /**
     * Test of generateShapesPNG method, of class MyImages.
     */
    @Test
    public void testGenerateShapesPNG() {
        System.out.println("generateShapesPNG");
        String shape = "stripes";
        Color color = new Color("#2B4A2C");
        MyImages instance = new MyImages(300, 256, "TestePNG", "png");
        instance.generateShapesPNG(shape, color);
    }

    /**
     * Test of openImage method, of class MyImages.
     */
    @Test
    public void testOpenImage() {
        System.out.println("openImage");
        MyImages instance = new MyImages(300, 256, "TestePNG", "png");
        String shape = "stripes";
        Color color = new Color("#2B4A2C");
        instance.generateShapesPNG(shape, color);
        instance.openImage();
    }
    
}
