import org.junit.Assert;
import org.junit.Test;

public class PierwiastekTest {
    @Test
    public void findSqrt_sprawdzenie(){

        double n=9.0;
        Pierwiastek a=new Pierwiastek(n);
        double result=a.findSqrt();

        Assert.assertEquals(3.0,result, 0.0);

    }
}
