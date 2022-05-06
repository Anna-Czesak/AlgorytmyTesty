public class Pierwiastek {
    double n;
    public Pierwiastek(double n){
        this.n=n;
    }
    public double  findSqrt(){
        double result = Math.sqrt(n);
        System.out.println("Pierwiastek z liczby "+n+" to: "+result);
        return result;
    }
}
/*
Problem 129
Biorąc pod uwagę liczbę rzeczywistą n,
znajdź pierwiastek kwadratowy z n. Na przykład, podane n = 9, zwróć 3.
 */