package numbers;

public class Que5 {
    public static void main(String... args){

        int num =2;
        boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        }else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                        isPrime = false;
                        break;
                }
            }
        }
        System.out.println(isPrime);
    }

}

