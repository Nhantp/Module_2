package ss3_mang_va_phuong_thuc.bai_tap;

public class tim_gia_tri_nho_nhat {
    public static void main(String[] args) {
        int[] array={4,5,6,2,3,6,1,75,32,25};
        System.out.println("Mang ban dau:");
        for(int i=0; i<array.length; i++){
            System.out.print(" "+array[i]);
        }
        int min=array[0];
        for (int i=0; i<array.length; i++){
            if(min>=array[i]){
                min=array[i];
            }
        }
        System.out.println("\nMin:"+min);

    }
}
