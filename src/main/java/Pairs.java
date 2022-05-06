public class Pairs {

    int a, b;

    void cons(int a, int b){ //konstruowanie pary
        this.a=a;
        this.b=b;
    }
    public int car(){ //pierwszy element z pary
        return a;
    }
    public int cdr(){ //drugi element z pary
        return b;
    }
}
