package ca.teletact.multimedia;

public class Goat extends Animal{

    Goat(){ super(); }
    Goat(String name){ super(name); }

    @Override
    String eat() {
        return "chewy chew";
    }

    @Override
    String move() {
        return "clipidy clop";
    }
}
