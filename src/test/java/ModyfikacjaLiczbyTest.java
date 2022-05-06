import org.junit.Assert;
import org.junit.Test;

public class ModyfikacjaLiczbyTest {

    @Test
    public void check_sprawdzenie_true(){
        int [] liczby={10, 5, 7};

        ModyfikacjaLiczby a= new ModyfikacjaLiczby(liczby);
        boolean result = a.check();

        Assert.assertEquals(true, result);
    }
    @Test
    public void check_sprawdzenie_false(){
        int [] liczby={10, 5, 1};

        ModyfikacjaLiczby a= new ModyfikacjaLiczby(liczby);
        boolean result = a.check();

        Assert.assertEquals(false, result);
    }
    @Test
    public void check_sprawdzenie_ujemne(){
        int [] liczby={10, 5, -3};

        ModyfikacjaLiczby a= new ModyfikacjaLiczby(liczby);
        boolean result = a.check();

        Assert.assertEquals(false, result);
    }
}
