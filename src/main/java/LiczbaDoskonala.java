public class LiczbaDoskonala {
    int n;

    public int liczbadosk(int n){
        this.n =n;
            int d= 10-n;
            return n*10 + d;
    }
}
/*
Problem 70
Liczba jest uważana za idealną, jeśli jej cyfry sumują się dokładnie do 10.
Biorąc pod uwagę dodatnią liczbę całkowitą n, zwróć n-tę liczbę doskonałą.
Na przykład, biorąc pod uwagę 1, powinieneś zwrócić 19. Biorąc pod uwagę 2, powinieneś zwrócić 28
* */