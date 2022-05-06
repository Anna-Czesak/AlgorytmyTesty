import org.junit.Assert;
import org.junit.Test;

public class PairsTest {
    @Test
    public void car_sprawdzenie(){
        int a=3;
        int b=4;

        Pairs c= new Pairs();
        c. cons( a,  b);
        int result = c.car();

        Assert.assertEquals(3, result);
    }
    @Test
    public void cdr_sprawdzenie(){
        int a=3;
        int b=4;

        Pairs c= new Pairs();
        c. cons( a,  b);
        int result = c.cdr();

        Assert.assertEquals(4, result);
    }
}