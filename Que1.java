package numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que1 {

    private static void print(int n){
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input upto number which you want to print");
        int n=Integer.MIN_VALUE;
        try {
            n = Integer.parseInt(br.readLine());
        }catch(IOException e){
        }catch (NumberFormatException e){
            System.out.println("input Integers only");
        }
        if(n>0) print(n);
        else System.out.println("other codes");

    }
}
