package org.example.largedecimal;

import java.math.BigDecimal;

public class LargeDecimal {

    public static void main(String[] args) {
        bd();
    }

    static void bd() {
        double x = 0.03;
        double y = 0.04;
        double ans = y - x;
        System.out.println(ans);

        BigDecimal A =  new BigDecimal("0.03");
        BigDecimal B =  new BigDecimal("0.04");
        BigDecimal ANS = B.subtract(A);
        System.out.println(ANS);

        BigDecimal bd1 =  new BigDecimal("2367327327.0237823783");
        BigDecimal bd2 =  new BigDecimal("32676372732.2367736274");
        System.out.println(bd1.max(bd2));
        System.out.println((bd2.compareTo(bd1)));

    }

}
