package ca.teletact.multimedia;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest01 {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Horse("Mr. Ed"));
        animals.add(new Cow("Mavis"));
        animals.add(new Goat("Billy"));
        animals.add(new Horse("Starbuck"));
        animals.add(new Cow("Edna"));
        animals.add(new Goat("Lucifer"));

        for(Animal ani : animals){
            System.out.println(ani.name+" "+ani.eat());
        }

    }
}
