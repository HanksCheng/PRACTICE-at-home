import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        float l=scn.nextInt();
        float ans=l*0.26418f;
        float Ans=Math.round(ans*10.0)/10.0f;
        System.out.println(Ans);
    }
}
