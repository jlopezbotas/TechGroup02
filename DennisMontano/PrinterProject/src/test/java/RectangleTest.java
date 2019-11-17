package test.java;

import main.java.Figure;
import main.java.Rectangle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class RectangleTest {

    Figure rectangle;

    public final int HEIGTH = 3;
    public final int WIDTH = 5;
    public final char SIGN = '@';

    @Before
    public void setUp() throws Exception {
        rectangle = new Rectangle(WIDTH, HEIGTH, SIGN);
    }

    @Test
    public void createBodyFigureTest() {
        ArrayList<ArrayList<Character>> expectedArray = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList('@', '@', '@', '@', '@')),
                        new ArrayList<>(Arrays.asList('@', '@', '@', '@', '@')),
                        new ArrayList<>(Arrays.asList('@', '@', '@', '@', '@'))
                )
        );
        assertArrayEquals(expectedArray.toArray(), rectangle.getFigureBody().toArray());
    }
}