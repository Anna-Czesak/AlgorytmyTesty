import org.junit.Assert;
import org.junit.Test;

public class DzielenieTest {

    @Test
    public void podziel_sprawdzenie_a_wieksze(){

        //given
        int a=3;
        int b=2;
        Dzielenie c= new Dzielenie(a,b);

        //when
        int result = c.podziel();
        //then
        Assert.assertEquals(1,result);

    }
    @Test
    public void podziel_sprawdzenie_b_wieksze(){

        //given
        int a=2;
        int b=3;
        Dzielenie c= new Dzielenie(a,b);

        //when
        int result = c.podziel();

        //then
        Assert.assertEquals(0,result);

    }
    @Test
    public void podziel_sprawdzenie_rowne(){

        //given
        int a=3;
        int b=3;
        Dzielenie c= new Dzielenie(a,b);

        //when
        int result = c.podziel();

        //then
        Assert.assertEquals(1,result);

    }
   /* @Test
    public void podziel_sprawdzenie_b_zero(){

        //given
        int a=2;
        int b=0;
        Dzielenie c= new Dzielenie(a,b);

        //when
        int result = c.podziel();

        //then
        Assert.assertEquals(0,result);

    }*/


    @Test
    public void podziel_sprawdzenie_liczby_niedodatnie(){
        //given
        int a=-2;
        int b=-1;
        Dzielenie c=new Dzielenie(a,b);

        //when
        int result=c.podziel();

        //then
        Assert.assertEquals(0, result);

    }
}
