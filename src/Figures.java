import java.awt.*;
import java.awt.Color;
public abstract class Figures {

    public Color getC() {return c;}

    Color c ;

    public abstract void setBoundingbox(int heightBB, int widthBB);

    public abstract void draw (Graphics g) ;
    public Figures (){}
@Override
    public String toString(){return super.toString();}


}
