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
public class MemberTest {
    
    public MemberTest() {
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
     * Test of upgrade method, of class Member.
     */
    @Test(expected= NullPointerException.class)
    public void testUpgrade() {
        System.out.println("upgrade");
        Update u = null;
        Member instance = null;
        instance.upgrade(u);
       
    }

    /**
     * Test of downgrade method, of class Member.
     */
    @Test(expected= NullPointerException.class)
    public void testDowngrade() {
        System.out.println("downgrade");
        Update u = null;
        Member instance = null;
        instance.downgrade(u);
       
    }

    /**
     * Test of getPassword method, of class Member.
     */
    @Test(expected= NullPointerException.class)
    public void testGetPassword() {
        System.out.println("getPassword");
        Member instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setPassword method, of class Member.
     */
    @Test(expected= NullPointerException.class)
    public void testSetPassword() {
        System.out.println("setPassword");
        String p = "";
        Member instance = null;
        instance.setPassword(p);
        
    }

    /**
     * Test of setRole method, of class Member.
     */
    @Test(expected= NullPointerException.class)
    public void testSetRole() {
        System.out.println("setRole");
        Member instance = null;
        instance.setRole();
       
    }

    /**
     * Test of setDiscount method, of class Member.
     */
    @Test(expected= NullPointerException.class)
    public void testSetDiscount() {
        System.out.println("setDiscount");
        double d = 0.0;
        Member instance = null;
        double expResult = 0.0;
        double result = instance.setDiscount(d);
        assertEquals(expResult, result, 0.0);
     
    }
    
}
