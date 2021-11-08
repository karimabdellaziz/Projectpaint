import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {

private Drawing dessin;
    public Window(String Title , int x, int y){
        super(Title);
        this.setSize(x,y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPanel=this.getContentPane();
        JMenuBar m= new JMenuBar();
        JMenu menu1=new JMenu("File");
        JMenu menu2 = new JMenu("a propos");
        JMenuItem Open=new JMenuItem("Open");
        JMenuItem New= new JMenuItem("New");
        JMenuItem Save= new JMenuItem("Save");
        JMenuItem Quit= new JMenuItem("Quit");
        menu1.add(Open);
        menu1.add(New);
        menu1.add(Save);
        menu1.add(Quit);
        m.add(menu1);
        m.add(menu2);
        contentPanel.add(m,BorderLayout.NORTH);

        //creation des boutons de couleurs,
        JButton Noir= new JButton("Noir");
        Noir.setBackground(Color.black);
        Noir.setForeground(Color.white);
        JButton Rouge= new JButton("Rouge");
        Rouge.setBackground(ColorUIResource.RED);
        JButton Vert= new JButton("Vert");
        Vert.setBackground(Color.green);
        JButton Bleu= new JButton("Bleu");
        Bleu.setForeground(Color.white);
        Bleu.setBackground(Color.blue);
        JButton Jaune= new JButton("Jaune");
        Jaune.setBackground(Color.yellow);
        JButton Rose= new JButton("Rose");
        Rose.setBackground(Color.pink);
        JButton Magenta= new JButton("Magenta");
        Magenta.setBackground(Color.magenta);
        JButton Orange= new JButton("Orange");
        Orange.setBackground(Color.ORANGE);


        // creation d'un panneau et ajout des boutons dans le panneau
        JPanel southPanel =new JPanel();
        southPanel.setLayout(new GridLayout(2,6));
        southPanel.add(Noir);
        southPanel.add(Rouge);
        southPanel.add(Vert);
        southPanel.add(Bleu);
        southPanel.add(Jaune);
        southPanel.add(Rose);
        southPanel.add(Magenta);
        southPanel.add(Orange);


        // creation des boutons permettant de selectionner la forme
        JButton paintPackageEllipse= new JButton("Ellipse");
        JButton paintPackageCercle= new JButton("Cercle");
        JButton paintPackageCarre= new JButton("Carre");
        JButton paintPackageRectangle= new JButton("Rectangle");

        //creation d'un panneau et ajout des boutons "forme" dans le panneau
        JPanel formePanel =new JPanel();
        formePanel.setLayout(new GridLayout(2,2));
        formePanel.add(paintPackageCercle);
        formePanel.add(paintPackageEllipse);
        formePanel.add(paintPackageCarre);
        formePanel.add(paintPackageRectangle);

        //
        Noir.addActionListener(this);
        Rouge.addActionListener(this);
        Vert.addActionListener(this);
        Bleu.addActionListener(this);
        Jaune.addActionListener(this);
        Rose.addActionListener(this);
        Magenta.addActionListener(this);
        Orange.addActionListener(this);
        paintPackageCarre.addActionListener(this);
        paintPackageCercle.addActionListener(this);
        paintPackageEllipse.addActionListener(this);
        paintPackageRectangle.addActionListener(this);


        //creation d'un panneau contenant les deux panneau
        JPanel panneau=new JPanel();
        panneau.setLayout(new GridLayout(1,1));
        panneau.add(southPanel);
        panneau.add(formePanel);

        contentPanel.add(panneau,"South");


        this.setVisible(true);


    }
    public static void main(String args[]){
        Window win= new Window("Paint",800,600);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd=e.getActionCommand();
        dessin=new Drawing();
        switch (cmd) {

            case"Noir":
                dessin.setCurrentColor(Color.BLACK);
                System.out.println("noir");
                break;
            case"Rouge":
                dessin.setCurrentColor(Color.red);
                System.out.println("rouge");
                break;
            case"Vert":
                dessin.setCurrentColor(Color.green);
                System.out.println("vert");
                break;
            case"Bleu":
                dessin.setCurrentColor(Color.blue);
                System.out.println("bleu");
                break;
            case"Jaune":
                dessin.setCurrentColor(Color.yellow);
                System.out.println("Jaune");
                break;
            case"Rose":
                dessin.setCurrentColor(Color.pink);
                System.out.println("Rose");
                break;
            case"Magenta":
                dessin.setCurrentColor(Color.magenta);
                System.out.println("Magenta");
                break;
            case"Orange":
                dessin.setCurrentColor(Color.orange);
                System.out.println("Orange");
                break;
            case "Rectangle":
                dessin.NameFigure="Rectangle";
                System.out.println(dessin.NameFigure);
                break;

            case "Cercle":

                dessin.NameFigure="cercle";
                System.out.println(dessin.NameFigure);
                break;

            case "Ellipse":

                dessin.NameFigure="Ellipse";
                System.out.println(dessin.NameFigure);
                break;

            case "Carre":

                dessin.NameFigure="Carre";
                System.out.println(dessin.NameFigure);
                  break;


        }
        }
    }

