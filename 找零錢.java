import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int a1=scn.nextInt();
        int a2=scn.nextInt();
        int a3=scn.nextInt();
        int r1=n-a1*15-a2*20-a3*30;
        int fifty=r1/50;
        int r2=r1%50;
        int five=r2/5;
        int r3=r2%5;
        int one=r3;
        if (n<a1*15+a2*20+a3*30){
            System.out.println(0);
        }else{
            System.out.println(one);
            System.out.println(five);
            System.out.println(fifty);
        }

    }
}
