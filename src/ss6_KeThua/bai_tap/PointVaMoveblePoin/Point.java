package ss6_KeThua.bai_tap.PointVaMoveblePoin;

public class Point {
    public float x=0.0f;
    public float y=0.0f;

    Point(){
    }
    Point(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float arr[]={x,y};
        return arr;
    }

    @Override
    public String toString() {
        return "(x,y): "+x+" "+y;
    }

    public static void main(String[] args) {
        Point point=new Point();
        System.out.println(point);
        point=new Point(1,3);
        System.out.println(point);
        float a[]=point.getXY();
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }


    }
}
