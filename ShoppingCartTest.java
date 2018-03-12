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
public class ShoppingCartTest {
    
    public ShoppingCartTest() {
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
     * Test of add method, of class ShoppingCart.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        MilkItem item = null;
        ShoppingCart instance = new ShoppingCart();
        instance.add(item);
       
    }

    /**
     * Test of getTotalItems method, of class ShoppingCart.
     */
    @Test
    public void testGetTotalItems() {
        System.out.println("getTotalItems");
        ShoppingCart instance = new ShoppingCart();
        int expResult = 0;
        int result = instance.getTotalItems();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of get final price method, of class ShoppingCart.
     */
    @Test
    public void testGetfinalprice() {
        System.out.println("getfinalprice");
        ShoppingCart instance = new ShoppingCart();
        double expResult = 0.0;
        double result = instance.getfinalprice();
        assertEquals(expResult, result, 0.0);
     
    }
    
}
