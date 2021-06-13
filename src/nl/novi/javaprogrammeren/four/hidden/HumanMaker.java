package nl.novi.javaprogrammeren.four.hidden;

public final class HumanMaker {

    private HumanMaker() {}

    public static Human makeHuman(String name) {
        return new Human(name);
    }

    public static String getName(Human human) {
        String name = human.getName();
        return name;
    }
}
