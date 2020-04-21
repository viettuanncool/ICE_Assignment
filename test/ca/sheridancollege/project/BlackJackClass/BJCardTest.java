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
public class BJCardTest {
    
    public BJCardTest() {
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
     * Test of getSuit method, of class BJCard.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        BJCard instance = null;
        BJCard.Suit expResult = null;
        BJCard.Suit result = instance.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class BJCard.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        BJCard instance = null;
        BJCard.Value expResult = null;
        BJCard.Value result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIntValue method, of class BJCard.
     */
    @Test
    public void testGetIntValue() {
        System.out.println("getIntValue");
        BJCard instance = null;
        int expResult = 0;
        int result = instance.getIntValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class BJCard.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BJCard instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
