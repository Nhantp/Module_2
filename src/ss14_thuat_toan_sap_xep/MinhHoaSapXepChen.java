package ss14_thuat_toan_sap_xep;

public class MinhHoaSapXepChen {
    public static void main(String[] args) {
        int[] array= {1,4,5,6,2,8,9,7};
        int pos,x;
        for (int i=0; i<array.length; i++){
            x=array[i];
            pos=i;
            while (pos>0&&x<array[pos-1]){
                array[pos]=array[pos-1];
                pos--;
            }
            array[pos]=x;
        }
            for (int j : array) {
            System.out.println(j);
        }
    }
}
