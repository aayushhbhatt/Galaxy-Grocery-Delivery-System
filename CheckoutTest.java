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
public class CheckoutTest {
    
    public CheckoutTest() {
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
     * Test of pay method, of class Checkout.
     */
    @Test
    public void testPay() {
        System.out.println("pay");
        Checkout instance = new CheckoutImpl();
        instance.pay();
     
    }

    public class CheckoutImpl implements Checkout {

        public void pay() {
        }
    }
    
}
