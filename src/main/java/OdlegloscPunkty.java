public class OdlegloscPunkty {
    Punkt [] tab;
    Punkt central;
    int k=1; //ilosc najblizszych punktów

    public OdlegloscPunkty(Punkt []tab, Punkt central){
        this.tab=tab;
        this.central=central;
    }

    public Punkt [] find(){
        Punkt[]result=new Punkt[k];//tablica na najblizsze punkty
        double [] distances = new double[tab.length];
        double min =10000000;
        int j= 0; //element tablicy tab, z najmniejsza odlegloscia

        for(int i=0; i<tab.length;i++){
            distances[i]=central.calculateDistance(tab[i]);
           // System.out.format("Odległość: "+distances[i]+"\n");
        }
        for(int i=0; i<k;i++){
            if (distances[i]<min){
                min=distances[i];
                j=i;
            }
        }
        result[0]=tab[j];

        return result;
    }

}
/*
Biorąc pod uwagę listę punktów, punkt centralny i liczbę całkowitą k,
znajdź najbliższe punkty k od punktu centralnego.
Na przykład, biorąc pod uwagę listę punktów , punkt centralny i , zwróć .[(0, 0), (5, 4), (3, 1)](1, 2)k = 2[(0, 0), (3, 1)]
 */