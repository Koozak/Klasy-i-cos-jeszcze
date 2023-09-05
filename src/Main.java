import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    //LOSOWANIE SZEŚCIU LICZB

        //wylosowane liczby zapiszemy w tablicy
        //tablica w Javie może zawierać tylko typy proste i złożone
        System.out.println("witamy,wylosujemy 6 liczb");
        int wylosowana [] = new int[6];
        for (int i = 0; i < wylosowana.length;i++){
            wylosowana[i] = (int)(Math.random()*100+1);
            System.out.println(wylosowana[i]);
        }
        //losowanie liczb do kolekcji
        /*
        kolekcja:
        listy - ArrayList,LinkerList elementy uporządkowane,indeksowane,mogą się powtarzać
        set-HashSet,elementy najczęściej nieindeksowane,nieuporządkowane,nie mogą się powtarzać
         */
        System.out.println("losowanie 5 licz do listy");
        HashSet<Integer> wylosowaneLiczby = new HashSet<>();
        Integer liczba;//typ złożony liczba to obiekt ma metody
        int liczba2;//typ prosty liczba 2 nie ma metod tylko zmienna
        while (wylosowaneLiczby.size()<6){
            int liczbaLosowana = (int)(Math.random()*10+1);
            wylosowaneLiczby.add(liczbaLosowana);
        }
        System.out.println("wylosowane Liczby"+wylosowaneLiczby);
        //wczytywanie 6 liczb z klawiatury bez powtórzeń
        ArrayList<Integer>wczytywaneLiczby = new ArrayList<>();
        Scanner klawiatura = new Scanner(System.in);
        for (int i =0;i <6;i++){
            System.out.println("podaj "+i+" liczbę");
            int liczbaWpisana = klawiatura.nextInt();
            while (wczytywaneLiczby.contains(liczbaWpisana)){
                System.out.println("podaj inną liczbę");
                liczbaWpisana = klawiatura.nextInt();
            }
            wczytywaneLiczby.add(liczbaWpisana);
        }
        System.out.println("Wczytywane liczby "+wczytywaneLiczby);

    }

}