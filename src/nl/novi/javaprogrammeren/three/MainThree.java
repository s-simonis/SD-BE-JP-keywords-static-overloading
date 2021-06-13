package nl.novi.javaprogrammeren.three;

public class MainThree {
    public static void main(String[] args) {
        Beer amstelBier = new Beer("Amstel");
        Beer brandBier = new Beer("Brand");
        Beer heinekenBier = new Beer("Heineken");

        System.out.println("Aantal biertjes getapt: " + Beer.getTappedBeersAmount());
        System.out.println("Aantal biertjes getapt: " + heinekenBier.getAmountOfBeersTapped());
    }
}
