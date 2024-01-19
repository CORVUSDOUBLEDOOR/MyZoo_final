package MyZoo;

public class Parry extends  Poulty{
    public Parry(){
        String move = "speaking";
        String eat = "bean";
    }
    public Parry(String name){
        this.name = name;
        Poulty.typeCount++;
    }
    public String eat(){
        return "bean";
    }
    public String move (){
        return "speaking";
    }
    public String toString() {
        return super.toString() + " I have "+ o.getType() +"."+" I like " + move() + ". I eat " + eat();
    }
}
