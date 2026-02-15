package OOPS;

import java.util.Scanner;

public class User {

    public static class Student{
         String name;
        int roll;
        double gpa;
        void print(){
            System.out.println(name);
            System.out.println(roll);
            System.out.println(gpa);
        }
    }

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        Student s1= new Student();
        Student s2= new Student();

        s1.name=sc.next();
        s1.roll=sc.nextInt();
        s1.gpa=sc.nextDouble();

        s2.name="shardha";
        s2.roll= 404;
        s2.gpa=4.5;
        s1.print();
        s2.print();
        System.out.print(s1.name +"  " + s1.roll+"  " + s1.gpa);

    }
}
