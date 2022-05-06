public class Punkt {
    int x,y;
    public Punkt(int x, int y){
        this.x=x;
        this.y=y;
    }
    public double calculateDistance(Punkt drugi){ //obliczanie odległości między punktem a podanym punktem
       double distance  = Math.sqrt((this.x-drugi.x)*(this.x-drugi.x)+(this.y-drugi.y)*(this.y-drugi.y));
        return distance ;
    }
    public void show(){
        System.out.println("x: "+x+" y: "+y);
    }
}
