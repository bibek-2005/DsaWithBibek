package OOPS;

class Complex{
    int  real;
    int  imag;

    Complex(int x, int y){
        this.real = x;
        this.imag = y;
    }
    void print(){
        if(imag <0){
            System.out.println(this.real+" "+ this.imag+"i");
        }else {
            System.out.println(this.real + " + " +this.imag + "i");
        }
    }

    void add(Complex c2){
        this.real += c2.real;
        this.imag +=c2.imag;
        System.out.print("The addition is = " );print();
    }

    void sub(Complex c2){
        this.real -= c2.real;
        this.imag -= c2.imag;
        //real -=this.real;

        System.out.print("The Sub is = " );print();
    }
    void Mul(Complex c){
        int r = this.real;
        int i = this.imag;
        this.real = (c.real * r) - (c.imag * i);
        this.imag = (r * c.imag) + (i * c.real); //(a+bi)(c+di)=(ac−bd)+(ad+bc)i
        System.out.print("The Mul is = ");
        print();
    }



}


public class ComplexNumber {
    public static void main(String[] args) {

        Complex c1= new Complex(1,4);
        Complex c2= new Complex(2,-5);

        //c1.Mul(c2);

        //c1.print();
//        c2.print();
//
//        c1.sub(c2);
//
//        c1.print();
//        c2.print();
//
//        c1.add(c2);

        c1.print();
        c2.print();
        c1.Mul(c2);

    }
}
