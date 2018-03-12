/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kumpal
 */
public class MilkItemTest {
    
    public MilkItemTest() {
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
     * Test of setItem method, of class MilkItem.
     */
    @Test(expected= NullPointerException.class)
    public void testSetItem() {
        System.out.println("setItem");
        String i = "";
        MilkItem instance = null;
        instance.setItem(i);
        
    }

    /**
     * Test of getItem method, of class MilkItem.
     */
    @Test(expected= NullPointerException.class)
    public void testGetItem() {
        System.out.println("getItem");
        MilkItem instance = null;
        String expResult = "";
        String result = instance.getItem();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setQuantity method, of class MilkItem.
     */
    @Test(expected= NullPointerException.class)
    public void testSetQuantity() {
        System.out.println("setQuantity");
        double q = 0.0;
        MilkItem instance = null;
        instance.setQuantity(q);
        
    }

    /**
     * Test of getQuantity method, of class MilkItem.
     */
    @Test(expected= NullPointerException.class)
    public void testGetQuantity() {
        System.out.println("getQuantity");
        MilkItem instance = null;
        double expResult = 0.0;
        double result = instance.getQuantity();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of setPrice method, of class MilkItem.
     */
    @Test(expected= NullPointerException.class)
    public void testSetPrice() {
        System.out.println("setPrice");
        double p = 0.0;
        MilkItem instance = null;
        instance.setPrice(p);
        
    }

    /**
     * Test of getPrice method, of class MilkItem.
     */
    @Test(expected= NullPointerException.class)
    public void testGetPrice() {
        System.out.println("getPrice");
        MilkItem instance = null;
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of toString method, of class MilkItem.
     */
    @Test(expected= NullPointerException.class)
    public void testToString() {
        System.out.println("toString");
        MilkItem instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getTotal method, of class MilkItem.
     */
    @Test(expected= NullPointerException.class)
    public void testGetTotal() {
        System.out.println("getTotal");
        MilkItem instance = null;
        double expResult = 0.0;
        double result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
        
    }
    
}
