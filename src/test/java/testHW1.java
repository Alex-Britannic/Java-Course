import org.junit.Assert;
import org.junit.Test;

public class testHW1 {

    @Test
   public void testHW1_moneyToReturn_200() {

        double exp = 200.0;
        double act = HW1.moneyToReturn(1);

        Assert.assertEquals(exp, act, 0);

    }

    @Test
    public void testHW1_moneyToReturn_800() {

        double exp = 800.0;
        double act = HW1.moneyToReturn(6);

        Assert.assertEquals(exp, act, 0);
    }

    @Test
    public void testHW1_moneyToReturn_1000() {

        double exp = 1000.0;
        double act = HW1.moneyToReturn(10);

        Assert.assertEquals(exp, act, 0);
    }
}

