/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project.BlackJackClass;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Daniel Nguyen
 */
public class BJPlayerTest {
    
    public BJPlayerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getSum method, of class BJPlayer.
     */
    @Test
    public void testGetSum() {
        System.out.println("getSum");
        BJPlayer instance = null;
        int expResult = 0;
        int result = instance.getSum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCard method, of class BJPlayer.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        BJPlayer instance = null;
        instance.getCard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bust method, of class BJPlayer.
     */
    @Test
    public void testBust() {
        System.out.println("bust");
        BJPlayer instance = null;
        boolean expResult = false;
        boolean result = instance.bust();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class BJPlayer.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        BJPlayer instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
