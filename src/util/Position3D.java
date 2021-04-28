package util;

public class Position3D {
    public double x;
    public double y;
    public double z;

    public Position3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Position3D(){
        this(0, 0, 0);
    }
}
