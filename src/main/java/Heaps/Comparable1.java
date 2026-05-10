package Heaps;

import java.sql.Array;
import java.util.Arrays;

class Student implements Comparable<Student> {
    String name;
    int roll;
    double gpa;
    public Student(String name, int roll, double gpa){
        this.name = name;
        this.roll = roll;
        this.gpa = gpa;

    }
    public int compareTo(Student s){
        return Double.compare(this.gpa, s.gpa);

    }

}
public class Comparable1 {
    public static void main(String[] args){
        Student s1= new Student("bibek",15,7.8);
        Student s2 = new Student("Shardha",14,8.9);
        //System.out.println(s1.name+" "+s1.roll+" "+s1.gpa);
        Student[] arr = {s1,s2};
        for(Student s:arr){
            System.out.println(s.name+" "+s.roll+" "+s.gpa);
        }
        Arrays.sort(arr);
        System.out.println("After sorting ");
        for(Student s:arr){

            System.out.println(s.name+" "+s.roll+" "+s.gpa);
        }
    }

}

