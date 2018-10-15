import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int X=scn.nextInt();
        int Y=scn.nextInt();
        int a=X*X+Y*Y;
        if (a<100*100+100*100){
            System.out.println("inside");
        }else{
            System.out.println("outside");
        }
    }
}
