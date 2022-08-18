package ss4_lop_va_doi_tuong.bai_tap;

import org.omg.CORBA.WStringSeqHelper;

public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "Blue";

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
   public Fan(){
   }
   public Fan(int speed, boolean on, double radius, String color){
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.color=color;
   }

    public String toString() {
        String state="";
        if(this.on) {
            state+= "Speed: "+this.speed+" Color: "+this.color+" Radius:"+this.radius+"\n Fan is on.";
        }else {
            state+="Color: "+this.color+" Radius:"+this.radius+"\n Fan is off.";
        }
        return state;
    }

    public static void main(String[] args) {
        Fan fan=new Fan(3,true,10,"Yellow.");
        Fan fan1=new Fan(2,false,5,"Blue.");

        System.out.println("Fan 1: "+fan.toString());
        System.out.println("Fan 2: "+fan1.toString());
    }
}
