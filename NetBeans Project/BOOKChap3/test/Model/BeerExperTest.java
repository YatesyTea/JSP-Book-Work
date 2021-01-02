/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yates
 */
public class BeerExperTest {
    
    public BeerExperTest() {
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

    @Test
    public void testLight() {
        System.out.println("Testing Light");

        // Calling getBrands
        ArrayList<String> result = getBrands("light");

        // Creating Expected Result
        List expResult = new ArrayList();
        expResult.add("Jail Pales Ale");
        expResult.add("Gout Stout");

        // Assessing
        assertEquals(expResult, result);

    }
}
