package numbers;

import java.util.Scanner;

public class Que6 {
    public static boolean isPrime(int num){
        if(num<=1){return false;}
        else{
            for(int i=2;i<=num/2;i++){
                if(num%i==0)return false;
            }
        }

        return true;
    }
    public static void main(String... args){
        System.out.println("input num to find sum of all prime below num");
        Scanner sc = new Scanner(System.in);

        int num=sc.nextInt();
        int sum=0;
        for (int i=1;i<num;i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
