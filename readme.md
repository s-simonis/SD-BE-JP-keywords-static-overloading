# Opdrachten
_Oefenen met keywords, overloading en static_

Alle opdrachten en stappen staan in dit document beschreven. De opdrachten gaan ervan uit dat je EdHub hebt bestudeerd.

## Opdracht 1
Gegeven:
 * package nl.novi.javaprogrammeren.one
 * MainOne.java
 * Person.java

Voeg het volgende op regel 8 toe in MainOne.java: `henry.setFullName("Sjaak", "van der", "Vlekkermans");`

Je krijgt nu een foutmelding. Dat komt omdat de huidige methode setFullName maar _twee_ parameters ontvangt. Overload
deze methode zodat deze er drie kan ontvangen. Pas de huidige setFullName dus niet aan!

## Opdracht 2
Gegeven:
 * package nl.novi.javaprogrammeren.two
 * MainTwo.java
 * Animal.java
 
Maak een klasse Dog aan die Animal extends. Voeg de volgende methode aan Animal toe: `public abstract void pet();`.
Beide toevoegingen geven errors. Los deze op door iets in Animal aan te passen.

Breid Dog vervolgens uit en instantieer deze. Print het aantal poten en zijn naam uit.

## Opdracht 3
Gegeven:
 * package nl.novi.javaprogrammeren.three
 * MainThree.java
 * Beer.java

### Opdracht 3a
Zorg ervoor dat elke keer dat een bier object wordt aangemaakt de volgende tekst wordt uitgeprint: 
_"Er is weer een biertje getapt!"_ 

### Opdracht 3b
Ga nu bijhouden hoeveelste biertje het is dat getapt wordt. Pas bovenstaande string aan naar:
_"Dit is biertje nummer: " + hier-het-nummer_

### Opdracht 3c
Voeg deze code toe aan MainThree.java en zorg ervoor dat de code gaat werken.
`System.out.println("Aantal biertjes getapt: " + Beer.getTappedBeersAmount());`

### Opdracht 3d
Voeg deze code toe aan MainThree.java en zorg ervoor dat de code weer gaat werken.
`System.out.println("Aantal biertjes getapt: " + heinekenBier.getAmountOfBeersTapped());`

## Opdracht 4
_Uitdagend_
Gegeven:
 * package nl.novi.javaprogrammeren.four
 * MainFour.java
 * Human.java

De volgende regels gelden voor deze opdracht:
 * Er mogen geen aanpassingen gedaan worden in Human
 * HumanMaker mag alleen maar static methods hebben. Dit wordt ook afgedwongen. Hoe?
 
Opdracht:
 * Maak via MainFour een Human object aan
 * Print de naam van het Human object uit.
 