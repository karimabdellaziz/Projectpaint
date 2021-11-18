public class Point {

    //declaration des attributs
    private  int X ;
    private int Y ;

    // getter et setter methodes
    public int getX() {
        return X;
    }
    public int getY() {
        return Y;
    }
    public void setX(int x) {
        X = x;
    }
    public void setY(int y) {
        Y = y;
    }

     //constructeurs de notre classe
public Point (int a, int b){
     this.X=a;
     this.Y=b;
}
public  Point (){
    this.X=0;
    this.Y=0;
    }



    @Override
    public String toString(){
        return "x=" +this.X + "y="+ this.Y;
    }
}
