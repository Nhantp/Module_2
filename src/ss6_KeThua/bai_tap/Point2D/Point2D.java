package ss6_KeThua.bai_tap.Point2D;

public class Point2D {
    public float x=0.0f;
    public float y=0.0f;

    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }
    public Point2D(){
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
    public float[] getXY(){
        float arr[]={x,y};
        return arr;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "(x,y): " +x+"   "+y;
    }

    public static void main(String[] args) {
        Point2D point2D=new Point2D();

        Point2D point2D1=new Point2D(1,4);

        Point2D point2D2=new Point2D(3,5);
        float array[]=point2D.getXY();
        Point2D[] point2DS = new Point2D[3];
        point2DS[0] = point2D;
        point2DS[1] = point2D1;
        point2DS[2] = point2D2;

        for (int i=0; i<point2DS.length; i++){
            System.out.print(point2DS[i]+" ");
        }
    }
}

