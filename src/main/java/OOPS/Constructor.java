package OOPS;

public class Constructor{
    public static class Car{
        int seats; // 0
        String name;// null
        double length;//0.0

        Car(){
            // default Constructor
        }
        Car(int x,String n,double l){
        seats = x; name = n; length = l;
        // Constructor Over loading .there is two constructor with different parameter order
        }
        Car(String n,int x,double l){
            seats = x; name = n; length = l;
        }
        void print(){
            System.out.println(seats + " "+ name + " " + length);
        }
    }

    public static void main(String[] args) {
        Car c = new Car(5,"kia_sonoto",7.8);
        c.print();
        Car c1 = new Car("Load alto",4,7.6);
        c1.print();
        Car c3 = new Car();
        c3.name="bibek";

    }
}
