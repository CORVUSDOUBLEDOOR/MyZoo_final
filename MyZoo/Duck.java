package MyZoo;

public class Duck extends Poulty{
    public Duck(){
    }
    public Duck(String name){
        this.name = name;
        o.setType("wing");
        Poulty.typeCount++;
    }
    public String eat(){
        return "rice";
    }
    public String move (){
        return "swimming";
    }
    public String toString() {
        return super.toString() + " I have "+ o.getType() +"."+" I like " + move() + ". I eat " + eat();
    }
}
