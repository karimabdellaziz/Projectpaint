import java.awt.*;

public class circle extends Square {


    public circle(int length, int width) {
        super(length, width);
    }

    public circle(Color couleur, int length, int width) {
        super(couleur, length, width);
    }
    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        super.setBoundingBox(heightBB, widthBB);
    }
}

