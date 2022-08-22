package ss6_KeThua.bai_tap.PointVaMoveblePoin;

public class MovablePoint extends Point{
    float xSpeed=0.0f;
    float ySpeed=0.0f;
    public MovablePoint(){
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float arr[]={xSpeed,ySpeed};
        return arr;
    }

    @Override
    public String toString() {
        return "(x,y),speed(xs,ys):"+x+" "+y+" , "+xSpeed+" "+ySpeed;
    }
    MovablePoint move(){
        x+=xSpeed;
        y+=ySpeed;
        return this;
    }
    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint();
        System.out.println(movablePoint);
        movablePoint=new MovablePoint(1,2,3,4);
        System.out.println(movablePoint);
        movablePoint.move();
        float arr[]=movablePoint.getSpeed();
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
