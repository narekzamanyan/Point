public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance() {
        return Math.sqrt( (Math.pow(this.x, 2) + Math.pow(this.y, 2)) );
    }

    public double distance(Point p) {
        double abs_x = Math.abs(this.x - p.getX());
        double abs_y = Math.abs(this.y - p.getY());
        return Math.sqrt( Math.pow(abs_x, 2) + Math.pow(abs_y, 2) );
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
