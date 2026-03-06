package Exercise_2;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        Rectangle r = (Rectangle) o;
        return this.width == r.width && this.height == r.height;
    }
}
