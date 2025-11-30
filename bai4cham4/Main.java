package bai4cham4;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println("Initial Position: " + movablePoint);
        movablePoint.move();
        System.out.println("After Move: " + movablePoint);
    }
    
}
