package Exercise_6;

import java.awt.*;

public class Circle implements Movable {

    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public void moveUp(float a) {
        center.moveUp(a);
    }

    @Override
    public void moveDown(float a) {
        center.moveDown(a);
    }

    @Override
    public void moveLeft(float a) {
        center.moveLeft(a);
    }

    @Override
    public void moveRight(float a) {
        center.moveRight(a);
    }
}
