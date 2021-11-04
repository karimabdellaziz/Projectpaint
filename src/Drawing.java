import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Drawing extends JPanel implements MouseListener {


    protected ArrayList<Figures> list ;
    protected String NameFigure;
    protected Figures currentFigures;
    Color currentColor;
    protected int x;
    protected int y;
    public void addFigure(Figures figure){
        list.add(figure);
    }

    public void setCurrentFigures(Figures currentFigures) {
        this.currentFigures = currentFigures;
    }

    public void setNameFigure(String nameFigure) {
        this.NameFigure = nameFigure;
    }

    public ArrayList<Figures> getList() {
        return list;
    }

    public void setCurrentColor(Color currentColor) {
        this.currentColor = currentColor;
    }


    public Drawing() {
        this.setBackground(Color.white);
        list=new ArrayList<>();

    }

    public String toString() {
        return NameFigure + " " + currentFigures.toString();
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {


    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        for(int i=0;i<list.size();i++){
             list.get(i).draw(graphics);
        }

    }
}

