import org.junit.Assert;
import org.junit.Test;

public class OdlegloscPunktyTest { //nie działa
   // @Test
    public void find_sprawdzenie(){

        Punkt a = new Punkt(0,0);
        Punkt b=new Punkt(5, 4);
        Punkt c=new Punkt(3,1);
        Punkt centralny= new Punkt(1,2);
        Punkt [] tab={a, b, c};

        OdlegloscPunkty d =new OdlegloscPunkty(tab, centralny);
        Punkt []result = d.find();

        Punkt e = new Punkt(0,0);
        Punkt [] tab2 ={e};
        Assert.assertEquals(tab2[0], result[0]);
    }
}
