public class Point {
    double x;
    double y;

    public Point (double pointX, double pointY){
        this.x = pointX;
        this.y = pointY;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
