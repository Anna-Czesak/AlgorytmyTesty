import org.junit.Assert;
import org.junit.Test;

public class NajmniejszaLiczbaTest {
    @Test
    public void findTheSmallest_sprawdzenie(){
        int [] liczby={1, 2, 3, 10};//7

        NajmniejszaLiczba a = new NajmniejszaLiczba(liczby);
        int result = a.findTheSmallest();

        Assert.assertEquals(7, result);
    }
}
