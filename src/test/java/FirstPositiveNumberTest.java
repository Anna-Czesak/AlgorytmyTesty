
import org.junit.Assert;
import org.junit.Test;

public class FirstPositiveNumberTest {

    @Test
    public void findFirstPositiveNumber_pusta(){ //dla pustej tablicy
        int n=0;
        int []numbers=new int[0];

        FirstPositiveNumber a=new FirstPositiveNumber(n, numbers);

        int result = a.findFirstPositiveNumber();

        Assert.assertEquals(1,result);
    }
    @Test
    public void findFirstPositiveNumber_pomieszane(){ //dla pustej tablicy
        int n=4;
        int []numbers= {3, 4, -1, 1};

        FirstPositiveNumber a=new FirstPositiveNumber(n, numbers);

        int result = a.findFirstPositiveNumber();

        Assert.assertEquals(2,result);
    }
    @Test
    public void findFirstPositiveNumber_rozne(){ //dla pustej tablicy
        int n=3;
        int []numbers= {1,2,5};

        FirstPositiveNumber a=new FirstPositiveNumber(n, numbers);

        int result = a.findFirstPositiveNumber();

        Assert.assertEquals(3,result);
    }
    @Test
    public void findFirstPositiveNumber_jedna(){ //dla jednej liczby
        int n=1;
        int []numbers= {1};

        FirstPositiveNumber a=new FirstPositiveNumber(n, numbers);

        int result = a.findFirstPositiveNumber();

        Assert.assertEquals(2,result);
    }
    @Test
    public void findFirstPositiveNumber_ujemne(){ //dla pustej tablicy
        int n=2;
        int []numbers= {-1, -2};

        FirstPositiveNumber a=new FirstPositiveNumber(n, numbers);

        int result = a.findFirstPositiveNumber();

        Assert.assertEquals(1,result);
    }
}
