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
public class AdminTest {
    
    public AdminTest() {
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
     * Test of setPassword method, of class Admin.
     */
    @Test(expected= NullPointerException.class)
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Admin instance = null;
        instance.setPassword(password);
       
    }

    /**
     * Test of getPassword method, of class Admin.
     */
    @Test(expected= NullPointerException.class)
    public void testGetPassword() {
        System.out.println("getPassword");
        Admin instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setUsername method, of class Admin.
     */
    @Test(expected= NullPointerException.class)
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        Admin instance = null;
        instance.setUsername(username);
      
    }

    /**
     * Test of getUsername method, of class Admin.
     */
    @Test(expected= NullPointerException.class)
    public void testGetUsername() {
        System.out.println("getUsername");
        Admin instance = null;
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of priceUpdate method, of class Admin.
     */
    @Test(expected= NullPointerException.class)
    public void testPriceUpdate() throws Exception {
        System.out.println("priceUpdate");
        Admin instance = null;
        instance.priceUpdate();
        
    }
    
}
