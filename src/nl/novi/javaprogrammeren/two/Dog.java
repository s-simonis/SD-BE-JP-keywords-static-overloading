package nl.novi.javaprogrammeren.two;

public class Dog extends Animal{

    public Dog(int amountOfLegs, String name) {
        super.amountOfLegs = amountOfLegs;
        super.name = name;
    }

    @Override
    public void pet() {
        System.out.println("The dog likes it!");
    }

    public void getDogInfo() {
        System.out.println("The dog has " +
                super.amountOfLegs + " legs and its name is " + super.name +".");
    }
}
