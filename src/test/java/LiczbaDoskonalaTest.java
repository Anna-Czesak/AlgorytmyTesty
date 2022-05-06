import org.junit.Assert;
import org.junit.Test;

public class LiczbaDoskonalaTest {

    @Test
    public void liczbadosk_sprawdzenie(){

        int n=2;
        LiczbaDoskonala a=new LiczbaDoskonala();

        int result=a.liczbadosk(n);
        Assert.assertEquals(28,result);
    }
}
