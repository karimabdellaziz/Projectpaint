import java.awt.*;

public class ellipse extends Figures {
    private Integer semiAxysX;
    private Integer semiAxysY;




    @Override
    public void setBoundingbox(int heightBB, int widthBB) {
        this.semiAxysX = heightBB;
        this.semiAxysY = widthBB;
    }
    @Override
    public void draw(Graphics g){}
}
