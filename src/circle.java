import java.awt.*;

public class circle extends ellipse {


    public circle() {}

    public circle(Color couleur,Point p, int semiAxisX, int semiAxisY) {
        super(couleur,p,semiAxisX,semiAxisY);
    }
    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        super.setBoundingBox(heightBB, widthBB);
    }


}

