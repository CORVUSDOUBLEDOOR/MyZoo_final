package MyZoo;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        Animal[] animal = new Animal[n];
        for (int i = 0; i < n; i++) {
            String type = kb.next();
            String name = kb.next();
            if(type.equalsIgnoreCase("Duck")){
                animal[i] = new Duck(name);
            }else if(type.equalsIgnoreCase("Chicken")){
                animal[i] = new Chicken(name);
            }else if(type.equalsIgnoreCase("Parry")){
                animal[i] = new Parry(name);
            }else if(type.equalsIgnoreCase("Shark")){
                animal[i] = new Shark(name);
            }else if(type.equalsIgnoreCase("Dolphin")){
                animal[i] = new Dolphin(name);
            }else if(type.equalsIgnoreCase("Ray")){
                animal[i] = new Ray(name);
            }
        }
        for(int i = 0; i < n ; i++){
            System.out.println(animal[i].toString());
        }
        System.out.println("The number of Poulty "+Poulty.typeCount);
        System.out.println("The number of Fish "+Fish.typeCount);
    }
}
