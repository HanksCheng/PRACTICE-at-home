import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int h=scn.nextInt();
        int sex=scn.nextInt();
        if (sex==1){
            float a=(h-80)*0.7f;
            System.out.println(Math.round(a*10.0)/10.0);
        }else{
            float b=(h-70)*0.6f;
            System.out.println(Math.round(b*10.0)/10.0);
        }
    }
}
