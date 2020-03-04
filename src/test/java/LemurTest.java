
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LemurTest {

   private  Lemur lemur;

    @Before
    public void setUp() throws Exception {
        lemur = new Lemur();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isTailStriped() {
        boolean result = lemur.isTailStriped();
        Assert.assertEquals(true , false);

    }

}