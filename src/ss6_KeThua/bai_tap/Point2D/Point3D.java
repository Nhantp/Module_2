package ss6_KeThua.bai_tap.Point2D;

public class Point3D extends Point2D{
    public float z=0.0f;
    Point3D(){
    }
    Point3D(float x, float y, float z){
        super(x,y);
        this.z=z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }
    public float[] getXYZ(){
        float a[]={x,y,z};
        return a;
    }
    public void setXYZ(float x, float y, float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    @Override
    public String toString() {
        return "(x,y,z)"+x+" "+y+" "+z;
    }

    public static void main(String[] args) {
        Point3D point3D= new Point3D();
        System.out.println(point3D);

        point3D=new Point3D(1,2,3);
        System.out.println(point3D);

        float array[]= point3D.getXYZ();
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
