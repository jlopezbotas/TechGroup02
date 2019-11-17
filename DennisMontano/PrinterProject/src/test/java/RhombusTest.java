package test.java;

import main.java.Figure;
import main.java.Rhombus;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class RhombusTest {

    Figure rhombus;

    public final int HEIGTH = 5;
    public final char SIGN = '@';

    @Before
    public void setUp() throws Exception {
        rhombus = new Rhombus(HEIGTH, SIGN);
    }

    @Test
    public void createBodyFigureTest() {
        ArrayList<ArrayList<Character>> expectedArray = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(' ', ' ', '@', ' ', ' ')),
                        new ArrayList<>(Arrays.asList(' ', '@', '@', '@', ' ')),
                        new ArrayList<>(Arrays.asList('@', '@', '@', '@', '@')),
                        new ArrayList<>(Arrays.asList(' ', '@', '@', '@', ' ')),
                        new ArrayList<>(Arrays.asList(' ', ' ', '@', ' ', ' '))
                )
        );
        assertArrayEquals(expectedArray.toArray(), rhombus.getFigureBody().toArray());
    }
}