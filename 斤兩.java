import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        float a1=scn.nextInt();
        float ans=a1/600f;
        float Ans=Math.round(ans*10.0)/10.0f;
        System.out.println(Ans);
    }
}
