package OOPS;

public class RevisionOops {
    public static class Pokemon{
        int hp;
        int attack;
        String type;
        String name;
        Pokemon(String type, int attack){
            this.type=type;
            this.attack=attack;
        }
    }
    public static void main(String[] args) {
        Pokemon p1 =new Pokemon("Electric",78);

        Pokemon p2 =new Pokemon("Fairy",90);
    }
}
