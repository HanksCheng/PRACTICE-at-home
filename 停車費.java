import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        Scanner b =new Scanner(System.in);
        int h1=a.nextInt();
        int m1=a.nextInt();
        int h2=b.nextInt();
        int m2=b.nextInt();
        int tm1=h1*60+m1;
        int tm2=h2*60+m2;
        int fm=tm2-tm1;
        if(fm<=120){
            System.out.println(fm/30*30);
        }
        else if(fm<=240&&fm>120){
            System.out.println(120+(fm-120)/30*40);
        }
        else{
            System.out.println(280+(fm-240)/30*60);
        }
    }
}