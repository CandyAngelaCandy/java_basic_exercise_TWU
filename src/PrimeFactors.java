import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public List<Integer> printPrimeFactors(int number) {
        List<Integer> primeFactors = new ArrayList<Integer>();
        for (int i = 2; i < number; i++) {
            if (isPrime(i) && number % i == 0) {
                primeFactors.add(i);
            }
        }
        System.out.println(primeFactors);
        return primeFactors;
    }

    public boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
