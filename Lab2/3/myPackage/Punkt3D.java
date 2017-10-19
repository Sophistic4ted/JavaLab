package myPackage;

public class Punkt3D extends Punkt2D {
    double z;

    Punkt3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    double distance(Punkt3D point) {
        return  Math.sqrt(Math.pow(this.getX() - point.getX(), 2)
                + Math.pow(this.getY() - point.getY(), 2)
                + Math.pow(this.getZ() - point.getZ(), 2));
    }
}