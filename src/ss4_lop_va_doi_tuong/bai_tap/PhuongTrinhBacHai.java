package ss4_lop_va_doi_tuong.bai_tap;
public class PhuongTrinhBacHai {
    double a,b,c,d;
    public PhuongTrinhBacHai(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return b*b-4*a*c;
    }
    public double getRoot1(){
        return (-b+Math.sqrt(b*b-4*a*c))/2*a;
    }
    public double getRoot2(){
        return  (-b-Math.sqrt(b*b-4*a*c))/2*a;
    }
    public double getRoot3(){
        return -b/2*a;
    }
}
