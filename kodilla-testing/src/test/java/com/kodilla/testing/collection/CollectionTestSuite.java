package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = exterminator.exterminate(numbers);
        System.out.println("Testing if list is empty");
        //Then
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 7));
        ArrayList<Integer> evens = new ArrayList<>(Arrays.asList(2, 4, 6));
        //Takie definiowanie listy parzystych "na piechotę" pewnie nie jest wlasciwe
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = exterminator.exterminate(numbers);
        System.out.println("Testing if list contains evens only.");
        //Then
        Assert.assertEquals(result,evens);
    }

}
