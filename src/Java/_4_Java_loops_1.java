package Java;

import java.util.Scanner;

public class _4_Java_loops_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=10; i++)
        {
            int result=n*i;
            System.out.println(n+" x "+i+" = "+result);
        }
    }
}
