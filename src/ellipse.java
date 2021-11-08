import java.awt.*;

public class ellipse extends Figures {
    protected int semiAxysX;
    protected int semiAxysY;
    public void setSemiAxysX(int semiAxysX) {
        this.semiAxysX = semiAxysX;
    }
    public void setSemiAxysY(int semiAxysY) {this.semiAxysY = semiAxysY;}



 public ellipse(Color couleur,Point p, int semiAxysX,int semiAxysY ){
    super(couleur,p);
     this.semiAxysX=semiAxysX;
     this.semiAxysY=semiAxysY;
 }

    public ellipse(Point p,Color couleur){
        super(couleur,p);

    }
    public ellipse(){

    }
    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.semiAxysX = heightBB;
        this.semiAxysY = widthBB;
    }

    @Override
    public void draw(Graphics g){
     g.fillOval(Origine.getX(), Origine.getY(), semiAxysX,semiAxysY);
     g.setColor(this.Couleur);
    }



    @Override
    public int getPerimeter() {
        return (int) (2*Math.PI*Math.sqrt((Math.pow(semiAxysX,2)+Math.pow(semiAxysY,2))/2));
    }

    @Override
    public int getSurface() {
        return (int) (Math.PI*semiAxysY*semiAxysX);
    }

    @Override
    public String toString(){return super.toString()+"" +semiAxysY + "" +semiAxysY;}
}