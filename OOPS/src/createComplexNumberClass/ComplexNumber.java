package createComplexNumberClass;

public class ComplexNumber {
    int real;
    int imaginary;
    public ComplexNumber(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public void print(){
        System.out.println(real+" + i "+imaginary);
    }
    public void setReal(int real){
        this.real = real;
    }
    public void setImaginary(int n){
        this.imaginary = n;
    }
    public void add(ComplexNumber c){
        this.real = this.real + c.real;
        this.imaginary = this.imaginary + c.imaginary;
    }
    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2){
        int newReal = c1.real + c2.real;
        int newImaginary = c1.imaginary + c2.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }
    public void multiply(ComplexNumber c){
        int first = this.real * c.real;
        int second = this.imaginary * c.real;
        int third = this.real * c.imaginary;
        int last = this.imaginary * c.imaginary;
        System.out.println(first+" + i "+second+" + i "+third+" - "+last);
    }
}
