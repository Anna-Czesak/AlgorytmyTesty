public class Monety {

int []monety={25, 10, 5 ,1};
public Monety(){}

    public int iloscMonet(int kwota){
    int ilosc=0;

    for (int i=0; i<4;i++){
        if(kwota<monety[i])continue;
        else if(kwota>monety[i]){//ile razy sie miesci?
            int ile=kwota/monety[i];
           // System.out.format("%d / %d = %d", kwota, monety[i], ile);
            ilosc+=ile;
            kwota-=ile*monety[i];
        }
        else { //działaS
            ilosc+=1; return ilosc;
        }
    }
   return ilosc;
    }


}
/* Algorytm 138
Ten problem został zapytany przez Google.
Znajdź minimalną liczbę monet wymaganą do zarobienia n centów.
Możesz użyć standardowych amerykańskich nominałów, czyli 1¢, 5¢, 10¢ i 25¢.
Na przykład, biorąc pod uwagę n = 16, zwróć 3, ponieważ możemy to zrobić z 10 ¢, 5 ¢ i 1 ¢
 */