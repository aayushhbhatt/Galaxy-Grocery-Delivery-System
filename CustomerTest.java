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
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of setPassword method, of class Customer.
     */
    @Test(expected= NullPointerException.class)
    public void testSetPassword() {
        System.out.println("setPassword");
        String p = "";
        Customer instance = null;
        instance.setPassword(p);
       
    }

    /**
     * Test of getPassword method, of class Customer.
     */
    @Test(expected= NullPointerException.class)
    public void testGetPassword() {
        System.out.println("getPassword");
        Customer instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of upgrade method, of class Customer.
     */
    @Test(expected= NullPointerException.class)
    public void testUpgrade() {
        System.out.println("upgrade");
        Update c = null;
        Customer instance = null;
        instance.upgrade(c);
      
    }

    /**
     * Test of downgrade method, of class Customer.
     */
    @Test(expected= NullPointerException.class)
    public void testDowngrade() {
        System.out.println("downgrade");
        Update c = null;
        Customer instance = null;
        instance.downgrade(c);
 
    }

    /**
     * Test of setRole method, of class Customer.
     */
    @Test(expected= NullPointerException.class)
    public void testSetRole() {
        System.out.println("setRole");
        Customer instance = null;
        instance.setRole();
    
    }

    /**
     * Test of getRole method, of class Customer.
     */
    @Test(expected= NullPointerException.class)
    public void testGetRole() {
        System.out.println("getRole");
        Customer instance = null;
        String expResult = "";
        String result = instance.getRole();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getLocation method, of class Customer.
     */
    @Test(expected= NullPointerException.class)
    public void testGetLocation() {
        System.out.println("getLocation");
        Customer instance = null;
        String expResult = "";
        String result = instance.getLocation();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getUser method, of class Customer.
     */
    @Test(expected= NullPointerException.class)
    public void testGetUser() {
        System.out.println("getUser");
        Customer instance = null;
        String expResult = "";
        String result = instance.getUser();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setUser method, of class Customer.
     */
    @Test(expected= NullPointerException.class)
    public void testSetUser() {
        System.out.println("setUser");
        String user = "";
        Customer instance = null;
        instance.setUser(user);
     
    }

    /**
     * Test of setLocation method, of class Customer.
     */
    @Test(expected= NullPointerException.class)
    public void testSetLocation() {
        System.out.println("setLocation");
        String loc = "";
        Customer instance = null;
        instance.setLocation(loc);
        
    }

    public class CustomerImpl extends Customer {

        public CustomerImpl() {
            super("", "");
        }

        public void setPassword(String p) {
        }

        public String getPassword() {
            return "";
        }

        public void upgrade(Update c) {
        }

        public void downgrade(Update c) {
        }

        public void setRole() {
        }
    }
    
}
