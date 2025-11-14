package bai4cham3;

public class Point3d extends Point2d {
    private float z=0.0f ;

public Point3d(float x, float y, float z){
    super(x,y);
    this.z=z;
    }
public Point3d(){
    super();
    this.z=0.0f;
    }
    public float getZ(){
    return z;
    }
    public void setZ(float z){
        this.z=z;
        }
    public void setXYZ (float x, float y, float z){
        super.setXY(x,y);
        this.z=z;
        }
    public float[] getXYZ(){
        float[] arr = new float[3];
        arr[0]=super.getX();
        arr[1]=super.getY();   
        arr[2]=z;
        return arr;
        }
    public String toString(){
        return "("+super.getX()+","+super.getY()+","+z+")";
        }

    
}
