import java.awt.*;
import java.awt.Color;
public class Rectangle extends Figures {
    public Integer getLength() {return length;}
    public Integer getWidth() {return width;}
    public void setLength(Integer length) {this.length = length;}
    public void setWidth(Integer width) {this.width = width;}



    protected Integer length;
    protected Integer width;


    public Rectangle(int px, int py, Color c){
        Point a=new Point(px,py) ;
        this.width=0 ;
        this.length=0;
        this.c=c;



    }
    public int getPerimeter(){
        return 2*(this.length+this.width);
    }
    public int getSurface(){
        return this.length*this.width;
    }
    @Override
    public void setBoundingbox(int heightBB, int widthBB) {
        this.length = heightBB;
        this.width = widthBB;
    }
    @Override
    public void draw(Graphics g){}
}


