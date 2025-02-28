package hardPracticeTask2;

import java.sql.SQLOutput;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void print() {
        System.out.println("Координаты: x = "  + getX()+ ", y = " + getY() + ".");
    }

    public static void main(String[] args) {
        Point newpoint = new Point(4, 6);
        newpoint.print();
        newpoint.setX(10);
        newpoint.print();
    }
}
