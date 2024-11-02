package numbers;

public class Que13 {
    private static int rev(int num){
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num/=10;
        }
        return rev;
    }

    public static void main(String... args){
        int num=1001;
        System.out.println("rev of "+num+" :  "+rev(num));
    }

}
