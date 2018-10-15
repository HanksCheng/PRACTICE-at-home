import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int y=scn.nextInt();
        if (y%400==0){
            System.out.println("Bissextile Year");
        }else if (y%100==0){
            System.out.println("Common Year");
        }else if (y%4==0){
            System.out.println("Bissextile Year");
        }else {
            System.out.println("Common Year");
        }
    }
}
