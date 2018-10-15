import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String ch=scn.next();
        int v=Integer.valueOf(ch,16);
        System.out.println((char)v);
    }
}
