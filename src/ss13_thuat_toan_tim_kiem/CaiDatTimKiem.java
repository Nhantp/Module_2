package ss13_thuat_toan_tim_kiem;
import java.util.Scanner;

public class CaiDatTimKiem {
    Scanner scanner =new Scanner(System.in);
    public void input(int[]array,int n){
        for (int i=0; i<n; i++){
            System.out.println("Nhap vao phan tu "+(i+1)+": ");
            array[i]=scanner.nextInt();

        }
    }

    int tmp;
    public void sort(int[] array,int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }
    public void display(int[] array,int n){
        System.out.println("Phan tu da nhap la: ");
        for (int i : array) {
            System.out.println(i);
        }
    }
    public double binarySearch(int[] array, int left, int right, int value){
        while (left<=right){
            int middle= (left+right)/2;
            if(array[middle]==value){
                return middle;
            } else if (value>array[middle]) {
                left=middle+1;
            }else {
                right=middle-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu:");
        int n=scanner.nextInt() ;
        int[] array=new int[n];
        CaiDatTimKiem caiDatTimKiem=new CaiDatTimKiem();
        caiDatTimKiem.input(array,n);
        caiDatTimKiem.sort(array,n);
        caiDatTimKiem.display(array,n);
        System.out.println(caiDatTimKiem.binarySearch(array, 0, array.length, 3));
    }
}
