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
        ShapeCollector testList = new ShapeCollector(new ArrayList<>(Arrays.asList(
                new Circle(11), new Square(7))));
        ShapeCollector fullList = new ShapeCollector(new ArrayList<>(Arrays.asList(
                new Circle(11), new Square(7), new Triangle(3,4))));
        int fullListSize = fullList.getShapeList().size();

        //When
        testList.addFigure(new Triangle(3,4));
        int testListSize = testList.getShapeList().size()

        //Then
        Assert.assertEquals(fullListSize, testListSize);
    }

    @Test
    public void testRemoveFigure(){
        //Given
        Circle circle = new Circle(11);
        Square square = new Square(7);
        Triangle triangle = new Triangle(3,4);
        ShapeCollector testList = new ShapeCollector(new ArrayList<>(Arrays.asList(
                circle, square, triangle)));
        ShapeCollector shortList = new ShapeCollector(new ArrayList<>(Arrays.asList(
                circle, square)));

        int shortListSize = shortList.getShapeList().size();
        //When
        testList.removeFigure(triangle);
        int testListSize = testList.getShapeList().size()

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
        Shape shape1 = testList.getFigure(1);
        Shape shape2 = testList.getFigure(2);
        Shape shape3 = testList.getFigure(3);
        //Then
        Assert.assertEquals(circle, shape1);
        Assert.assertEquals(square, shape2);
        Assert.assertEquals(triangle, shape3);
    }
    @Test
    public void testShowFigures(){
        //Given
        Circle circle = new Circle(11);
        Square square = new Square(7);
        Triangle triangle = new Triangle(3,4);
        ArrayList testList = new ArrayList<Shape>(Arrays.asList(
                circle, square, triangle)));
        ShapeCollector shapesList = new ShapeCollector(testList);
        //Then
        Assert.assertEquals(testList,shapesList.showFigures());
    }
}
