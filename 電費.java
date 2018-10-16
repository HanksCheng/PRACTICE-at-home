import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int DO=scn.nextInt();
        float sm,nsm;
        if (DO<=120){
            sm=DO*2.10f;
            nsm=DO*2.10f;
        }else if (DO<=330){
            sm=120*2.10f+(DO-120)*3.02f;
            nsm=120*2.10f+(DO-120)*2.68f;
        }else if (DO<=500){
            sm=120*2.10f+210*3.02f+(DO-330)*4.39f;
            nsm=120*2.10f+210*2.68f+(DO-330)*3.61f;
        }else if (DO<=700){
            sm=120*2.10f+210*3.02f+170*4.39f+(DO-500)*4.97f;
            nsm=120*2.10f+210*2.68f+170*3.61f+(DO-500)*4.01f;
        }else {
            sm=120*2.10f+210*3.02f+170*4.39f+200*4.97f+(DO-700)*5.63f;
            nsm=120*2.10f+210*2.68f+170*3.61f+200*4.01f+(DO-700)*4.50f;
        }
        System.out.println(sm);
        System.out.println(nsm);
    }
}
