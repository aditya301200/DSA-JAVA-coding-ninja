package createFractionClass;
public class Fraction {
    private int numerator;
    int denominator;
    public Fraction(int numerator, int denominator){ // constructor
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }
    public void print(){
        System.out.println(numerator+"/"+denominator);
    }
    public void increment(){ // it will increment the fraction by 1
        numerator = numerator + denominator;
        simplify();
    }
    private void simplify(){ // it will simplify the fraction
        int gcd = 1;
        int smaller = Math.min(numerator,denominator);
        for(int i=2; i<=smaller; i++){
            if(numerator%i==0 && denominator%i==0){
                gcd = i;
            }
        }
        this.numerator = numerator/gcd;
        this.denominator = denominator/gcd;
    }
    public void add(Fraction f){ // it is non-static func that means it belongs to this object not the class
        // First fraction is the fraction on which function is called
        // Second fraction is passed as argument
        this.numerator = this.numerator * f.denominator + this.denominator*f.numerator;
        this.denominator = this.denominator * f.denominator;
        simplify();
    }
    // this add function return new object
    public static Fraction add(Fraction f1, Fraction f2){
        int newNumerator = f1.numerator * f2.denominator + f1.denominator*f2.numerator;
        int newDenominator = f1.denominator*f2.denominator;
        return new Fraction(newNumerator, newDenominator);
    }
}
