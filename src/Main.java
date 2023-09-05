import java.util.ArrayList;

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
        ArrayList<Integer>wylosowaneLiczby = new ArrayList<Integer>();
        Integer liczba;//typ złożony liczba to obiekt ma metody
        int liczba2;//typ prosty liczba 2 nie ma metod tylko zmienna
        while (wylosowaneLiczby.size()<6){
            int liczbaLosowana = (int)(Math.random()*100+1);
            wylosowaneLiczby.add(liczbaLosowana);
        }
        System.out.println("wylosowane Liczby"+wylosowaneLiczby);

    }

}