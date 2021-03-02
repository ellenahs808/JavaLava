package miniprojects;
import java.util.ArrayList;

public class PrimeDirective {
    public boolean isPrime(int number) {
        if (number == 2) {
            return true;
        } else if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println(pd.isPrime(7)); //true
        System.out.println(pd.isPrime(28)); //false
        System.out.println(pd.isPrime(2)); //true
        System.out.println(pd.isPrime(0)); //false
    }
}
