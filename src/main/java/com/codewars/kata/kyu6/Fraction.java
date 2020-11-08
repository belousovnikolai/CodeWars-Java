package com.codewars.kata.kyu6;

/*
** https://www.codewars.com/kata/572bbd7c72a38bd878000a73
*/

public class Fraction implements Comparable<Fraction> {

    private final long top;
    private final long bottom;

    public Fraction(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() { return 17 * Long.hashCode(top) + Long.hashCode(bottom); }

    @Override
    public boolean equals(Object o) { return compareTo((Fraction)o) == 0; }

    @Override
    public int compareTo(Fraction f2){ return Long.compare(top * f2.bottom, f2.top * bottom); }
    
    public Fraction add(Fraction f2) {
        long t = (top * f2.bottom) + (f2.top * bottom);
        long b = bottom * f2.bottom;
        long commonDivisor = gcd(t, b);

        return new Fraction(t/commonDivisor, b/commonDivisor);
    }

    private long gcd(long a, long b) {
        while (b > 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    @Override
    public String toString() {
        return top + "/" + bottom;
    }
}
