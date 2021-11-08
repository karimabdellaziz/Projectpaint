import java.awt.*;

public class Square extends Rectangle {


    public Square(){}

    public Square(Color couleur,Point p,int length ){
        super(length,length,p,couleur);
    }
    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        super.setBoundingBox(heightBB, widthBB);
    }


}
