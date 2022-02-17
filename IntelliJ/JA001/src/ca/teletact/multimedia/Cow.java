package ca.teletact.multimedia;

public class Cow extends Animal{

    Cow(){ super(); }
    Cow(String name){ super(name); }

    @Override
    String eat() {
        return "Moo choo";
    }

    @Override
    String move() {
        return "clomp clud";
    }
}
