

public class Dzielenie {
    int a,b;

    public Dzielenie(int a, int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public String toString() {
        return "Dzielenie{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int podziel(){
        System.out.println(this.toString());
        if (b==0){
            //System.out.println("Nie mozna dzielic przez 0"); //wyjątek
            throw new IllegalArgumentException("Nie można dzielić przez 0");
            //return 0;
        }
        if(a<0||b<0){
            System.out.println("Liczby muszą być nieujemne!");//wyjątek
            return 0;
        }
        int ilerazysiemiesci=1;
        int c=b;
        if (a==b) return 1;
        else if (a<b) return 0;
        else{
            while (a>=b) {
                c += b;
                if(c-a>0) return ilerazysiemiesci;
                else ilerazysiemiesci++;
            }
            return ilerazysiemiesci;
        }
    }
}
