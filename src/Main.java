import java.util.*;

public class Main {
    private static Set<Integer> wylosuj() {
        System.out.println("losowanie 5 licz do listy");
        HashSet<Integer> wylosowaneLiczby = new HashSet<>();
        Integer liczba;//typ złożony liczba to obiekt ma metody
        int liczba2;//typ prosty liczba 2 nie ma metod tylko zmienna
        while (wylosowaneLiczby.size() < 6) {
            int liczbaLosowana = (int) (Math.random() * 10 + 1);
            wylosowaneLiczby.add(liczbaLosowana);
        }
        return wylosowaneLiczby;
    }

    private static ArrayList<Integer> wczytaj() {
        Scanner klawiatura = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("podaj " + i + " liczbę");
            int liczbaWpisana = klawiatura.nextInt();
            while (wczytywaneLiczby.contains(liczbaWpisana)) {
                System.out.println("podaj inną liczbę");
                liczbaWpisana = klawiatura.nextInt();

            }
            wczytywaneLiczby.add(liczbaWpisana);
        }
        return wczytywaneLiczby;
    }

    public static void main(String[] args) {
        Set<Integer> wylosowaneLiczby = wylosuj();
        System.out.println("wylosowane Liczby" + wylosowaneLiczby);
        //wczytywanie 6 liczb z klawiatury bez powtórzeń
        ArrayList<Integer> wczytywaneLiczby = wczytaj();

        System.out.println("Wczytywane liczby " + wczytywaneLiczby);
        //trafione
        List<Integer> trafione = new LinkedList<>();
        for (Integer wylosow : wylosowaneLiczby) {
            if (wczytywaneLiczby.contains(wylosow)) {
                trafione.add(wylosow);
            }
        }
        System.out.println("trafione liczby " + trafione);

    }
}
