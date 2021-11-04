import java.awt.*;

public class ellipse extends Figures {
    protected int semiAxysX;

    public void setSemiAxysX(int semiAxysX) {
        this.semiAxysX = semiAxysX;
    }

    public void setSemiAxysY(int semiAxysY) {
        this.semiAxysY = semiAxysY;
    }

    protected int semiAxysY;

 public ellipse(Color couleur, int semiAxysX,int semiAxysY ){
     super(couleur);
     this.semiAxysX=semiAxysX;
     this.semiAxysY=semiAxysY;
 }
    public ellipse(){}

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.semiAxysX = heightBB;
        this.semiAxysY = widthBB;
    }

    @Override
    public void draw(Graphics g){}



    @Override
    public int getPerimeter() {
        return (int) (2*Math.PI*Math.sqrt((Math.pow(semiAxysX,2)+Math.pow(semiAxysY,2))/2));
    }

    @Override
    public int getSurface() {
        return (int) (Math.PI*semiAxysY*semiAxysX);
    }
}
