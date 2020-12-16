package test.java;

import main.java.Figure;
import main.java.Triangle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TriangleTest {

    Figure triangle;

    public final int HEIGTH = 4;
    public final char SIGN = '@';

    @Before
    public void setUp() throws Exception {
        triangle = new Triangle(HEIGTH, SIGN);
    }

    @Test
    public void createBodyFigureTest() {
        ArrayList<ArrayList<Character>> expectedArray = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(' ', ' ', ' ', '@', ' ', ' ', ' ')),
                        new ArrayList<>(Arrays.asList(' ', ' ', '@', '@', '@', ' ', ' ')),
                        new ArrayList<>(Arrays.asList(' ', '@', '@', '@', '@', '@', ' ')),
                        new ArrayList<>(Arrays.asList('@', '@', '@', '@', '@', '@', '@'))
                )
        );
        assertArrayEquals(expectedArray.toArray(), triangle.getFigureBody().toArray());
    }
}