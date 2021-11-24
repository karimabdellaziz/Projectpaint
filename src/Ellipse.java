import java.awt.*;

public class Ellipse extends Figures {

    //declaration des attributs
    protected int semiAxysX;
    protected int semiAxysY;
    public void setSemiAxysX(int semiAxysX) {
        this.semiAxysX = semiAxysX;
    }
    public void setSemiAxysY(int semiAxysY) {this.semiAxysY = semiAxysY;}


    // constructeurs rectangle
 public Ellipse(Color couleur,Point p, int semiAxysX,int semiAxysY ){
    super(couleur,p);
     this.semiAxysX=semiAxysX;
     this.semiAxysY=semiAxysY;
 }

    public Ellipse(Color couleur,Point p){
        super(couleur,p);
        semiAxysY=0;
        semiAxysX=0;

    }
    public Ellipse(){

    }
    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.semiAxysX =widthBB;
        this.semiAxysY =  heightBB;
    }

    @Override
    public void draw(Graphics g){
        g.setColor(this.Couleur);
        g.fillOval(Origine.getX(), Origine.getY(),semiAxysX,semiAxysY);

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