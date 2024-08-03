package org.example.largeinterger;

import java.math.BigDecimal;
import java.math.BigInteger;

public class LargeInteger {

    public static void main(String[] args) {
        BigInteger A = BigInteger.valueOf(5);
        BigInteger B = BigInteger.valueOf(6);

        BigInteger C = new BigInteger("243453435343433454");

        BigInteger S = BigInteger.TEN;

        BigInteger a = C.add(S);
        BigInteger m = C.multiply(S);
        BigInteger s = C.subtract(S);
        BigInteger d = C.divide(S);
        BigInteger rem = C.remainder(S);

        if (S.compareTo(C) < 0){
            System.out.println("yes");
        }
    }

    // calculate factorial of a very large number

}
