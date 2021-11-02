import java.awt.*;
import java.awt.Color;
public abstract class Figures {

    public Color getC() {return couleur;}

     Color couleur ;


    public abstract void setBoundingBox(int heightBB, int widthBB);

    public abstract void draw (Graphics g) ;

    public Figures(Color couleur) {
        this.couleur = couleur;

    }

    public Figures (){};
    public  abstract int getPerimeter();
    public abstract  int getSurface();

@Override
    public String toString(){return couleur.toString();}


}
