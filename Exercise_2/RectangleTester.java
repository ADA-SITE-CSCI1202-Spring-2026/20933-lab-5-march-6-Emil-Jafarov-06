package Exercise_2;

public class RectangleTester {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(15, 10);
        Rectangle r3 = new Rectangle(5, 10);

        System.out.println("Objects are identical: " + r1.equals(r2));
        System.out.println("Objects are identical: " + r1.equals(r3));

    }

}
