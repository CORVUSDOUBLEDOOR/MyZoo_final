package MyZoo;

public class Ray extends Fish{
    public Ray(){
        String move = "hover swimming";
        String eat = "seaweed";
    }
    public Ray(String name){
        this.name = name;
        Fish.typeCount++;
    }
    public String eat(){
        return "seaweed";
    }
    public String move (){
        return "hover swimming";
    }
    public String toString() {
        return super.toString() + " I have "+ o.getType() +". I like " + move() + ". I eat " + eat();
    }
}
