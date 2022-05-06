public class ModyfikacjaLiczby {
    int []liczby;
    public ModyfikacjaLiczby(int []tab){
        liczby=tab;
    }
    public boolean check(){
        int check=0;
        for (int i=1; i<liczby.length;i++){
            if(liczby[i]<liczby[i-1]) check++;
        }
        if (check<=1) {
            System.out.println("Da się osiągnąć tablicę niemalejącą poprzez zmianę jednego elementu");
            return true;
            }
        else {
            System.out.println("Nie da się osiągnąć tablicy niemalejącej poprzez zmianę jednego elementu");
            return false;
        }
    }

}
/*
Problem 79
O ten problem zapytał Facebook.
Biorąc pod uwagę tablicę liczb całkowitych, napisz funkcję, aby określić,
czy tablica może stać się nie malejąca przez modyfikację co najwyżej 1 elementu.
Na przykład, biorąc pod uwagę tablicę , powinieneś zwrócić true, ponieważ możemy zmodyfikować 10 na 1,
aby tablica nie zmniejszała się.[10, 5, 7]
Biorąc pod uwagę tablicę, należy zwrócić wartość false, ponieważ nie możemy zmodyfikować żadnego elementu,
aby uzyskać tablicę nie malejącą.[10, 5, 1]
*/