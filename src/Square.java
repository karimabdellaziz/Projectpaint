import java.awt.*;

public class Square extends Rectangle {


    public Square(int length, int width){
        super(length, width);

    }

    public Square(Color couleur,int length,int width){

        super(couleur,length,width);
    }
    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        super.setBoundingBox(heightBB, widthBB);
    }
}
