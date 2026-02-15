package OOPS;
import java.util.Arrays;
public class Marks {
    public static class Data{
        String name;
        int roll;
//        int Pmarks;
//        int Mmarks;
//        int Cmarks;
        int[] marks;
        Data(int[] s){
            // marks = s; // when we pass like this it goes the sallow copy of the array . sallow means when we change the array the arr which we created it is changed
            marks = Arrays.copyOf(s,s.length);

        }

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Data d = new Data(arr);
        Data d1 = new Data(arr);
        d.marks[0]=40; // It change the arr . Because when we chnage this

//        d.marks[0]=79;
//        d.marks[1]=90;
//        d.marks[2]=80;
//        d1.marks[0]=79;
//        d1.marks[1]=90;
        System.out.println(arr[0]);
        System.out.println(d.marks[0]); // it give 40 .
        System.out.println(d.marks[1]);
    }
}
