package bai4cham3;

public class Main {
    public static void main(String[] args) {
        Point2d point2d = new Point2d(3.0f, 4.0f);
        System.out.println("Point2d: " + point2d);
        System.out.println("X: " + point2d.getX());
        System.out.println("Y: " + point2d.getY());

        Point3d point3d = new Point3d(5.0f, 6.0f, 7.0f);
        System.out.println("Point3d: " + point3d);
        System.out.println("X: " + point3d.getX());
        System.out.println("Y: " + point3d.getY());
        System.out.println("Z: " + point3d.getZ());
    }
}
