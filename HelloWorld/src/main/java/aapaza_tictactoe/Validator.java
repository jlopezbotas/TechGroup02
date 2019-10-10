package aapaza_tictactoe;

public class Validator {
    public boolean isAlreadyFilledField(int[][] matrix, int y, int x){
        boolean isAlreadyFilledField = true;
       try {



        if(matrix[y][x] == 0){
            isAlreadyFilledField = false;
        }else {
            System.out.println("The field is alredy filled");
        }
       }
        catch(java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("Value entered is greather 2 or less than 0");

        }

        return isAlreadyFilledField;
    }

    public boolean goodcoordenates(int y, int x) {
        boolean allowedValues = false;

        if (y <= 2 && y >=0 && x <= 2 && x >=0 ){
            allowedValues = true;
        }else {
            System.out.println("The Values are out of the range");
        }

        return allowedValues;
    }


}
