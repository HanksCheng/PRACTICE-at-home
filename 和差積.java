import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int a1=n1+n2;
        int a2=n1*n2;
        int a3=n1-n2;
        int a4=n1/n2;
        int a5=n1%n2;
        System.out.println(n1+"+"+n2+"="+a1);
        System.out.println(n1+"*"+n2+"="+a2);
        System.out.println(n1+"-"+n2+"="+a3);
        System.out.println(n1+"/"+n2+"="+a4+"..."+a5);
    }
}
