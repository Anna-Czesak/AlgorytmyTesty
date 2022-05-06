public class Main {
    static public void main(String[] args) {
        //ALGORYTM NR 4
        //znajdowanie pierwszej dodatniej brakujacej liczby tablicy

        System.out.println("PROBLEM 4");
        int tab []={3, 4, -1, 1};
        FirstPositiveNumber a = new FirstPositiveNumber(4, tab);
        System.out.println("Pierwsza dodatnia brakująca liczba to: "+a.findFirstPositiveNumber());

        //ALGORYTM NR 5
        //pierwszy i drugi element pary
        /*
        System.out.println("PROBLEM 5");
        cons(a, b) konstruuje parę, a car(pair) i cdr(pair)
        zwracają pierwszy i ostatni element tej pary.
        Na przykład funkcja car(cons(3, 4)) zwraca wartość 3,
        a wartość cdr(cons(3, 4)) zwraca wartość 4.

        Pairs b = new Pairs();
        b.cons(1,2);
        System.out.println("Pierwszy element z pary:"+b.car());
        System.out.println("Drugi element z pary:"+b.cdr()); */

        //ALGORYTM 88
        // dzielenie bez operatora dzielenia


        System.out.println("PROBLEM 88");
        Dzielenie c = new Dzielenie(10,2);
        try{
            System.out.println("wynik dzielenia to: " + c.podziel());
        }
       catch (IllegalArgumentException exception){
           System.out.println("Zmieniam niedopuszczalne 0 na 1");
            Dzielenie c2 = new Dzielenie (c.a, 1);
           System.out.println("wynik dzielenia to: " + c2.podziel());
        }


        //ALGORYTM 70
        //cyfra1+cyfra2 maja dawać 10
/*
        System.out.println("PROBLEM 70");
        LiczbaDoskonala d = new LiczbaDoskonala();
        System.out.println("Liczba doskonała to:" +d.liczbadosk(2));
*/
        //ALGORYTM 79
        //zmodyfikowanie jednej liczby w tablicy tak aby byla ona rosnaca

        /*
        System.out.println("PROBLEM 79");
        int tab[]={10, 5, 7};
        ModyfikacjaLiczby e=new ModyfikacjaLiczby(tab);
        e.check();
        int tab2[]={10, 5, 1};
        ModyfikacjaLiczby f=new ModyfikacjaLiczby(tab2);
        f.check();
        */

        //ALGORYTM 129
        //pierwiastek z liczby
        /*
        System.out.println("PROBLEM 129");
        Pierwiastek g = new Pierwiastek(2);
        g.findSqrt();
        */

        //ALGORYTM 138
        //ile banknotów wykorzystamy do danej kwoty
        /*
        System.out.println("PROBLEM 138");
        Monety h= new Monety();
        int kwota =100;
        System.out.println(" ilosc monet przedstawiajacą kwote " +kwota+ " to: "+ h.iloscMonet(kwota));
        */

        //Algorytm 150
        //punkt najbliższy podanemu punktowi
        //[(0, 0), (5, 4), (3, 1)](1, 2)k = (0, 0)

        /*
        System.out.println("PROBLEM 150");
        Punkt a = new Punkt(0,0);
        Punkt b=new Punkt(5, 4);
        Punkt c=new Punkt(3,1);
        Punkt centralny= new Punkt(1,2);
        Punkt [] tab={a, b, c};
        int k=2;
        OdlegloscPunkty i = new OdlegloscPunkty(tab, centralny);
        System.out.println("Pierwszy najbliższy punkt to: ( "+i.find()[0].x + ", " + i.find()[0].y +" )");
        */


        //ALGORYTM 224
        //najmniesza liczba ktorej sumy nie da sie trzymac z liczb z tablicy
        /*
        System.out.println("PROBLEM 224");
        int []tab={1, 2, 3, 10};
        NajmniejszaLiczba j = new NajmniejszaLiczba(tab);
        System.out.println("Najmniejsza liczba ktoróej sumy nie da sie otrzymac z podzbioru to: "+j.findTheSmallest());
        */

    }
}
