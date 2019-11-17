public class Rectangule implements Figure {
    char charFiller;
    int height;
    int width;

    Rectangule(final char charFiller, final int height, final int width){
        this.charFiller = charFiller;
        this.height = height;
        this.width = width;
    }
    @Override
    public void print(){
        for(int i = 0; i < this.height; i++){
            for(int j = 0; j < this.width; j++){
                System.out.print(this.charFiller);
            }
            System.out.println();
        }
    }
}
