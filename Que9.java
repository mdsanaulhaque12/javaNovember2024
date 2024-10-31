package numbers;

public class Que9 {
    private static boolean isPalindrome(int num){
        int num2=num;
        int rev=0;
        while(num2!=0){
            rev=rev*10+(num2%10);
            num2/=10;
        }
        if(rev==num)return true;
        return false;
    }

    public static void main(String... args){
            for (int i=1;i<=1000;i++){
                if(isPalindrome(i)){
                    System.out.println(i+" is palindrome");
                }
            }
    }
}
