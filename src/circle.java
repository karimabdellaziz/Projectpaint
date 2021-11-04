import java.awt.*;

public class circle extends ellipse {


    public circle() {}

    public circle(Color couleur, int length, int width) {
        super(couleur, length, width);
    }
    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        super.setBoundingBox(heightBB, widthBB);
    }


}

