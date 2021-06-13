package nl.novi.javaprogrammeren.four;

import nl.novi.javaprogrammeren.four.hidden.Human;
import nl.novi.javaprogrammeren.four.hidden.HumanMaker;

public class MainFour {
    public static void main(String[] args) {
        Human pietje = HumanMaker.makeHuman("Pietje");
        System.out.println("A new human was made: "+HumanMaker.getName(pietje));
    }
}
