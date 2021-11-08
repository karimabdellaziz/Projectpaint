import java.awt.*;
import java.awt.Color;
public abstract class Figures {
    //declaration des attributs
    protected Point Origine;
    protected Color Couleur;

    // getter methode pour les attributs
    public Color getCouleur() {
        return Couleur;
    }

    public Point getOrigine() {
        return Origine;
    }


    // constructeur de la classe figures
    public Figures(Color couleur,Point p) {
        this.Couleur = couleur;
        this.Origine = new Point(p.getX(),p.getY());

    }

    public Figures() {}


    // methodes abstraites de notre classe figures
    public abstract void setBoundingBox(int heightBB, int widthBB);

    public abstract void draw(Graphics g);

    public abstract int getPerimeter();

    public abstract int getSurface();

    // Overrides de la method toString

    @Override
    public String toString() {
        if (Couleur != null) return Couleur.toString();
        else return "";
    }
}