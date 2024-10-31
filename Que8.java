package numbers;

// perfect numbers whose sum of its proper divisor is equal to number .
public class Que8 {
    private static boolean isPerfect(int num){
        int sum=0;

        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num)return true;
        return false;
    }
    public static void main(String... args){

        int num=1000;
        for(int i=1;i<num;i++){
            if(isPerfect(i)){
                System.out.println(i);
            }
        }
    }
}
