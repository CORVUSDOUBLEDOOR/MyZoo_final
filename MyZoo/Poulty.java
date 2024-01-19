package MyZoo;

public class Poulty extends Animal{
    private String my_type = "Poultry";
    public static int typeCount = 0;
    public Poulty(){
        name = "Poultry";
        o.setType("wing");
    }
    public Poulty(String name){
        this.name = name;
        o.setType("wing");
        typeCount++;
    }
    public String toString() {
        return "Hello, my name is " + name + ". I am a Poultry.";
    }
}
