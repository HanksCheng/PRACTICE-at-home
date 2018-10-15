import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A=scn.nextInt();
        int B=scn.nextInt();
        int C=scn.nextInt();
        System.out.println(Math.max(Math.max(A,B),C));
        System.out.println(Math.min(Math.min(A,B),C));
    }
}
