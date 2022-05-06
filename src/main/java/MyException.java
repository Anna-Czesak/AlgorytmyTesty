public class MyException extends Exception {
    String a;
    public MyException(){
    }
    public MyException(String a){
        super(a);
        this.a=a;
    }
}

