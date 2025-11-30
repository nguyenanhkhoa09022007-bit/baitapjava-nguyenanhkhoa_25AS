package bai4cham4;

public class MovablePoint extends Point {
     private float xSpeed;
     private float ySpeed;
     public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this. ySpeed = ySpeed;
    }
    public MovablePoint(){
        super();
        this.xSpeed =0.0f;
        this.ySpeed =0.0f;
        }
    public MovablePoint(float xSpeed, float ySpeed){
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        }
     public float getxSpeed() {
         return xSpeed;
     }
     public void setxSpeed(float xSpeed) {
         this.xSpeed = xSpeed;
     }
     public float getySpeed() {
         return ySpeed;
     }
     public void setySpeed(float ySpeed) {
         this.ySpeed = ySpeed;
     }
     public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
     }
        public float[] getSpeed(){
            float[] speed = new float[2];
            speed[0]= this.xSpeed;
            speed[1]= this.ySpeed;
            return speed;
        }
        public MovablePoint move(){
            setX(getX() + xSpeed);
            setY(getY() + ySpeed);
            return this;
        }
        public String toString(){
            return "("+getX()+","+getY()+"), speed = ("+xSpeed+","+ySpeed+")";
        }
        
    
    
}
