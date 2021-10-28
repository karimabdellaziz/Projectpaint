import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
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

        //creation des boutons de couleurs
        JButton Noir= new JButton("Noir");
        JButton Rouge= new JButton("Rouge");
        JButton Vert= new JButton("Vert");
        JButton Bleu= new JButton("Bleu");
        JButton Jaune= new JButton("Jaune");
        JButton Rose= new JButton("Rose");
        JButton Magenta= new JButton("Magenta");
        JButton Orange= new JButton("Orange");


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
        JButton paintPackageEllipse= new JButton("paintPackage.Ellipse");
        JButton paintPackageCercle= new JButton("paintPackage.Cercle");
        JButton paintPackageCarre= new JButton("paintPackage.Carre");
        JButton paintPackageRectangle= new JButton("paintPackage.Rectangle");

        //creation d'un panneau et ajout des boutons "forme" dans le panneau
        JPanel formePanel =new JPanel();
        formePanel.setLayout(new GridLayout(2,2));
        formePanel.add(paintPackageCercle);
        formePanel.add(paintPackageEllipse);
        formePanel.add(paintPackageCarre);
        formePanel.add(paintPackageRectangle);

        //creation d'un panneau contenant les deux panneau
        JPanel panneau=new JPanel();
        panneau.setLayout(new GridLayout(1,1));
        panneau.add(southPanel);
        panneau.add(formePanel);

        contentPanel.add(panneau,"South");






        //contentPanel.add(OkButton);
        //this.setVisible(true);


    }
    public static void main(String args[]){
        Window win= new Window("Paint",800,600);
    }











}
