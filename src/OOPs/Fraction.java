package OOPs;

import static BasicJava.Recursion.gcd_lcm.gcd;

public class Fraction {
    int numerator;
    int denominetor;
    public Fraction(int num,int den){
        if (den==0) return;
        this.numerator=num;
        this.denominetor=den;
        simplify();

    } // Simplify the fraction
    private void simplify() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominetor));
        numerator /= gcd;
        denominetor /= gcd;

        // Handle negative denominators (e.g., 1/-2 -> -1/2)
        if (denominetor < 0) {
            numerator *= -1;
            denominetor *= -1;
        }
    }

    // Add another fraction and return a new simplified fraction
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominetor + other.numerator * this.denominetor;
        int newDenominator = this.denominetor * other.denominetor;
        return new Fraction(newNumerator, newDenominator);
    }

    // Subtract another fraction and return a new simplified fraction
    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominetor - other.numerator * this.denominetor;
        int newDenominator = this.denominetor * other.denominetor;
        return new Fraction(newNumerator, newDenominator);
    }

    // To display the fraction nicely
    public String toString() {
        if (denominetor == 1) return numerator + "";  // e.g., 4/1 → 4
        return numerator + "/" + denominetor;
    }


    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 3);

        Fraction sum = f1.add(f2);
        Fraction diff = f1.subtract(f2);

        System.out.println("f1 + f2 = " + sum);
        System.out.println("f1 - f2 = " + diff);
    }
}