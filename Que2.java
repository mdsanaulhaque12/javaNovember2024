package numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que2 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.MIN_VALUE;
        try{
            n=Integer.parseInt(br.readLine());
        }catch(IOException e ){

        }catch(NumberFormatException e){

        }

        for(int i=n;i>0;i--){
            System.out.print(i+" ");
        }
    }
}
