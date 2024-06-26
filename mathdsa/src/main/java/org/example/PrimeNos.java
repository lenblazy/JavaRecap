package org.example;

// T(C) = O(n * sqrt(n))
public class PrimeNos {

    public static void main(String[] args) {
        int n = 40;
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " " + isPrime(i));
        }
    }// T(C) = O((n))

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

}// T(C) = O(sqrt(n))