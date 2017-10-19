package myPackage;


public class Punkt2D {
    double x, y;

    public Punkt2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
  
	double getX() {

        return x;
    }

    double getY() {
        return y;
    }
    
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }


    double distance(Punkt2D point) {
        return Math.sqrt(Math.pow(this.getX() - point.getX(), 2) 
        		+ Math.pow(this.getY() - point.getY(), 2));
    }
}
