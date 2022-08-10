package ss3_mang_va_phuong_thuc.bai_tap;

public class tron_mang {
    public static void main(String[] args) {
        int[] array1={1,2,5,6,8};
        int[] array2={4,5,7,8,42,56};
        int len1=array1.length;
        int len2=array2.length;
        int[] array=new int[len1+len2];
        int index=0;

        System.out.println("Mang 1 la:");
        for (int i=0; i<array1.length; i++){
            System.out.print(" "+array1[i]);
            array[index]=array1[i];
            index++;
        }
        System.out.println("\nMang 2 la");
        for(int i=0; i<array2.length;i++){
            System.out.print(" "+array2[i]);
            array[index]=array2[i];
            index++;
        }

        System.out.println("\nMang sau khi tron la:");
        for (int i=0; i<array.length; i++){
            System.out.print(" "+array[i]);
        }
    }
}
