package Exercise_6;

public class Point implements Movable{

    private float x;
    private float y;

    public Point() {}

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(p.x-this.x, 2)+Math.pow(p.y-this.y, 2));
    }

    @Override
    public boolean equals(Object o){
        Point p = (Point) o;
        return x == p.x && y == p.y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    // Implemented methods
    @Override
    public void moveUp(float a) {
        y += a;
        System.out.printf("New Coordinates: x=%f, y=%f\n", x, y);
    }

    @Override
    public void moveDown(float a) {
        y -= a;
        System.out.printf("New Coordinates: x=%f, y=%f\n", x, y);
    }

    @Override
    public void moveLeft(float a) {
        x -= a;
        System.out.printf("New Coordinates: x=%f, y=%f\n", x, y);
    }

    @Override
    public void moveRight(float a) {
        x += a;
        System.out.printf("New Coordinates: x=%f, y=%f\n", x, y);
    }

}
