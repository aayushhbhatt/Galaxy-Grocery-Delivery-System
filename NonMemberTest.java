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
public class NonMemberTest {
    
    public NonMemberTest() {
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
     * Test of upgrade method, of class NonMember.
     */
    @Test(expected= NullPointerException.class)
    public void testUpgrade() {
        System.out.println("upgrade");
        Update u = null;
        NonMember instance = null;
        instance.upgrade(u);
        
    }

    /**
     * Test of setPassword method, of class NonMember.
     */
    @Test(expected= NullPointerException.class)
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        NonMember instance = null;
        instance.setPassword(password);
        
    }

    /**
     * Test of getPassword method, of class NonMember.
     */
    @Test(expected= NullPointerException.class)
    public void testGetPassword() {
        System.out.println("getPassword");
        NonMember instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of downgrade method, of class NonMember.
     */
    @Test(expected= NullPointerException.class)
    public void testDowngrade() {
        System.out.println("downgrade");
        Update u = null;
        NonMember instance = null;
        instance.downgrade(u);
      
    }

    /**
     * Test of setRole method, of class NonMember.
     */
    @Test(expected= NullPointerException.class)
    public void testSetRole() {
        System.out.println("setRole");
        NonMember instance = null;
        instance.setRole();
        
    }
    
}
