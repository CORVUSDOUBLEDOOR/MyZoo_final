package MyZoo;

public class Chicken extends Poulty {
    public Chicken(){
        String move = "walking";
        String eat = "worm";
    }
    public Chicken(String name){
        this.name = name;
        Poulty.typeCount++;
    }
    public String eat(){
        return "worm";
    }
    public String move(){
        return "walking";
    }
    public String toString() {
        return super.toString() + " I have "+ o.getType() +"."+" I like " + move() + ". I eat " + eat();
    }
}
