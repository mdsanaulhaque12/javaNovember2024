package numbers;

public class Que12 {
    private static void fib(int n){
        int first=0;
        int sec=1;
        int next=0;
        System.out.println(first);
        System.out.println(sec);
        for (int i=1;i<n;i++){
           next =first+sec;
           System.out.println(next);
           first=sec;
           sec=next;
        }
    }
    public static void main(String... args){
        fib(10);
    }
}
