package numbers;

public class Que14 {
    public static void main(String... args){

        int a=12;
        int b=50;

        int s=a>b?b:a;
        System.out.println("small "+s);

        outer:
        for(int i=s;i>0;i--){
            if(a%i==0 && b%i==0){
                System.out.println(i +" is gcd of "+a+" and "+b);
                break outer;
            }
        }
    }
}
