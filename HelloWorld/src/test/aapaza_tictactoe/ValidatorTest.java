package aapaza_tictactoe;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {

    @Test
    public void VerifyTheCoordenatesAreCorrect(){
        boolean isGoodXY=new Validator().goodcoordenates(2,2);
        assertTrue(isGoodXY);
    }
    @Test
    public void VerifyTheOcupedFieldsAreValidated(){
        int[][] matrix = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}};
        boolean isFieldAlreadyFilled=new Validator().isAlreadyFilledField(matrix,1,1);
        assertTrue(isFieldAlreadyFilled);
    }

}