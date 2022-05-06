import org.junit.Assert;
import org.junit.Test;

public class MonetyTest {

    @Test
    public void iloscMonet_zero(){
        Monety a=new Monety();

        int result=a.iloscMonet(0);

        Assert.assertEquals(0, result);
    }
    @Test
    public void iloscMonet_16(){
        Monety a=new Monety();

        int result=a.iloscMonet(16);

        Assert.assertEquals(3, result);
    }
    @Test
    public void iloscMonet_4(){
        Monety a=new Monety();

        int result=a.iloscMonet(4);

        Assert.assertEquals(4, result);
    }
}
