package OOPS;
class Students{
    String name;
    private int rool;
    double gpa;

    private void print(){
        System.out.println(rool);
    }
    int get(){
        return rool;
    }
    int set(int x){
        return x;
    }
}
public class Student {
    public static void main(String[] args) {
    Students s1 = new Students();
        System.out.println(s1.name); // String by defult give the null value
        System.out.println((s1.gpa)); //double by default give 0.0
        // we can not access the private variables

        // But by the help of public method which is present inside that class we can accsee this
        //s1.print(); if we make the method to private then we can't acces that method too. so we need to craete a gatter method to get the value of private variable

        System.out.println(s1.get()); // this the gatter method

        System.out.println(s1.set(23)); // by using the satter method we can change the value of the private class



    }
}
