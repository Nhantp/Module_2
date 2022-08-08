package ss1_introduction_to_java.bai_tap;
import java.util.Scanner;
public class Doc_so_thanh_chu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so can chuyen doi:");
        int number=scanner.nextInt();
        int tram=number/100;
        int chuc=(number%100)/10;
        int donvi=(number%100)%10;
        switch (tram){
            case 1:{
                System.out.print("one hundred ");
                break;
            }
            case 2:{

                System.out.print("two hundred ");
                break;
            }

            case 3:{
                System.out.print("three hundred ");
                break;
            }

            case 4:{
                System.out.print("four hundred ");
                break;
            }

            case 5:{
                System.out.print("five hundred ");
                break;
            }
            case 6:{
                System.out.println("six hundred ");
                break;
            }
            case 7:{
                System.out.println("seven hundred ");
                break;
            }
            case 8:{
                System.out.println("eight hundred ");
                break;
            }
            case 9:{
                System.out.println("nine hundred ");
                break;
            }
            default:
                System.out.println(" ");
        }
        switch (chuc){
            case 1:{
                switch (donvi){
                    case 0:
                        System.out.print("ten");
                        break;
                    case 1:
                        System.out.print("eleven");
                        break;
                    case 2:
                        System.out.print("twelve");
                        break;
                    case 3:
                        System.out.print("thirteen");
                        break;
                    case 4:
                        System.out.print("fourteen");
                        break;
                    case 5:
                        System.out.print("fifteen");
                        break;
                    case 6:
                        System.out.print("sixteen");
                        break;
                    case 7:
                        System.out.print("seventeen");
                        break;
                    case 8:
                        System.out.print("eighteen");
                        break;
                    case 9:
                        System.out.print("nineteen");
                        break;
                }
                break;
            }
            case 2:{

                System.out.print("twenty ");
                break;
            }
            case 3:{
                System.out.print("thirty ");
                break;
            }
            case 4:{
                System.out.print("forty ");
                break;
            }
            case 5:{
                System.out.print("fifty ");
                break;
            }
            case 6:{
                System.out.println("sixty ");
                break;
            }
            case 7:{
                System.out.println("seventy ");
                break;
            }
            case 8:{
                System.out.println("eighty ");
                break;
            }
            case 9:{
                System.out.println("ninety ");
                break;
            }
            default:
                System.out.println(" ");
        }
        switch (donvi){
            case 1:{
                if(chuc==1){
                    System.out.println("");
                    break;
                }else{
                    System.out.println("one");
                    break;
                    }
            }
            case 2:{
                if(chuc==1){
                    System.out.println("");
                    break;
                }else {
                    System.out.println("two");
                    break;
                }
            }
            case 3:{
                if(chuc==1){
                    System.out.println("");
                    break;
                }else {
                    System.out.println("three");
                    break;
                }
            }
            case 4:{
                if(chuc==1){
                    System.out.println("");
                    break;
                }else {
                    System.out.println("four");
                    break;
                }
            }
            case 5:{
                if(chuc==1){
                    System.out.println("");
                    break;
                }else {
                    System.out.println("five");
                    break;
                }
            }
            case 6:{
                if(chuc==1){
                    System.out.println("");
                    break;
                }else {
                    System.out.println("six");
                    break;
                }
            }
            case 7:{
                if(chuc==1){
                    System.out.println("");
                    break;
                }else {
                    System.out.println("seven");
                    break;
                }
            }
            case 8:{
                if(chuc==1){
                    System.out.println("");
                    break;
                }else {
                    System.out.println("eight");
                    break;
                }
            }
            case 9:{
                if(chuc==1){
                    System.out.println("");
                    break;
                }else {
                    System.out.println("nine");
                    break;
                }
            }
            default:
                System.out.println(" ");
        }
    }
}
