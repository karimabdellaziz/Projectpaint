import java.awt.*;
import java.awt.Color;
public class Rectangle extends Figures {
    //declaration des attributs
    protected int length;
    protected int width;

    //getter et setter method
    public int getLength() {return length;}
    public int getWidth() {return width;}
    public void setLength(int length) {this.length = length;}
    public void setWidth(int width) {this.width = width;}


    // constructeurs rectangle
    public Rectangle(Color couleur,Point p) {
        super(couleur,p);
        this.length=0;
        this.width = 0;
    }
    public Rectangle(){}

    public Rectangle(int length,int width ,Point p , Color couleur){
        super(couleur,p);
        this.length = length;
        this.width = width;
    }



//Override des methodes de la classe figure car rectangle herite de la classe abstraite figures
    @Override
    public int getPerimeter(){
        return 2*(this.length+this.width);
    }
    @Override
    public int getSurface(){
        return this.length*this.width;
    }
    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.length = heightBB;
        this.width = widthBB;
    }
    @Override
    public void draw(Graphics g){
        g.setColor(this.Couleur);
        g.fillRect(Origine.getX(),Origine.getY(),width,length);

    }
    @Override
    public String toString(){return super.toString()+"" +width + "" +length;}
}


