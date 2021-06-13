package nl.novi.javaprogrammeren.three;

public class Beer {
    private String brand;
    private static int numberOfBeers = 0;

    public Beer(String brand) {
        this.brand = brand;
        numberOfBeers++;
        System.out.println("Dit is biertje nummer: " + numberOfBeers);
    }

    public static int getTappedBeersAmount() {
        return numberOfBeers;
    }

    public int getAmountOfBeersTapped() {
        return numberOfBeers;
    }
}
