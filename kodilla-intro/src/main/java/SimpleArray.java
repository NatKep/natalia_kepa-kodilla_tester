public class SimpleArray {
    public static void main (String[] args) {
        String[] planets = new String[5];
        planets[0] = "Mercury";
        planets[1] = "Venus";
        planets[2] = "Earth";
        planets[3] = "Mars";
        planets[4] = "Jupiter";

//    Wyciąganie elementu z tablicy
    String fourthPlanet = planets[4];
    System.out.println(fourthPlanet);

//    Sprawdzanie liczby elementów w tablicy
    int numberOfPlanets = planets.length;
    System.out.println(numberOfPlanets);

//    Pętle for
    for (int i = 0; i < planets.length; i++ ) {
        System.out.println(planets[i]);
    }

    for (int i = planets.length - 1; i >= 0; i-- ) {
        System.out.println(planets[i]);
    }


    }
}
