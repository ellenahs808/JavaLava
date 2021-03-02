package miniprojects;
import java.util.ArrayList;

public class PrimeDirective {
    public boolean isPrime(int number) { //isPrime method that takes in a number and returns a boolean
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


    public ArrayList<Integer> onlyPrimes(int[] numbers) { //onlyPrimes method that takes in an array and returns an ArrayList<Integer>
//        ArrayList<Integer> primes = new ArrayList<Integer>();  //instantiate a new ArrayList called primes
        ArrayList<Integer> primes = new ArrayList<>(); // can also write it this way where you dont have to put explicit value of ArrayList when you instantiate

        for (int number : numbers) { // "for each number in numbers" - this is iterating through an array
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }


    public static void main(String[] args) {
        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println(pd.isPrime(7)); //true
        System.out.println(pd.isPrime(28)); //false
        System.out.println(pd.isPrime(2)); //true
        System.out.println(pd.isPrime(0)); //false

        System.out.println(pd.onlyPrimes(numbers)); // [29, 11, 101, 43, 89]
    }
}
