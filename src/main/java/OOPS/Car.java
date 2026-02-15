package OOPS;

public class Car {
        public static class Cars{
            String name;
            int price;
            Cars(String name, int price){
                this.name = name;
                this.price= price;

            }
        }

    public static void main(String[] args) {
        Cars c=new Cars("alto",40000);
    }
}
