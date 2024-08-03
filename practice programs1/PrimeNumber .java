public class PrimeNumber {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[1000000];

        for (int i = 0; i < arr.length; i++) {
            if (isprime(arr[i])) {
                System.out.println(arr[i] + " is prime number");
            } else {
                System.out.println(arr[i] + " is not a prime number");
            }
        }

        int primeCount = countPrimes(arr);
        System.out.println( + primeCount);
    }

    private static boolean isprime(int n) {
        if (n ==0|| n==1) {
            return false;
        }
        for (int i = 2;i <= Math.sqrt(n);i++) {
            if (n%i== 0) {
                return false;
            }
        }
        return true;
    }
     private static int countPrimes(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isprime(num)) {
                count++;
            }
        }
        return count;
    }
}

      
                
