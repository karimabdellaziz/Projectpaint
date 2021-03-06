import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Drawing extends JPanel implements MouseListener, MouseMotionListener {

    //declaration d'attributs
    protected ArrayList<Figures> list=new ArrayList<Figures>(); ;
    protected String NameFigure;
    Color currentColor=Color.black;
    protected int x;
    protected int y;
    protected int length ;
    protected int width;
    protected int xd;
    protected  int yd;

    public void addFigure(Figures figure){list.add(figure);}
    public void setNameFigure(String nameFigure) {this.NameFigure = nameFigure;}
    public ArrayList<Figures> getList() {
        return list;
    }
    public void setCurrentColor(Color currentColor) {this.currentColor = currentColor;}
    public Color getCurrentColor() {return currentColor;}

    public Drawing() {
        super();
        addMouseMotionListener(this);
        addMouseListener(this);
    }
    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        this.setBackground(Color.white);
        for(Figures f:list){
            f.draw(graphics);
        }

    }

    public String toString() {
        return NameFigure + " " +length+" "+width+" ";
    }




    @Override
    public void mousePressed(MouseEvent e) {
        this.x=e.getX();
        this.y=e.getY();

        Point point= new Point(x,y);
        if(NameFigure.equals("Rectangle")){
            Rectangle rectangle = new Rectangle(currentColor,point);
            addFigure(rectangle);


        }
       if(NameFigure.equals("Cercle")){
           Circle cercle=new Circle(currentColor,point);
           addFigure(cercle);

       }
       if(NameFigure.equals("Ellipse")){
           Ellipse ellipse=new Ellipse(currentColor,point);
           addFigure(ellipse);

       }
       if(NameFigure.equals("Carre")){

           Square carre=new Square(currentColor,point);
           addFigure(carre);
       }
    }
    @Override
    public void mouseDragged(MouseEvent e){
    this.xd=e.getX();
    this.yd=e.getY();
    length=Math.abs(y-yd);
    width=Math.abs(x-xd);

    list.get(list.size()-1).setBoundingBox(length,width);
    this.repaint();
    }

// methodes non utilis??es  mais necessaire dans la code
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mouseMoved(MouseEvent e) {}

    public void save(String name){
        try {
            FileOutputStream fos = new FileOutputStream("nomFichier");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeInt(list.size());
            for (Figures f : list) {
                oos.writeObject(f);
            }
            oos.close();


        }
        catch (Exception e){
            System.out.println("probleme");
        }
    }
    public void Clear(){
        list.clear();

        this.repaint();
    }
}

