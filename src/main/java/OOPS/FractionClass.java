package OOPS;
class fraction {

    int num;
    int den;
    fraction(int num,int den){
        this.num = num;
        this.den= den;
        simplify();
    }

    void print(){
        System.out.println(num+"/"+den);
    }

    void add(fraction f){
        num = (num*f.den) + (f.num*den);
        den = den*f.den;
    }
    void mul(fraction f){
        num= num * f.num;
        den=den * f.den;
    }
    void divied(fraction f){
        num= num * f.den;
        num= num * f.num;
    }
    void simplify(){
        int gcd = hcf(num,den);
        num= num/gcd;
        den= den/gcd;

    }
    int hcf(int a,int b){
        if(a==0) return b;
        return hcf(b%a,a);
    }

}
public class FractionClass {
    public static void main(String[] args) {
        fraction num1=new fraction(1,4);
        fraction num2=new fraction(4,1);
        //num1.print();
        //num1.add(num2);
        num1.print();
        //um1.mul(num2);
        num1.divied(num2);
        num1.simplify();
        num1.print();
    }
}
