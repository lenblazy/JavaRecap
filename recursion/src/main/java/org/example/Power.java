package org.example;

public class Power {

    public static void main(String[] args) { //O(log b) log base times
        int base = 3;
        int power = 6;

        int ans = 1;
        Math.pow(base, power);

        while (power > 0) {
            if ((power & 1) == 1) {
                ans *= base;
            }

            base *= base;
            power = power >> 1;
        }
        System.out.println(ans);
    }

}
