public class Main {



    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 3 || n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i < Math.sqrt(n)+1; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}