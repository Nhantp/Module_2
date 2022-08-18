package ss4_lop_va_doi_tuong.thuc_hanh;

public class Rectangle {
    double width, height;
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getPrimeter(){
        return (this.width+this.height)*2;
    }
    public String display(){
        return "Retangle{Width:"+width+"Height:"+height+"}";
    }
}
