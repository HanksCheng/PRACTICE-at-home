import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        float mile=scn.nextFloat();
        float ANS=mile*1.6f;
        float ans=Math.round(ANS*100.0)/100.0f;
        System.out.println(ans);
    }
}
