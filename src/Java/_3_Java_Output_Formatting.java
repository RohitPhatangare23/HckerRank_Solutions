package Java;

import java.util.Scanner;

public class _3_Java_Output_Formatting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("======================");
        for (int i=0;i<3;i++){
            String s=input.next();
            int n=input.nextInt();
            System.out.printf("%-15s",s);
            System.out.printf("%03d%n",n);

        }
        System.out.println("======================");
    }
}
