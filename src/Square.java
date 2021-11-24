import java.awt.*;

public class Square extends Rectangle {

    // constructeurs de notre classe square qui herite de rectangle
    public Square(Color couleur,Point p) {
        super(couleur,p);
        this.length=0;
        this.width=0;

    }

    public Square(Color couleur, Point p, int length) {
        super(couleur, p);
        this.length = length;
        this.width = length;
    }
//override de la methode setBoundigBox presente dans la classe abstraite
    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.width=heightBB;
        this.length=heightBB;

    }



}