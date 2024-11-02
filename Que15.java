package numbers;

public class Que15 {

    private static void isPrimePalindrome(int num){
        int n=num;
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n/=10;
        }
        if(rev==num){
            System.out.println(num+ " is palindrome reverse of it isc"+rev);
            if(num==1||num==2){
                System.out.println("is is prime palindrome");
                return;
            }
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    System.out.println("num is not prime palindrome");
                    return;
                }
            }
            System.out.println("num is prime palindrome");
        }
        else System.out.println("not prime palindrom");
    }
    public static void main(String... args){
        isPrimePalindrome(929);
    }
}
