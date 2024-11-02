package numbers;

public class Que11 {
    private static long fact(long n){
        if(n==1||n==0)return 1;
        return n* fact(n-1);
    }

    private static boolean isStrong(int n){
        int num=n;
        long sum=0;

        while(num!=0){
            int digit =num%10;
            sum=sum+(fact(digit));
            num=num/10;
        }
        if(sum==n)return true;
        return false;
    }
    public static void main(String... args){
        int num=145;
        System.out.println(num+"number is strong "+isStrong(num));
    }
}
