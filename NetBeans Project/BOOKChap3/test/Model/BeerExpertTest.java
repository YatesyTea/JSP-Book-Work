/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

/**
 *
 * @author Yates
 */
public class BeerExpertTest {

    private String color;

    public BeerExpertTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("===Set Up Class");
    }

    @Before
    public void setUp() {
        System.out.println("=== Set Up");
    }

    @After
    public void tearDown() {
        System.out.println("=== Tear Down");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("=== Tear Down Class");
    }

    // Test Methods Below
    @Test
    public void hello() {
        System.out.println("Hello World");
    }

    @Test
    public void testLight() {
        System.out.println("Testing Light");

        // Calling getBrands
        ArrayList<String> result = beerExpert.getBrands("light");

        // Creating Expected Result
        List expResult = new ArrayList();
        expResult.add("Jail Pales Ale");
        expResult.add("Gout Stout");

        // Assessing
        assertEquals(expResult, result);

    }
}
