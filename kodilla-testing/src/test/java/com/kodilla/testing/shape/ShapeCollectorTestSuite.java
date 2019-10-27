package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector testList = new ShapeCollector(new ArrayList<>());
        ShapeCollector fullList = new ShapeCollector(new ArrayList<>(Arrays.asList(
                new Triangle(3,4))));
        int fullListSize = fullList.getShapeList().size();

        //When
        testList.addFigure(new Triangle(3,4));
        int testListSize = testList.getShapeList().size();

        //Then
        Assert.assertEquals(fullListSize, testListSize);
    }

    @Test
    public void testRemoveFigure(){
        //Given
        Triangle triangle = new Triangle(3,4);
        ShapeCollector testList = new ShapeCollector(new ArrayList<>(Arrays.asList(
                triangle)));
        ShapeCollector shortList = new ShapeCollector(new ArrayList<>());

        int shortListSize = shortList.getShapeList().size();
        //When
        testList.removeFigure(triangle);
        int testListSize = testList.getShapeList().size();

        //Then
        Assert.assertEquals(shortListSize, testListSize);
    }
    @Test
    public void testGetFigure(){
        //Given
        Circle circle = new Circle(11);
        Square square = new Square(7);
        Triangle triangle = new Triangle(3,4);
        ShapeCollector testList = new ShapeCollector(new ArrayList<>(Arrays.asList(
                circle, square, triangle)));

        //When
        Shape shape0 = testList.getFigure(0);
        Shape shape1 = testList.getFigure(1);
        Shape shape2 = testList.getFigure(2);
        //Then
        Assert.assertEquals(circle, shape0);
        Assert.assertEquals(square, shape1);
        Assert.assertEquals(triangle, shape2);
    }
    @Test
    public void testShowFigures(){
        //Given
        Circle circle = new Circle(11);
        Square square = new Square(7);
        Triangle triangle = new Triangle(3,4);
        ArrayList<Shape> testList = new ArrayList<>(Arrays.asList(
                circle, square, triangle));
        ShapeCollector shapesList = new ShapeCollector(testList);
        //Then
        Assert.assertEquals(testList,shapesList.showFigures());
    }
}
