package MyZoo;

public class Animal {
    protected String name;
    protected Organ o;
    public Animal(){
        name = "unknow";
        this.o = new Organ();
    }
    public Animal(Organ o, String name){
        o = new Organ();
        this.name = name;
    }
    public String toString(){
        return "Hello my name is " + name + ".";
    }
}
