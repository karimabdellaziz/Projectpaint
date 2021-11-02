import java.awt.*;
import java.awt.Color;
public class Rectangle extends Figures {
    //declaration des attributs
    protected int length;
    protected int width;

    //getter et setter
    public int getLength() {return length;}
    public int getWidth() {return width;}
    public void setLength(int length) {this.length = length;}
    public void setWidth(int width) {this.width = width;}


    // constructeurs rectangle
    public Rectangle(Color c, int length, int width) {
        super(c);
        this.length = length;
        this.width = width;
    }
    public Rectangle(){}
    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }



//
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
    public void draw(Graphics g){}
    @Override
    public String toString(){return super.toString()+"" +width + "" +length;}
}


