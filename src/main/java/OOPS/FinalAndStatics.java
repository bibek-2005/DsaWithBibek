package OOPS;
class Cricketer{
    final String country= "India";
    int runs ;
    String name;
    double avg;


}

public class FinalAndStatics {
    public static void main(String[] args) {
        Cricketer cr=new Cricketer();
        //cr.country = "England"; Error

        System.out.println(cr.country);

    }
}
