import java.util.Arrays;
import java.util.Scanner;

public class FirstPositiveNumber { //zad 4

    int n;
    int []numbers;// = new int[n];

    public FirstPositiveNumber(int n, int[]numbers){
        this.n=n;
        this.numbers=numbers;
    }

    public int findFirstPositiveNumber(){
        //System.out.println(this.toString());
        int x=0;

        Arrays.sort(numbers);

        int j=1;

        if (n>1){
            for (int i=0; i<n;i++){
                if (numbers[i] ==j){
                    j++;
                    if(j==n)return j;
                    //jesli skoncza sie ele do porównywania
                }
                else if (numbers[i] >j) return j;
                else continue;
            }
        }
        else if(n==0) return 1; //jesli tablica jest pusta

        else {              //dla tablic jednoelementowych
            if (numbers[0]<j)return j;
            else if(numbers[0]==j) return j+1;
            else return numbers[0]+1;
        }
        return 1;
    }

    /*Biorąc pod uwagę tablicę liczb całkowitych,
    znajdź pierwszą brakującą dodatnią liczbę całkowitą
    w czasie liniowym i stałej przestrzeni.
    Innymi słowy, znajdź najniższą dodatnią liczbę całkowitą,
    która nie istnieje w tablicy. Tablica może również zawierać
    duplikaty i liczby ujemne.Na przykład wejście [3, 4, -1, 1] powinno dać 2.
    Wejście [1, 2, 0] powinno dać 3.Tablicę wejściową można modyfikować w miejscu.*/


}
