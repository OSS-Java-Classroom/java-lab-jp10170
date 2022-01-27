/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Korisnik
 */
public class ColorNGTest {
    
    public ColorNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of decode method, of class Color.
     */
    @Test
    public void testDecode() {
        System.out.println("decode");
        String hexcolor = "#ff5733";
        Color expResult = Color.decode(hexcolor);
        expResult.r = 255;
        expResult.g = 87;
        expResult.b = 51;
        Color result = Color.decode(hexcolor);
        assertEquals(result.r, expResult.r);
        assertEquals(result.g, expResult.g);
        assertEquals(result.b, expResult.b);
    }

    /**
     * Test of RGBtoHSB method, of class Color.
     */
    @Test
    public void testRGBtoHSB() {
        System.out.println("RGBtoHSB");
        int a = 255;
        int d = 87;
        int c = 51;
        float[] hsbvals = new float[3];
        float[] expResult = new float[3];
        expResult[0] = (float) 10.588226;
        expResult[1] = (float) 80;
        expResult[2] = (float) 100;
        float[] result = Color.RGBtoHSB(a, d, c, hsbvals);
        assertEquals(result[0]* 360, expResult[0]);
        assertEquals(result[1]* 100, expResult[1]);
        assertEquals(result[2]* 100, expResult[2]);
    }

    /**
     * Test of RGBtoHSL method, of class Color.
     */
    @Test
    public void testRGBtoHSL() {
        System.out.println("RGBtoHSL");
        int a = 255;
        int d = 87;
        int c = 51;
        float[] hsl= new float[3];
        float[] expResult = new float[3];
        expResult[0] = (float) 10.588226;
        expResult[1] = (float) 100.000015;
        expResult[2] = (float) 60.000004;
        float[] result = Color.RGBtoHSL(a, d, c);
        assertEquals(result[0], expResult[0]);
        assertEquals(result[1], expResult[1]);
        assertEquals(result[2], expResult[2]);
    }

    /**
     * Test of RGBtoCMYK method, of class Color.
     */
    @Test
    public void testRGBtoCMYK() {
        System.out.println("RGBtoCMYK");
        int a = 255;
        int d = 87;
        int l = 51;
        float[] expResult = new float[4];
        expResult[0] = (float) 0;
        expResult[1] = (float) 65.88235;
        expResult[2] = (float) 80;
        expResult[3] = (float) 0;
        float[] result = Color.RGBtoCMYK(a, d, l);
        assertEquals(result[0], expResult[0]);
        assertEquals(result[1], expResult[1]);
        assertEquals(result[2], expResult[2]);
        assertEquals(result[3], expResult[3]);
        
    }

    /**
     * Test of getRed method, of class Color.
     */
    @Test
    public void testGetRed() {
        System.out.println("getRed");
        String hexColor = "#FF5733";
        Color c = Color.decode(hexColor);
        int expResult = 255;
        int result = c.getRed();
        assertEquals(result, expResult);
    }

    /**
     * Test of getGreen method, of class Color.
     */
    @Test
    public void testGetGreen() {
        System.out.println("getGreen");
        System.out.println("getBlue");
        String hexColor = "#FF5733";
        Color c = Color.decode(hexColor);
        int expResult = 87;
        int result = c.getGreen();
        assertEquals(result, expResult);
    }

    /**
     * Test of getBlue method, of class Color.
     */
    @Test
    public void testGetBlue() {
        System.out.println("getBlue");
        String hexColor = "#FF5733";
        Color c = Color.decode(hexColor);
        int expResult = 51;
        int result = c.getBlue();
        assertEquals(result, expResult);
    }

    /**
     * Test of getRGB method, of class Color.
     */
    @Test
    public void testGetRGB() {
        System.out.println("getRGB");
        String hexColor = "#FF5733";
        Color c = Color.decode(hexColor);
        int expResult = 16734003;
        int result = c.getRGB();
        assertEquals(result, expResult);
    }
    
}
