public class Rhombus implements Figure {
    char charFiller;
    int height;

    Rhombus(final char charFiller, final int height){
        this.charFiller = charFiller;
        this.height = (height+1)/2;
    }

    @Override
    public void print(){
        for(int i = 0; i < this.height; i++){
            for(int j = this.height-1; j > i; j--){
                System.out.print(" ");
            }
            for(int k = -2; k < (2 * i -1); k++) {
                System.out.print(charFiller);
            }
            System.out.println();
        }
        for(int i = this.height-1; i > 0 ; i--){
            for(int j = this.height; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < (2 * i -1); k++) {
                System.out.print(charFiller);
            }
            System.out.println();
        }
    }
}
