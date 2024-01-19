package MyZoo;

public class Dolphin extends Fish{
    public Dolphin(){
        String move = "circulate swimming";
        String eat = "plankton";
    }
    public Dolphin(String name){
        this.name = name;
        Fish.typeCount++;
    }
    public String eat(){
        return "plankton";
    }
    public String move (){
        return "circulate swimming";
    }
    public String toString() {
        return super.toString() + " I have "+ o.getType() +". I like " + move() + ". I eat " + eat();
    }
}
