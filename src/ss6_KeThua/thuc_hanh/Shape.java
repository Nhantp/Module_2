package ss6_KeThua.thuc_hanh;

public class Shape {
    private String color="Green";
    private boolean filled=true;

    public Shape(){
    }
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public static void main(String[] args) {
        Shape shape =new Shape();
        System.out.println(shape);
        shape=new Shape("Red",false);
        System.out.println(shape);
    }
}
