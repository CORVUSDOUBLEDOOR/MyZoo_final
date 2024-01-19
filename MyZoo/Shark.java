package MyZoo;

public class Shark extends Fish{
    public Shark(){
        String move = "Straight swimming";
        String eat = "smallfish";
    }
    public Shark(String name){
        this.name = name;
        Fish.typeCount++;
    }
    public String eat(){
        return "smallfish";
    }
    public String move (){
        return "Staright swimming";
    }
    public String toString() {
        return super.toString() + " I have "+ o.getType() +". I like " + move() + ". I eat " + eat();
    }
}
