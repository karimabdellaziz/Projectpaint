import java.awt.*;

public class Circle extends Ellipse {


    public Circle(Color couleur,Point p) {
        super(couleur,p);
        this.semiAxysY=0;
        this.semiAxysX=0;

    }

    public Circle(Color couleur,Point p, int semiAxisX, int semiAxisY) {
        super(couleur,p,semiAxisX,semiAxisY);
    }
    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        super.setBoundingBox(heightBB, widthBB);
    }


}

