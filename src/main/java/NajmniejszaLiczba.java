public class NajmniejszaLiczba {
    int []tab;
    public NajmniejszaLiczba(int []t){
        tab=t;
    }
    public int findTheSmallest() {
        int szukana = 1;

            for (int i = 0; i <tab.length ; i++) {
                if(tab[i]>szukana) break;
                else {
                    szukana+=tab[i];
                }
            }
        return szukana;
    }
}
/*
roblem 224
Ten problem został zapytany przez Amazon.
Biorąc pod uwagę posortowaną tablicę, znajdź najmniejszą dodatnią liczbę całkowitą, która nie jest sumą podzbioru tablicy.
Na przykład dla danych wejściowych należy zwrócić .[1, 2, 3, 10]7
 */