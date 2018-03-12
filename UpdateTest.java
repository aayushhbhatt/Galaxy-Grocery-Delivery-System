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
public class UpdateTest {
    
    public UpdateTest() {
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
     * Test of setCustomer method, of class Update.
     */
    @Test(expected= NullPointerException.class)
    public void testSetCustomer() {
        System.out.println("setCustomer");
        Customer s = null;
        Update instance = null;
        instance.setCustomer(s);
   
    }

    /**
     * Test of getCustomer method, of class Update.
     */
    @Test(expected= NullPointerException.class)
    public void testGetCustomer() {
        System.out.println("getCustomer");
        Update instance = null;
        Customer expResult = null;
        Customer result = instance.getCustomer();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of upgrade method, of class Update.
     */
    @Test(expected= NullPointerException.class)
    public void testUpgrade() {
        System.out.println("upgrade");
        Update instance = null;
        instance.upgrade();
    
    }

    /**
     * Test of downgrade method, of class Update.
     */
    @Test(expected= NullPointerException.class)
    public void testDowngrade() {
        System.out.println("downgrade");
        Update instance = null;
        instance.downgrade();
        
    }
    
}
