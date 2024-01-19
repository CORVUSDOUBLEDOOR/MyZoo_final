package MyZoo;

public class Fish extends Animal{
    private String my_type = "fish";
    public static int typeCount = 0;
    Fish(){
        my_type = "fish";
        o.setType("fin");
    }
    Fish(String name){
        this.name = name;
        o.setType("fin");
        typeCount++;
    }
    public String toString() {
        return "Hello, my name is " + name + ". I am a fish.";
    }
}
