package numbers;

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args){
        System.out.println("input n");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for (int i=n;i<=0;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
