public class Triangule implements Figure{
    char charFiller;
    int height;

    Triangule(final char charFiller, final int height){
        this.charFiller = charFiller;
        this.height = height;
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
    }
}
