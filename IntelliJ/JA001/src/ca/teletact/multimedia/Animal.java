package ca.teletact.multimedia;

public class Animal {

    String name;

    Animal(){ this.name = "unnamed"; }
    Animal(String name){ this.name = name;}

    String eat(){
        return "Munch";
    }

    String move(){
        return "Forward ho!";
    }
}
